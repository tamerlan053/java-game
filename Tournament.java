package my.game;

public class Tournament {
    private Competition[] competitions;
    private static final int MAX_COMPETITIONS = 10;

    public Tournament() {
        this.competitions = new Competition[MAX_COMPETITIONS];
    }
}
