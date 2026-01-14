public class ConsoleView implements IView{

    @Override
    public void displayWelcome() {
        IO.println("Welcome to the ROCK, PAPER, SCISSORS Game!" +
                "\nChoose your weapon!");
    }

    @Override
    public void displayResult() {

    }

    @Override
    public void displayScore() {

    }

    @Override
    public Choice getPlayerChoice() {
        return null;
    }

    @Override
    public void displayError() {

    }
}
