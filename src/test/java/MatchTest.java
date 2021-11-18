import org.junit.Assert;
import org.junit.Test;

public class MatchTest {

    @Test
    public void testAddSet() {


        Player player1 = new Player("Eric");
        Player player2 = new Player("Franck");

        Match match = new Match(player1, player2);

        Set set = new Set(player1, player2);

        Game game1 = new Game(player1, player2);
        game1.setScoreOfPlayerTwo();//0-15
        game1.setScoreOfPlayerTwo();//0-30
        game1.setScoreOfPlayerTwo();//0-40
        game1.setScoreOfPlayerTwo();// player Two win
        set.addGame(game1);

        Game game2 = new Game(player1, player2);
        game2.setScoreOfPlayerTwo();//0-15
        game2.setScoreOfPlayerTwo();//0-30
        game2.setScoreOfPlayerTwo();//0-40
        game2.setScoreOfPlayerTwo();// player Two win
        set.addGame(game2);

        Game game3 = new Game(player1, player2);
        game3.setScoreOfPlayerTwo();//0-15
        game3.setScoreOfPlayerTwo();//0-30
        game3.setScoreOfPlayerTwo();//0-40
        game3.setScoreOfPlayerTwo();// player Two win
        set.addGame(game3);

        Game game4 = new Game(player1, player2);
        game4.setScoreOfPlayerTwo();//0-15
        game4.setScoreOfPlayerTwo();//0-30
        game4.setScoreOfPlayerTwo();//0-40
        game4.setScoreOfPlayerTwo();// player Two win
        set.addGame(game4);

        Game game5 = new Game(player1, player2);
        game5.setScoreOfPlayerTwo();//0-15
        game5.setScoreOfPlayerTwo();//0-30
        game5.setScoreOfPlayerTwo();//0-40
        game5.setScoreOfPlayerTwo();// player Two win
        set.addGame(game5);

        Game game6 = new Game(player1, player2);
        game6.setScoreOfPlayerTwo();//0-15
        game6.setScoreOfPlayerTwo();//0-30
        game6.setScoreOfPlayerTwo();//0-40
        game6.setScoreOfPlayerTwo();// player Two win
        set.addGame(game6);


        match.addSet(set);
        match.addSet(set);





        System.out.println(match.toString());


        Assert.assertEquals("(0-6)(0-6)", match.printMatchSocres());

    }

}
