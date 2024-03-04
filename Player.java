package my.game;

public class Player extends Person {
    private Sport sport;

    public Player(String id, String name, Sport sport) {
        super(id, name);
        this.sport = sport;
    }

    public Player(String id) {
        this(id, "", null);
    }

    public Sport getSport() {
        return sport;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        if (sport != null) {
            stringBuilder.append(" (").append(sport).append(")");
        }
        return stringBuilder.toString();
    }
}
