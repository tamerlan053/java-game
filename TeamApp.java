package my.game;

public class TeamApp {
    public static void main(String[] args) {
        Player player1 = new Player("A12LA", "Andre Agassi", Sport.TENNIS);
        Player player2 = new Player("L96PO", "Bill Tilden", Sport.TENNIS);
        Player player3 = new Player("CR7", "Cristiano Ronaldo", Sport.FOOTBALL);
        Player player4 = new Player("Y98RE", "Bjorn Bog", Sport.TENNIS);
        Player player5 = new Player("P11WE", "Rod Laver", Sport.TENNIS);

        team1.addPlayer(player1);
        System.out.println(team1);
        team2.addPlayer(player2);
        System.out.println(team2);
        team3.addPlayer(player3);
        System.out.println(team3);
        team4.addPlayer(player4);
        System.out.println(team4);
        team5.addPlayer(player5);
        System.out.println(team5);

        /* output
        Team is not full
        Incorrect
        Team in not full
        Incorrect
        Team is not full
         */
    }
}
