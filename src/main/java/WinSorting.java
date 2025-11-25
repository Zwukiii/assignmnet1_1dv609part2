import java.util.ArrayList;
import java.util.List;

public class WinSorting {

    private final List<Player> players;

    public WinSorting(){
        this.players= new ArrayList<>();
    }

    public void addPlayers(Player player){
        players.add(player);
    }
    //Sorts players by name
    int binarySearch(String name){
        return -1;
    }



    public List<Player> getPlayers() {
        return players;
    }
}
