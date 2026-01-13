import java.util.Random;

public class ComputerPlayer {

    public Choice makeMove(){

        Random random = new Random();
        int randomNumber = random.nextInt(1,3);

        switch(randomNumber){
            case 1 -> {
                return Choice.ROCK;
            }
            case 2 -> {
                return Choice.PAPER;
            }
            case 3 -> {
                return Choice.SCISSOR;
            }
        }
        return null;
    }
}
