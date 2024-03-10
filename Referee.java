package my.game;

public final class Referee extends Person {
  
    public Referee(String id, String name) {
        super(id, name);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("").append("<ref>");
        return stringBuilder.toString();
    }  
}
