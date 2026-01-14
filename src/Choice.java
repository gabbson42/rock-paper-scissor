public enum Choice {

    ROCK,
    PAPER,
    SCISSORS;

    public boolean beats(Choice other){

        if (this == ROCK && other == SCISSORS) return true;
        if (this == PAPER && other == ROCK) return true;
        if (this == SCISSORS && other == PAPER) return true;
        return false;
    }
}
