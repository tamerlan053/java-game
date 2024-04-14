package my.game;

public class CompetitionApp {
    public static void main(String[] args) {
        Player player1 = new Player("A12LA", "Andre Agassi", Sport.TENNIS);
        Player player2 = new Player("L96PO", "Bill Tilden", Sport.TENNIS);
        Team team1 = new Team(Sport.TENNIS);
        team1.addPLayer(player1);
        team1.addPLayer(player2);

        Player player3 = new Player("Y98RE", "Bjorn Bog", Sport.TENNIS);
        Player player4 = new Player("P11WE", "Rod Laver", Sport.TENNIS);
        Team team2 = new Team(Sport.TENNIS);
        team2.addPLayer(player3);
        team2.addPLayer(player4);

        Referee referee = Referee("tbc", "Tibo Courtois");

        Competition competition = new Competition(team1, team2, referee, 1, 9, 2007, 9, 5);
        competition.setScore(4, 3);
        System.out.println(competition.toString());
    }
}
