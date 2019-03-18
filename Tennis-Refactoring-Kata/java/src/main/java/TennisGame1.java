
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
            return getScoreStringWhenPointsAreEqual();
        } else if (p.isScoreGreaterThanThirty()) {
            return p.getScoreWhenOnePlayerHasAdvantage();
        } else {
            return getScoreWhenPointsAreLessThanForty();
        }
    }

    private String getScoreWhenPointsAreLessThanForty() {
        return getScoreString(p.getScore(p.getPlayer1Name())) + "-" + getScoreString(p.getScore(p.getPlayer2Name()));
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


    private String getScoreStringWhenPointsAreEqual() {
        switch (p.getScore(p.getPlayer1Name())) {
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
