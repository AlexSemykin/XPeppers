import java.util.HashMap;
import java.util.Map;

public class Players {
    private String player1Name;
    private String player2Name;

    private Map<String, Integer> players;

    public Players(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;

        initPlayers(player1Name, player2Name);
    }

    private void initPlayers(String player1Name, String player2Name) {
        players = new HashMap<String, Integer>();
        players.put(player1Name, 0);
        players.put(player2Name, 0);
    }

    public String getPlayer1Name() {
        return player1Name;
    }

    public String getPlayer2Name() {
        return player2Name;
    }

    public int getPlayer1Score() {
        return players.get(getPlayer1Name());
    }

    public int getPlayer2Score() {
        return players.get(getPlayer2Name());
    }

    public void setPlayer1Score(int score) {
        players.put(getPlayer1Name(), score);
    }

    public void setPlayer2Score(int score) {
        players.put(getPlayer2Name(), score);
    }

    public void addOnePointToPlayer1() {
        players.put(getPlayer1Name(), getPlayer1Score() + 1);
    }

    public void addOnePointToPlayer2() {
        players.put(getPlayer2Name(), getPlayer2Score() + 1);
    }

}
