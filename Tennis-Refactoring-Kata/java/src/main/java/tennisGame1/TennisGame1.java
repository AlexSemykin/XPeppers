package tennisGame1;

import tennisGame.TennisGame;

public class TennisGame1 implements TennisGame {

    private Players p;

    TennisGame1(String player1Name, String player2Name) {
        p = new Players(player1Name, player2Name);
    }

    public void wonPoint(String playerName) {
        p.addOnePointToPlayer(playerName);
    }

    public String getScore() {
        if (p.hasEqualScores()) {
            return p.getScoreStringWhenPointsAreEqual();
        } else if (p.isScoreGreaterThanThirty()) {
            return p.getScoreWhenOnePlayerHasAdvantage();
        } else {
            return p.getScoreWhenPointsAreLessThanForty();
        }
    }
}
