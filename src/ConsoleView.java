public class ConsoleView implements IView{

    @Override
    public void displayWelcome() {
        IO.println("Welcome to the ROCK, PAPER, SCISSORS Game!\n");
    }

    @Override
    public void displayChoice(){
        IO.println("Choose your weapon!" +
                "\n ROCK(1), PAPER(2) OR SCISSOR(3)?");
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
