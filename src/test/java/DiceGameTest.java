import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class DiceGameTest {

    @Mock
    private InputProvider input;

    @Mock
    private OutputProvider output;

    @Mock
    private Dice dice;

    @Mock
    private ScoreBoard scoreBoard;

    @Mock
    private WinSorting leaderBoard;

    private Game sut;
    Player p1;
    Player p2;

    @BeforeEach
    void setup() {
        p1 = new Player("Alen");
        p2 = new Player("Bogdan");
        sut = new Game(dice, p1, p2, scoreBoard, leaderBoard);
    }


    @Test
    void shouldStopImmediateWhenUserPressQuit() {
        when(input.getInput()).thenReturn("Q");
        sut.playTheGame(input, output);
        verify(output).print("Game Over. Winner is: " + sut.getWinner());
    }

    @Test
    void shouldPrintRoundMessageWhenUsersPlays() {
        when(input.getInput()).thenReturn("P").thenReturn("Q");
        sut.playTheGame(input, output);
        verify(output).print("Playing Round: " + 1);
    }

    @Test
    void shouldCallRoundsWhenUserPressPlays() {
        Game spySut = spy(new Game(dice, p1, p2, scoreBoard, leaderBoard));
        when(input.getInput()).thenReturn("P").thenReturn("Q");
        spySut.playTheGame(input, output);
        verify(spySut).playRounds(output);

    }

}
