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
}
