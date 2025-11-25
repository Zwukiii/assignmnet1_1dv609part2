import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreBoardTest {

    ScoreBoard sut;
    Player p1;
    Player p2;

    @BeforeEach
    void setup() {
        sut = new ScoreBoard();
        p1 = new Player("Alen");
        p2 = new Player("Bogdan");
    }

    @Test
    void shouldReturnP1asWinnerWhenAchivedHigherScore() {
        p1.playerScores(10);
        p2.playerScores(5);
        assertEquals("Alen", sut.getWinner(p1, p2));
    }

    @Test
    void shouldReturnP2asWinnerWhenAchivedHigherScore() {
        p1.playerScores(15);
        p2.playerScores(25);
        assertEquals("Bogdan", sut.getWinner(p1,p2));
    }

    @Test
    void ShouldReturnTieWhenBothScoreAreEqual() {
        p1.playerScores(20);
        p2.playerScores(20);
        assertEquals("TIE", sut.getWinner(p1,p2));
    }

}
