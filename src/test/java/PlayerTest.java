import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    Player sut;


    @BeforeEach
    void setup() {
        sut = new Player("Alen");
    }


    @Test
    void shouldStartScoreAtZero() {
        assertEquals(0, sut.getScore());
    }


    @Test
    void shouldIncreaseScoreWhenPlayerScores() {
        sut.playerScore(5);
        assertEquals(5, sut.getScore());


        sut.playerScore(10);

        assertEquals(15, sut.getScore());
    }
}
