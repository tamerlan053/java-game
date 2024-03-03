package my.game;

public class Player extends Person {
    private Sport sport;

    public Player(String id, String name, Sport sport) {
        super(id, name);
        this.sport = sport;
    }
}
