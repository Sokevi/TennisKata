import org.junit.Assert;
import org.junit.Test;


class PlayerTest {
    Player player = new Player("Leo");

    @Test
    void createPLayerAndGetHerName() {
        Assert.assertEquals("Leo", player.getName());
    }

    @Test
    void createPLayerWithOneScoreGameAndGetCurrentScore() {
        player.setScore();
        Assert.assertEquals(15, player.getCurrentScore());
    }

    @Test
    void createPLayerWithHighScore() {
        player.setScore();
        player.setScore();
        player.setScore();
        player.setScore();
        player.setScore();
        Assert.assertEquals(40, player.getCurrentScore());
    }

    @Test
    void createPLayerWithAvantage() {
        player.setAvantage(true);
        Assert.assertEquals(true, player.isAvantage());
    }


}
