package my.game;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Competition implements DateComparable {
    private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm");
    private LocalDateTime competitionDate;
    private Team team1;
    private Team team2;
    private Referee referee;
    private int scoreTeam1;
    private int scoreTeam2;

    public Competition(Team team1, Team team2, Referee referee, int day, int month, int year, int hour, int minute) {
        this.team1 = team1;
        this.team2 = team2;
        this.referee = referee;
        this.competitionDate = LocalDateTime.of(year, month, day, hour, minute);
    }

  @Override
    public long calculateMinutesAfter(LocalDateTime argument) {
        Duration duration = Duration.between(competitionDate, argument);
        return duration.toMinutes();
    }

    public boolean isPlayerIdPresent(String playerId) {
        return team1 != null && team1.isPlayerIdPresent(playerId) || team2 != null && team2.isPlayerIdPresent(playerId);
    }

    public void setScore(int scoreTeam1, int scoreTeam2) {
        this.scoreTeam1 = scoreTeam1;
        this.scoreTeam2 = scoreTeam2;
    }

    public void setCompetitionDate(LocalDateTime competitionDate) {
        this.competitionDate = competitionDate;
    }

    public LocalDateTime getCompetitionDate() {
        return competitionDate;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("%s %n", "TEAM1"));
        stringBuilder.append(team1.toString());
        stringBuilder.append(String.format("%s %n", "TEAM2"));
        stringBuilder.append(team2.toString());
        stringBuilder.append(competitionDate.format(FORMAT));
        stringBuilder.append(referee.toString());
        stringBuilder.append(String.format("%s %d %d", "SCORE", scoreTeam1, scoreTeam2));
        return stringBuilder.toString();
    }
}
