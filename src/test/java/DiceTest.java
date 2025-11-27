import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class DiceTest {

    private Dice sut;

    @BeforeEach
    void setUp() {
        sut = new Dice(6);
    }

    @Test
    void shouldThrowExceptionWhenSidesAreInvalid(){

        assertThrows(IllegalArgumentException.class, ()->new Dice(1));
    }

    @Test
    void ShouldRollCorrectDiceParameters(){
        sut = new Dice(6);
        int roll = sut.rollDice();
        assertTrue(roll>0 && roll <7);
    }

    
}