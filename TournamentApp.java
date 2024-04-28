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
        team2.addPlayer(player3);
        team2.addPlayer(player4);

        Referee referee = new Referee("aqd", "Kader Nouni");

        Competition competition = new Competition(team1, team2, referee, 12, 5, 2019, 9, 5);
        competition.setScore(4, 3);

        Competition competition2 = new Competition(team2, team1, referee, 12, 9, 2019, 14, 0);
        Competition competition3 = new Competition(team1, null, referee, 1, 9, 2019, 9, 5);

        Tournament tournament = new Tournament();

        tournament.addCompetition(competition);
        tournament.addCompetition(competition2);
        tournament.addCompetition(competition3);
    }
}
