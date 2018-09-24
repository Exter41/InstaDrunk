package company.instadrunk;

import java.util.ArrayList;

public class Card {

    private String entitled;
    private ArrayList<Player> players;

    public Card(String entitled, ArrayList<Player> players) {
        this.entitled = entitled;
        this.players = players;
    }

    public void setEntitled(String entitled) {
        this.entitled = entitled;
    }

    public String getEntitled() {
        return this.entitled;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public ArrayList<Player> getPlayers() {
        return this.players;
    }
}
