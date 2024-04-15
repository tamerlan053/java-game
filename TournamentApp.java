package my.game;

public class TournamentApp {
    public static void main(String[] args) {
        Player player1 = new Player("A12LA", "Andre Agassi", Sport.TENNIS);
        Player player2 = new Player("L96PO", "Bill Tilden", Sport.TENNIS);
        Team team1 = new Team(Sport.TENNIS);
        team1.addPlayer(player1);
        team1.addPlayer(player2);

        Player player3 = new Player("Y98RE", "Bjorn Bog", Sport.TENNIS);
        Player player4 = new Player("P11WE", "Rod Laver", Sport.TENNIS);
        Team team2 = new Team(Sport.TENNIS);
    }
}
