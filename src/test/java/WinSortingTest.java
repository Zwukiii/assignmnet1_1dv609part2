import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

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

    @Test
    void testBinarySearchPlayerNotFoundInList(){
        int res = sut.binarySearch("Daniel");

        assertEquals(-1, res,"Daniel isnt in teh list");
    }

    @Test
    void testBinarySearchIfItIsSortedCorrectlyAlphabetically(){
        sut.addPlayers(new Player("Emma"));
        sut.addPlayers(new Player("Alex"));
        sut.addPlayers(new Player("Bob"));

        sut.binarySearch("Emma");//start point of search

        List<Player>sortedList = sut.getPlayers();

        for (int i =0; i<sortedList.size()-1; i++){
            String currentName = sortedList.get(i).getName();
            String nextName = sortedList.get(i+1).getName();

            assertTrue(currentName.compareTo(nextName)<=0, "It is correctly sorted");

        }

    }




}