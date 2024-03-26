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
  }
}
