public class Game {

    private ComputerPlayer computerPlayer = new ComputerPlayer();
    private Choice computerChoice;
    private int playerScore;
    private int computerScore;

    public Result playRound(Choice playerChoice){

        this.computerChoice = computerPlayer.makeMove();

        if(playerChoice == computerChoice){
            return Result.TIE;
        }
        if(playerChoice.beats(computerChoice)){
            playerScore++;
            return Result.WIN;
        }
        else {
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
}
