public interface IView {

    void displayWelcome();
    void displayResult(Result result);
    void displayScore(int playerScore, int computerScore);
    void displayChoice(Choice playerChoice, Choice computerChoice);
    Choice getPlayerChoice();
    void displayError();
    void displayGoodbye();
}
