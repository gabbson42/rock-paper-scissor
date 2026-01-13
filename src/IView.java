public interface IView {

    void displayWelcome();

    void displayResult();
    void displayScore();
    Choice getPlayerChoice();
    void displayError();
}
