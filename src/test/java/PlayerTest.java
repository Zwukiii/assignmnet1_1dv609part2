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
}
