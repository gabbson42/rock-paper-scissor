public enum Choice {

    ROCK,
    PAPER,
    SCISSOR;

    public boolean beats(Choice other){

        if (this == ROCK && other == SCISSOR) return true;
        if (this == PAPER && other == ROCK) return true;
        if (this == SCISSOR && other == PAPER) return true;
        return false;
    }
}
