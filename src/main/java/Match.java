import java.util.ArrayList;

public class Match {

    private ArrayList<Set> listSets = new ArrayList<Set>();

    private Player playerOne;
    private Player playerTwo;

    public Match(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void addSet(Set set) {

        listSets.add(set);

    }


    public String printMatchSocres() {
        var matchScores = new StringBuffer();
        listSets.forEach(
                (set) -> matchScores.append("(" + set.getPlayerOneScore() + "-" + set.getPlayerTwoScore() + ")")
        );

        return matchScores.toString();
    }


    @Override
    public String toString() {
        return " Player1 " + this.playerOne.getName() +
                " \n  Player2 " + this.playerTwo.getName() +
                " \n  Score: " + printMatchSocres()+
                "\n  Current game status: "+ listSets.get(listSets.size()-1).getCurrentGame();

    }
}
