package tennisGame1;

import java.util.HashMap;
import java.util.Map;

class Players {
    private String player1Name;
    private String player2Name;

    private Map<String, Integer> players;

    private ScoreIntStringMapper s;

    Players(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;

        initPlayers(player1Name, player2Name);

        s = new ScoreIntStringMapper();
    }

    private void initPlayers(String player1Name, String player2Name) {
        players = new HashMap<String, Integer>();
        players.put(player1Name, 0);
        players.put(player2Name, 0);
    }

    int getIntScore(String name) {
        return players.get(name);
    }

    void addOnePointToPlayer(String name) {
           players.put(name, players.get(name) + 1);
    }

    boolean hasEqualScores() {
        return getIntScore(player1Name) == getIntScore(player2Name);
    }

    boolean isScoreGreaterThanThirty() {
        return getIntScore(player1Name) >= 4 || getIntScore(player2Name) >= 4;
    }

    String getScoreWhenOnePlayerHasAdvantage() {
        String score;
        int minusResult = getIntScore(player1Name) - getIntScore(player2Name);
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    String getScoreWhenPointsAreLessThanForty() {
        return s.getScoreString(getIntScore(player1Name))
                + "-"
                + s.getScoreString(getIntScore(player2Name));
    }


    String getScoreStringWhenPointsAreEqual() {
        return s.getEqualScoreString(getIntScore(player1Name));
    }
}
