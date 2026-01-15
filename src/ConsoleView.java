import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleView implements IView{

    private Scanner input = new Scanner(System.in);

    @Override
    public void displayWelcome() {
        IO.println("Welcome to the ROCK, PAPER, SCISSORS Game!\n");
    }

    @Override
    public String displayMenu() {

        while(true) {
            IO.println("1. Play" +
                    "\n2. Show Rules" +
                    "\n3. Show Credits" +
                    "\n0. Exit");
            try {
                int choice = input.nextInt();
                input.nextLine();

                if (choice == 1) return "play";
                if (choice == 2) return "rules";
                if (choice == 3) return "credits";
                if (choice == 0) return "exit";
                else {
                    displayError();
                }
            } catch (InputMismatchException e) {
                displayError();
            }
        }
    }

    @Override
    public void displayRules() {

        IO.println("Pick a \"tool\" between ROCK, PAPER OR SCISSORS and duke it out against the computer." +
                "\nROCK beats SCISSORS, PAPER beats ROCK and SCISSORS beat PAPER." +
                "\nPress enter to go back to the menu.");
        IO.println();

        input.nextLine();
    }

    @Override
    public void displayCredits() {

        IO.println("Game made by:" +
                "\nGabriel Landvik Åkerman" +
                "\nGuido Roos" +
                "\nSimon Fredholm" +
                "\nPress enter to go back to the menu.");
        IO.println();
        input.nextLine();
    }


    @Override
    public void displayResult(Result result) {

        if (result == Result.WIN) IO.println("You win this round!");
        if (result == Result.LOSE) IO.println("You lose this round!");
        if (result == Result.TIE) IO.println("It was a tie!");
    }

    @Override
    public void displayScore(int playerScore, int computerScore) {
        IO.println("The score is:" +
                "\n- Player: " + playerScore +
                "\n- Computer: " + computerScore);
    }

    @Override
    public void displayChoice(Choice playerChoice, Choice computerChoice){
        IO.println("You chose " + playerChoice + " and the computer chose " + computerChoice + ".");
    }

    @Override
    public Choice getPlayerChoice() {

        while(true) {
            IO.println("Choose your weapon with the corresponding number! Type 0 to exit anytime." +
                    "\n ROCK(1), PAPER(2) OR SCISSOR(3)?");
            try {
                int choice = input.nextInt();
                if (choice == 1) return Choice.ROCK;
                if (choice == 2) return Choice.PAPER;
                if (choice == 3) return Choice.SCISSORS;
                if (choice == 0) return null;
                else{
                    displayError();
                }
            } catch (InputMismatchException e) {
                input.nextLine();
                displayError();
            }
        }
    }

    @Override
    public boolean displayGameWinner(boolean playerWon){

        while(true) {
            if (playerWon) {
                IO.println("You won the game! Want to play again? (y/n)");
            } else {
                IO.println("You lost the game! Want to play again? (y/n)");
            }

            String choice = input.next();

            if (choice.equalsIgnoreCase("y")) return true;
            if (choice.equalsIgnoreCase("n")) return false;
            else{
                displayError();
            }
        }
    }

    private void displayError() {
        IO.println("Wrong input detected, try again!");
    }

    @Override
    public void displayGoodbye(){
        IO.println("Have a good day and welcome back another time!");
    }

    @Override
    public void close() {
        input.close();
    }
}
