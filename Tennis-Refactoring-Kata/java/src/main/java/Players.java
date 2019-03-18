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

    int getScore(String name) {
        return players.get(name);
    }

    void addOnePointToPlayer(String name) {
           players.put(name, players.get(name) + 1);
    }

    boolean hasEqualScores() {
        return getScore(player1Name) == getScore(player2Name);
    }

    boolean isScoreGreaterThanThirty() {
        return getScore(player1Name) >= 4 || getScore(player2Name) >= 4;
    }

    String getScoreWhenOnePlayerHasAdvantage() {
        String score;
        int minusResult = getScore(player1Name) - getScore(player2Name);
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    String getScoreWhenPointsAreLessThanForty() {
        return getScoreString(getScore(player1Name)) + "-" + getScoreString(getScore(player2Name));
    }

    private String getScoreString(int tempScore) {
        switch (tempScore) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
        }
        return "";
    }

    String getScoreStringWhenPointsAreEqual() {
        switch (getScore(player1Name)) {
            case 0:
                return "Love-All";
            case 1:
                return "Fifteen-All";
            case 2:
                return "Thirty-All";
            default:
                return "Deuce";
        }
    }
}
