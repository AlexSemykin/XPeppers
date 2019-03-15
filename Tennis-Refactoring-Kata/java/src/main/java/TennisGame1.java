
public class TennisGame1 implements TennisGame {

    Players p;

    TennisGame1(String player1Name, String player2Name) {
        p = new Players(player1Name, player2Name);
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(p.getPlayer1Name()))
            p.addOnePointToPlayer1();
        else if (playerName.equals(p.getPlayer2Name()))
            p.addOnePointToPlayer2();
    }

    public String getScore() {
        if (p.getScorePlayer1() == p.getScorePlayer2()) {
            return getScoreStringWhenPointsAreEqual();
        } else if (p.getScorePlayer1() >= 4 || p.getScorePlayer2() >= 4) {
            return getScoreWhenOnePlayerHasAdvantage();
        } else {
            return getScoreWhenPointsAreLessThanForty();
        }
    }

    private String getScoreWhenPointsAreLessThanForty() {
        return getScoreString(p.getScorePlayer1()) + "-" + getScoreString(p.getScorePlayer2());
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

    private String getScoreWhenOnePlayerHasAdvantage() {
        String score;
        int minusResult = p.getScorePlayer1() - p.getScorePlayer2();
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    private String getScoreStringWhenPointsAreEqual() {
        switch (p.getScorePlayer1()) {
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
