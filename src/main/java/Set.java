import org.jetbrains.annotations.NotNull;

public class Set {

    private Player playerOne;
    private Player playerTwo;

    private int playerOneScore;
    private int playerTwoScore;
    private Game currentGame;
    private boolean isFinish;


    public Set(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.playerOneScore = 0;
        this.playerTwoScore = 0;

    }



    public String getCurrentGame() {
        if (this.currentGame.getStatus().equals("DEUCE") || this.currentGame.getStatus().equals("ADVANTAGE")) {
            return this.currentGame.getStatus();
        } else {
            return this.currentGame.getCurrentGameScore();
        }
    }


    public void addGame(@NotNull Game game) {

        if(!isFinish()){
            this.currentGame =game;
            if (game.getWinner().equals(playerOne.getName())) {
                playerOneScore++;
            }
            if (game.getWinner().equals(playerTwo.getName())) {
                playerTwoScore++;
            }
        };




    }

    public boolean isFinish() {

        if ( playerOneScore >=6 || playerTwoScore >= 6) {

            if (playerOneScore - playerTwoScore >=2 || playerTwoScore - playerOneScore >= 2) {
                this.isFinish = true;
            }
        }
        return isFinish;
    }


    public String getScore() {
        return "(" + this.playerOneScore + "-" + this.playerTwoScore + ")";
    }

    public int getPlayerOneScore() {
        return playerOneScore;
    }

    public int getPlayerTwoScore() {
        return playerTwoScore;
    }

    public void ressetSet(){
        this.playerOneScore= 0;
        this.playerTwoScore =0;
        this.isFinish = false;
    }
}
