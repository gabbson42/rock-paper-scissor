public class GameController {

    private Game game;
    private IView view;

    public GameController(Game game, IView view){
        this.game = game;
        this.view = view;
    }

    public void startGame(){

        view.displayWelcome();

        while(true){

            Choice playerChoice = view.getPlayerChoice();
            if(playerChoice == null){
                break;
            }
            Result roundResult = game.playRound(playerChoice);
            view.displayChoice(playerChoice, game.getComputerChoice());
            view.displayResult(roundResult);
            view.displayScore(game.getPlayerScore(), game.getComputerScore());
        }

        view.displayGoodbye();
    }

    static void main() {
        Game game = new Game();
        IView view = new ConsoleView();
        GameController controller = new GameController(game, view);
        controller.startGame();
    }
}
