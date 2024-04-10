package my.game;

public class Tournament {
    private Competition[] competitions;
    private static final int MAX_COMPETITIONS = 10;

    public Tournament() {
        this.competitions = new Competition[MAX_COMPETITIONS];
    }
    
    public void addCompetition(Competition competition) {
        for (int i = 0; i < competitions.length; i++) {
            if (competitions[i] == null) {
                competitions[i] = competition;
                return;
            }
        } System.out.println("No more space!");    
    }
}
