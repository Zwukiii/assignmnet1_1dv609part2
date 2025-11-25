public class Dice {

    private final int sides;

    //Refactor
    public Dice(int sides) throws IllegalArgumentException{
        if (sides<2){
            throw new IllegalArgumentException("Dice must have at least 2 sides");
        }
        this.sides= sides;
    }


    public int rollDice(){
        return 0;
    }


}
