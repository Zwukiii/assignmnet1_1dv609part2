import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.lang.Character.getName;

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
       players.sort(Comparator.comparing(Player::getName));
        int low = 0;
        int high = players.size()-1;

        while (low <= high){
            int mid = (low +high)/2;
            Player midPlay = players.get(mid);
            int cmp = midPlay.getName().compareTo(name);
            if (cmp == 0) return mid;
            if (cmp < 0) low = mid+1;
            else high = mid -1;
        }

       return -1;
    }

    public List<Player>getPlayersByScore(){
        return null;
    }



    public List<Player> getPlayers() {
        return players;
    }
}
