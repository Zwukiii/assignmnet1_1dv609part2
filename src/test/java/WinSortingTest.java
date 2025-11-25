import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class WinSortingTest {

    private WinSorting sut;
    private Player mockPlayer;
    private WinSorting winSorting;

    @BeforeEach
    void setUp() {
        sut = new WinSorting();
        mockPlayer = mock(Player.class);
    }

    @Test
    void testBinarySearchPlayerFoundInList(){
        sut.addPlayers(new Player("Lucas"));

        int res = sut.binarySearch("Lucas");

        assertNotEquals(-1, res, "Lucas was not found");
        assertEquals("Lucas", sut.getPlayers().get(res).getName());
    }
}