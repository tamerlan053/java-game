package my.game;

public class CompetitionApp {
    public static void main(String[] args) {
        Player player1 = new PLayer("A12LA", "Andre Agassi", Sport.TENNIS);
        Player player2 = new PLayer("L96PO", "Bill Tilden", Sport.TENNIS);
        Team team1 = new Team(Sport.TENNIS);
        team1.addPLayer(player1);
        team1.addPLayer(player2);

        Player player3 = new PLayer("Y98RE", "Bjorn Bog", Sport.TENNIS);
        Player player4 = new PLayer("P11WE", "Rod Laver", Sport.TENNIS);
        Team team2 = new Team(Sport.TENNIS);
    }
}
