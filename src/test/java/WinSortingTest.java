import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


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
    void testBinarySearchIfItIsSortedCorrectlyAlphabetically() {
        sut.addPlayers(new Player("Emma"));
        sut.addPlayers(new Player("Alex"));
        sut.addPlayers(new Player("Bob"));

        sut.binarySearch("Emma");//start point of search

        List<Player> sortedList = sut.getPlayers();

        for (int i = 0; i < sortedList.size() - 1; i++) {
            String currentName = sortedList.get(i).getName();
            String nextName = sortedList.get(i + 1).getName();

            assertTrue(currentName.compareTo(nextName) <= 0, "It is correctly sorted");

        }
    }



    @Test
    void ScoreSortingTestIfsortWorks(){
        Player p1 = new Player("Alen");
        p1.playerScores(2);

        Player p2 = new Player("Bogdan");
        p1.playerScores(5);

        Player p3 = new Player("Eiwan");
        p1.playerScores(3);

        sut.addPlayers(p1);
        sut.addPlayers(p2);
        sut.addPlayers(p3);

        List<Player>sortedScore = sut.getPlayersByScore();

        for (int i =0; i<sortedScore.size()-1; i++){
            int currentSocre = sortedScore.get(i).getScore();
            int nextScore = sortedScore.get(i+1).getScore();

            assertTrue(currentSocre >= nextScore, "It is correctly sorted");
        }
    }

    @Test
    void addNewPlayerWhenNoPlayerFound(){

        when(mockPlayer.getName()).thenReturn("Christian");
        when(mockPlayer.getScore()).thenReturn(6);

        sut.addPlayers(mockPlayer);

        assertEquals(1, sut.getPlayersByScore().size());
        assertEquals(mockPlayer, sut.getPlayersByScore().get(0));

    }




}