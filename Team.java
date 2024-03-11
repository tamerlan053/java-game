package my.game;

public class Team {
    private Sport sport;
    private Player[] players ;

    public Team(Sport sport) {
        this.sport = sport;
        this.players = new Player[sport.getNumberOfPlayers()];
    }
}
