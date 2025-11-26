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
    void ShouldStartScoreAtZero() {
        assertEquals(0, sut.getScore());

    }

    @Test
    void shouldIncreaseScoreWhenPlayerScores() {
        sut.playerScores(5);
        assertEquals(5, sut.getScore());

        sut.playerScores(10);
        assertEquals(15, sut.getScore());
    }


}
