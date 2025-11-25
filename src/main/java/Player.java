public class Player {

    private final String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 1;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
