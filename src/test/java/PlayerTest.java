import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    Player sut;


    @BeforeEach
    void setup() {
        sut = new Player("Alen");
    }


    // checks if the starting score is Zero
    @Test
    void shouldStartScoreAtZero() {
        assertEquals(0, sut.getScore());
    }
}
