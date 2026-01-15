public class GameController {

    private Game game;
    private IView view;

    public GameController(Game game, IView view){
        this.game = game;
        this.view = view;
    }

    public void runGame(){

        view.displayWelcome();
        String choice;

        while(true) {
            choice = view.displayMenu();

            if(choice.equalsIgnoreCase("play")) {
                while(true){

                    if(game.isGameOver()){
                        if(view.displayGameWinner(game.didPlayerWin())){
                            game.reset();
                            continue;
                        }
                        else{
                            game.reset();
                            break;
                        }
                    }

                    Choice playerChoice = view.getPlayerChoice();
                    if(playerChoice == null){
                        game.reset();
                        break;
                    }
                    Result roundResult = game.playRound(playerChoice);
                    view.displayChoice(playerChoice, game.getComputerChoice());
                    view.displayResult(roundResult);
                    view.displayScore(game.getPlayerScore(), game.getComputerScore());
                }

            }
            if(choice.equalsIgnoreCase("rules")) view.displayRules();
            if(choice.equalsIgnoreCase("credits")) view.displayCredits();
            if(choice.equalsIgnoreCase("exit")) break;
        }

        view.displayGoodbye();
        view.close();
    }

    static void main() {
        Game game = new Game(3);
        IView view = new ConsoleView();
        GameController controller = new GameController(game, view);
        controller.runGame();
    }
}
