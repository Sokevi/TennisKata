import org.junit.Assert;
import org.junit.Test;


public class PlayerTest {
    Player player = new Player("Leo");

    @Test
    public void createPLayerAndGetHerName() {
        Assert.assertEquals("Leo", player.getName());
    }

    @Test
    public void createPLayerWithOneScoreGameAndGetCurrentScore() {
        player.setScore();
        Assert.assertEquals(15, player.getCurrentScore());
    }

    @Test
    public void createPLayerWithHighScore() {
        player.setScore();
        player.setScore();
        player.setScore();
        player.setScore();
        player.setScore();
        Assert.assertEquals(40, player.getCurrentScore());
    }

    @Test
    public void createPLayerWithAvantage() {
        player.setAvantage(true);
        Assert.assertEquals(true, player.isAvantage());
    }


}
