import java.util.Arrays;
import java.util.List;

public class Player {

    private String name;
    private boolean isAvantage;
    private final List<Integer> scores = Arrays.asList(0, 15, 30, 40);
    private int currentScore;


    public Player(String namePlayer) {
        this.name = namePlayer;
        this.isAvantage = false;
        this.currentScore = 0;
    }

    public int getCurrentScore() {
        return scores.get(currentScore);
    }

    public void setScore() {
        if (currentScore < 3) this.currentScore++;
    }


    public boolean isAvantage() {
        return this.isAvantage;
    }

    public void setAvantage(boolean isAvantage) {
        this.isAvantage = isAvantage;
    }

    public String getName() {
        return name;
    }

    public void setName(String namePlayer) {
        this.name = namePlayer;

    }

}
