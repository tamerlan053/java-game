package my.game;

import java.util.Objects;

public abstract class Person {
  private String id;
  private String name;

  public Person(String id, String name) {
      String newID = "";
      for (int i = 0; i < id.length(); i++) {
          char c = id.charAt(i);
          if (Character.isDigit(c) || Character.isAlphabetic(c)) {
              newID += c;
          }
      }
    this.id = id;
    this.name = name;
  }
}
