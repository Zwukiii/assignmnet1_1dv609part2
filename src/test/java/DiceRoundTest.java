import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)

public class DiceRoundTest {

    @Mock
    Dice dice;

    @Mock
    WinSorting leaderboard;

    @Mock
    OutputProvider output;


    Player p1;
    Player p2;
    ScoreBoard scoreBoard;

    Game sut;

    @BeforeEach
    void setup() {
        p1 = new Player("Alen");
        p2 = new Player("Bogdan");
        scoreBoard = new ScoreBoard();
        sut = new Game(dice, p1, p2, scoreBoard, leaderboard);
    }

    @Test
    void shouldRollDiceTwiceInRounds() {
        when(dice.rollDice()).thenReturn(3, 4);

        sut.playRounds(output);
        verify(dice, times(2)).rollDice();
    }

    @Test
    public void shouldAddScoresToPlayers() {
        when(dice.rollDice()).thenReturn(5, 6);
        sut.playRounds(output);
        assertEquals(5, sut.getP1().getScore());
        assertEquals(6, sut.getP2().getScore());
    }


}
