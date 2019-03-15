import java.util.HashMap;
import java.util.Map;

public class Players {
    private String firstPlayerName;
    private String secondPlayerName;

    private Map<String, Integer> players;

    public Players(String firstPlayerName, String secondPlayerName) {
        this.firstPlayerName = firstPlayerName;
        this.secondPlayerName = secondPlayerName;

        initPlayers(firstPlayerName, secondPlayerName);
    }

    private void initPlayers(String firstPlayerName, String secondPlayerName) {
        players = new HashMap<String, Integer>();
        players.put(firstPlayerName, 0);
        players.put(secondPlayerName, 0);
    }
}
