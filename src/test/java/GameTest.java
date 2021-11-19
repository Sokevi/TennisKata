import org.junit.Assert;
import org.junit.Test;


public class GameTest {


    @Test
    public void CurrentGameScore() {
        Player playerOne = new Player("Leo");
        Player playerTwo = new Player("Roger");

        Game game = new Game(playerOne, playerTwo);
        game.setScoreOfPlayerOne(); // player One score: 15-0
        game.setScoreOfPlayerOne(); // player one score again: 30-0
        game.setScoreOfPlayerTwo();  // player two score: 30-15

        Assert.assertEquals("(30-15)", game.getCurrentGameScore());
        Assert.assertEquals(false, game.isFinish());

        System.out.println();
    }

    @Test
    public void WinGamePLayerOne() {
        Player playerOne = new Player("Leo");
        Player playerTwo = new Player("Roger");

        Game game = new Game(playerOne, playerTwo);
        game.setScoreOfPlayerOne(); // player One score: 15
        game.setScoreOfPlayerOne(); // player one score again: 30
        game.setScoreOfPlayerTwo(); // player two score: 15
        game.setScoreOfPlayerOne(); // player One score again : 40
        game.setScoreOfPlayerOne(); // player one score again: Win game !

        Assert.assertEquals(true, game.isFinish());
        Assert.assertEquals("Leo", game.getWinner());
        Assert.assertEquals(true, game.isFinish());
        System.out.println();
    }

    @Test
    public void WinGamePLayerTwo() {
        Player playerOne = new Player("Leo");
        Player playerTwo = new Player("Roger");

        Game game = new Game(playerOne, playerTwo);
        game.setScoreOfPlayerTwo(); // player One score: 0-15
        game.setScoreOfPlayerTwo(); // player one score again: 0-30
        game.setScoreOfPlayerOne(); // player two score: 15-30
        game.setScoreOfPlayerTwo(); // player One score again :14-40
        game.setScoreOfPlayerTwo(); // player one score again: Win game !

        Assert.assertEquals(true, game.isFinish());
        Assert.assertEquals("Roger", game.getWinner());
        Assert.assertEquals(true, game.isFinish());
        System.out.println();
    }

    @Test
    public void Deuce() {
        Player playerOne = new Player("Leo");
        Player playerTwo = new Player("Roger");

        Game game = new Game(playerOne, playerTwo);
        game.setScoreOfPlayerOne(); // player One score: 15-0
        game.setScoreOfPlayerOne(); // player one score again: 30-0
        game.setScoreOfPlayerTwo(); // player two score: 30-15
        game.setScoreOfPlayerTwo(); // player One score again : 30-30
        game.setScoreOfPlayerOne(); // player one score again: 40-30
        game.setScoreOfPlayerTwo(); // player one score again: 40-40


        Assert.assertEquals("(40-40)", game.getCurrentGameScore());
        Assert.assertEquals("DEUCE", game.getStatus());
        System.out.println();

    }

    @Test
    public void AdvantageForPlayerOne() {
        Player playerOne = new Player("Leo");
        Player playerTwo = new Player("Roger");

        Game game = new Game(playerOne, playerTwo);
        game.setScoreOfPlayerOne(); // player One score: 15 -0
        game.setScoreOfPlayerOne(); // player one score again: 30-0
        game.setScoreOfPlayerTwo(); // player two score: 30-15
        game.setScoreOfPlayerOne(); // player One score again : 40-15
        game.setScoreOfPlayerTwo(); // player one score again: 40-30
        game.setScoreOfPlayerTwo(); // player one score again: 40 -40
        game.setScoreOfPlayerOne(); // player one score again: 40-40 with Avantage status


        Assert.assertEquals("(40-40)", game.getCurrentGameScore());
        Assert.assertEquals("ADVANTAGE", game.getStatus());
        System.out.println();

    }


    @Test
    public void LosingAdvantage() {
        Player playerOne = new Player("Leo");
        Player playerTwo = new Player("Roger");

        Game game = new Game(playerOne, playerTwo);
        game.setScoreOfPlayerOne(); // player One score: 15-0
        game.setScoreOfPlayerOne(); // player one score again: 30-0
        game.setScoreOfPlayerTwo(); // player two score: 30-15
        game.setScoreOfPlayerOne(); // player One score again : 40-15
        game.setScoreOfPlayerTwo(); // player one score again: 40-30
        game.setScoreOfPlayerTwo(); // player one score again: 40-40
        game.setScoreOfPlayerOne(); // player one score again:40-40 with Avantage status
        game.setScoreOfPlayerTwo(); // player one score again: 40-40 lose advantage
        game.setScoreOfPlayerTwo(); // player one score again: 40-40 lose advantage
        game.setScoreOfPlayerTwo(); // player one score again: 40-40 lose advantage

        Assert.assertEquals("(40-40)", game.getCurrentGameScore());
        Assert.assertEquals("DEUCE", game.getStatus());
        Assert.assertEquals(false, playerOne.isAvantage());
        Assert.assertEquals(false, playerTwo.isAvantage());
        System.out.println();
    }



}
