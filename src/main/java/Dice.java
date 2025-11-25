public class Dice {

    private final int sides;

    public Dice(int sides){
        if (sides==1){
            System.out.println("Invalid dice");
        }
        this.sides= sides;
    }
}
