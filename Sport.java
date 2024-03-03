package my.game;

public enum Sport {
  FOOTBALL(11), VOLLEYBALL(8), TENNIS(2);

  private int numberOfPlayers;

  Sport(int numberOfPlayers) {
    this.numberOfPlayers = numberOfPlayers;
  }

  public int getNumberOfPlayers() {
    return numberOfPlayers;
  }

  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(name().substring(0, 3).toLowerCase());
    return stringBuilder.toString();
  }
}
