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
    if (newID.length() > 3) {
        this.id = newID.substring(0, 3).toUpperCase();
    } else {
        this.id = newID.toUpperCase();
    }
      this.name = name;
  }

  public String getId() {
      return id;
  }
}
