import java.util.Random;

public class ComputerPlayer {

    private Random random = new Random();

    public Choice makeMove(){

        int randomNumber = random.nextInt(1,4);

        switch(randomNumber){
            case 1 -> {
                return Choice.ROCK;
            }
            case 2 -> {
                return Choice.PAPER;
            }
            case 3 -> {
                return Choice.SCISSORS;
            }
            default -> throw new IllegalStateException("Unexpected value: " + randomNumber);
        }
    }
}
