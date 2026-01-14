public class Game {

    private ComputerPlayer computerPlayer = new ComputerPlayer();
    private Choice computerChoice;
    private int playerScore;
    private int computerScore;
    private int maxRounds;

    public Game(int maxRounds) {
        this.maxRounds = maxRounds;
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
        return playerScore == maxRounds / 2 + 1 || computerScore == maxRounds / 2 + 1;
    }

    public boolean didPlayerWin() {
        return playerScore == maxRounds / 2 + 1;
    }

    public void reset() {
        this.playerScore = 0;
        this.computerScore = 0;
    }
}
