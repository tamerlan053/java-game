package my.game;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Competition implements DateComparable {
  private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm");
  private LocalDateTime competitionDate;
}
