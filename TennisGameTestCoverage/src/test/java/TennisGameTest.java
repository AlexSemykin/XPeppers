import org.junit.Test;

import static org.junit.Assert.*;

public class TennisGameTest {

    @Test
    public void loveAll() {
        TennisGame game = new TennisGame("player1", "player2");
        assertEquals("Love-All", game.getScore());
    }

    @Test
    public void fifteenAll() {
        TennisGame game = new TennisGame("player1", "player2");
        game.wonPoint("player1");
        game.wonPoint("player2");
        assertEquals("Fifteen-All", game.getScore());
    }

    @Test
    public void thirtyAll() {
        TennisGame game = new TennisGame("player1", "player2");

        game.wonPoint("player1");
        game.wonPoint("player1");

        game.wonPoint("player2");
        game.wonPoint("player2");

        assertEquals("Thirty-All", game.getScore());
    }

    @Test
    public void Deuce() {
        TennisGame game = new TennisGame("player1", "player2");

        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");

        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");

        assertEquals("Deuce", game.getScore());
    }

    @Test
    public void advantagePlayer1() {
        TennisGame game = new TennisGame("player1", "player2");

        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");

        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");

        assertEquals("Advantage player1", game.getScore());
    }

    @Test
    public void advantagePlayer2() {
        TennisGame game = new TennisGame("player1", "player2");

        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");

        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");

        assertEquals("Advantage player2", game.getScore());
    }

    @Test
    public void winForPlayer1() {
        TennisGame game = new TennisGame("player1", "player2");

        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");

        game.wonPoint("player2");
        game.wonPoint("player2");

        assertEquals("Win for player1", game.getScore());
    }

    @Test
    public void winForPlayer2() {
        TennisGame game = new TennisGame("player1", "player2");

        game.wonPoint("player1");
        game.wonPoint("player1");

        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");

        assertEquals("Win for player2", game.getScore());
    }

    @Test
    public void loveFifteen() {
        TennisGame game = new TennisGame("player1", "player2");

        game.wonPoint("player2");

        assertEquals("Love-Fifteen", game.getScore());
    }

    @Test
    public void loveThirty() {
        TennisGame game = new TennisGame("player1", "player2");

        game.wonPoint("player2");
        game.wonPoint("player2");

        assertEquals("Love-Thirty", game.getScore());
    }

    @Test
    public void loveForty() {
        TennisGame game = new TennisGame("player1", "player2");

        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");

        assertEquals("Love-Forty", game.getScore());
    }

    @Test
    public void fifteenLove() {
        TennisGame game = new TennisGame("player1", "player2");

        game.wonPoint("player1");

        assertEquals("Fifteen-Love", game.getScore());
    }

    @Test
    public void fifteenThirty() {
        TennisGame game = new TennisGame("player1", "player2");

        game.wonPoint("player1");

        game.wonPoint("player2");
        game.wonPoint("player2");

        assertEquals("Fifteen-Thirty", game.getScore());
    }

    @Test
    public void fifteenForty() {
        TennisGame game = new TennisGame("player1", "player2");

        game.wonPoint("player1");

        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");

        assertEquals("Fifteen-Forty", game.getScore());
    }


    @Test
    public void thirtyLove() {
        TennisGame game = new TennisGame("player1", "player2");

        game.wonPoint("player1");
        game.wonPoint("player1");

        assertEquals("Thirty-Love", game.getScore());
    }

    @Test
    public void thirtyFifteen() {
        TennisGame game = new TennisGame("player1", "player2");

        game.wonPoint("player1");
        game.wonPoint("player1");

        game.wonPoint("player2");

        assertEquals("Thirty-Fifteen", game.getScore());
    }

    @Test
    public void thirtyForty() {
        TennisGame game = new TennisGame("player1", "player2");

        game.wonPoint("player1");
        game.wonPoint("player1");

        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");

        assertEquals("Thirty-Forty", game.getScore());
    }

    @Test
    public void fortyLove() {
        TennisGame game = new TennisGame("player1", "player2");

        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");

        assertEquals("Forty-Love", game.getScore());
    }

    @Test
    public void fortyFifteen() {
        TennisGame game = new TennisGame("player1", "player2");

        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");

        game.wonPoint("player2");

        assertEquals("Forty-Fifteen", game.getScore());
    }

    @Test
    public void fortyThirty() {
        TennisGame game = new TennisGame("player1", "player2");

        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");

        game.wonPoint("player2");
        game.wonPoint("player2");

        assertEquals("Forty-Thirty", game.getScore());
    }

}