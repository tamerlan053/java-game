package my.game;

public class Team {
    private Sport sport;
    private Player[] players ;

    public Team(Sport sport) {
        this.sport = sport;
        this.players = new Player[sport.getNumberOfPlayers()];
    }

    public void addPlayer(Player player) {
        if (player.getSport().equals(sport)) {
           for (int i = 0; i < players.length; i++) {
                if (players[i] == null) {
                    players[i] = player;
                    return;
                } else if (players[i].getId().equals(player.getId())) {
                    System.out.println("Incorrect");
                    return;
                }
           }
           System.out.println("Incorrect input");
        } else {
           System.out.println("Incorrect input");
        }
    }

    private boolean isPresent(Player player) {
        for (int i = 0; i < players.length; i++) {
            if (players[i].equals(player)) {
                return true;
            }
        }
        return false;
    }

    private int findFreePosition() {
        for (int i = 0; i < players.length; i++) {
            if (players[i] == null) {
                return i;
            }
        }
        return -1;
    }
}
