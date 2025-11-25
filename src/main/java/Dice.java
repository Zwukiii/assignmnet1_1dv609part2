public class Dice {

    private final int sides;

    public Dice(int sides){
        if (sides==1){
            throw new IllegalArgumentException("Dice must have at least 2 sides");
        }
        this.sides= sides;
    }
}
