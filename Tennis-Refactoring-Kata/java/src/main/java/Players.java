import java.util.HashMap;
import java.util.Map;

class Players {
    private String player1Name;
    private String player2Name;

    private Map<String, Integer> players;

    Players(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;

        initPlayers(player1Name, player2Name);
    }

    private void initPlayers(String player1Name, String player2Name) {
        players = new HashMap<String, Integer>();
        players.put(player1Name, 0);
        players.put(player2Name, 0);
    }

    String getPlayer1Name() {
        return player1Name;
    }

    String getPlayer2Name() {
        return player2Name;
    }

    int getScore(String name) {
        return players.get(name);
    }

    void addOnePointToPlayer(String name) {
           players.put(name, players.get(name) + 1);
    }

    public boolean hasEqualScores() {
        return getScore(getPlayer1Name()) == getScore(getPlayer2Name());
    }
}
