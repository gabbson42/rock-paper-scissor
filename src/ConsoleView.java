import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleView implements IView{

    @Override
    public void displayWelcome() {
        IO.println("Welcome to the ROCK, PAPER, SCISSORS Game!\n");
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

        Scanner input = new Scanner(System.in);

        while(true) {
            IO.println("Choose your weapon with the corresponding number! Type 0 to exit anytime." +
                    "\n ROCK(1), PAPER(2) OR SCISSOR(3)?");
            try {
                int choice = input.nextInt();
                if (choice == 1) return Choice.ROCK;
                if (choice == 2) return Choice.PAPER;
                if (choice == 3) return Choice.SCISSOR;
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
    public void displayError() {
        IO.println("Wrong input detected, try again!");
    }

    @Override
    public void displayGoodbye(){
        IO.println("Have a good day and welcome back another time!");
    }
}
