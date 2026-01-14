public class Game {

    private ComputerPlayer computerPlayer;
    private int playerScore;
    private int computerScore;

    public Result playRound(Choice playerChoice){

        Choice computerChoice = computerPlayer.makeMove();

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
}
