public interface IView {

    void displayWelcome();
    void displayChoice();
    void displayResult();
    void displayScore();
    Choice getPlayerChoice();
    void displayError();
}
