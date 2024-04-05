package player;

public class Player {
    private String name;

    public Player(){

    }
    public void setName(String name) {
        this.name = name;
        if (name.isBlank()) {
            this.name = "Player";
        }
    }
}
