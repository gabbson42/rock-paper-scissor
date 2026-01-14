public interface IView {

    void displayWelcome();
    void displayResult(Result result);
    void displayScore(int playerScore, int computerScore);
    void displayChoice(Choice playerChoice, Choice computerChoice);
    Choice getPlayerChoice();
    boolean displayGameWinner(boolean playerWon);
    void displayGoodbye();
    void close();
}
