public class Game {

    private ComputerPlayer computerPlayer = new ComputerPlayer();
    private Choice computerChoice;
    private int playerScore;
    private int computerScore;
    private int maxWins;

    public Game(int maxWins) {
        this.maxWins = maxWins;
    }

    public Result playRound(Choice playerChoice) {

        this.computerChoice = computerPlayer.makeMove();

        if (playerChoice == computerChoice) {
            return Result.TIE;
        }
        if (playerChoice.beats(computerChoice)) {
            playerScore++;
            return Result.WIN;
        } else {
            computerScore++;
            return Result.LOSE;
        }
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public Choice getComputerChoice() {
        return computerChoice;
    }

    public boolean isGameOver() {
        int winsNeeded = maxWins / 2 + 1;
        return playerScore == winsNeeded || computerScore == winsNeeded;
    }

    public boolean didPlayerWin() {
        return playerScore == maxWins / 2 + 1;
    }

    public void reset() {
        this.playerScore = 0;
        this.computerScore = 0;
    }
}
