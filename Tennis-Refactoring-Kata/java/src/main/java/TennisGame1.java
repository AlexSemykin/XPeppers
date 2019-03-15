
public class TennisGame1 implements TennisGame {

    Players players;

    public TennisGame1(String player1Name, String player2Name) {

        players = new Players(player1Name, player2Name);
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1Name))
            scorePlayer1 += 1;
        else if (playerName.equals(player2Name))
            scorePlayer2 += 1;
    }

    public String getScore() {
        if (scorePlayer1 == scorePlayer2) {
            return getScoreStringWhenPointsAreEqual();
        } else if (scorePlayer1 >= 4 || scorePlayer2 >= 4) {
            return getScoreWhenOnePlayerHasAdvantage();
        } else {
            return getScoreWhenPointsAreLessThanForty();
        }
    }

    private String getScoreWhenPointsAreLessThanForty() {
        return getScoreString(scorePlayer1) + "-" + getScoreString(scorePlayer2);
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
        int minusResult = scorePlayer1 - scorePlayer2;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    private String getScoreStringWhenPointsAreEqual() {
        switch (scorePlayer1) {
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
