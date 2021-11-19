public class Game {


    private static final Integer FORTY_SCORE = 40;

    private static final String DEUCE = "DEUCE";
    private static final String ADVANTAGE = "ADVANTAGE";


    private Player playerOne;
    private Player playerTwo;

    private String status;
    private boolean isFinish;
    private Player winner;

    public Game(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.status = "default";
        playerOne.setAvantage(false);
        playerOne.setAvantage(false);

    }

    public String getStatus() {
        if((playerOne.getCurrentScore() == FORTY_SCORE && playerTwo.getCurrentScore() == FORTY_SCORE)){
            return this.status;
        }else{
            return this.getCurrentGameScore();
        }

    }

    public void setScoreOfPlayerOne() {
        playerOne.setScore();
        String localStatus = null;

        if (playerOne.getCurrentScore() == FORTY_SCORE && playerTwo.getCurrentScore() < FORTY_SCORE) {

            this.winner = playerOne;
            this.isFinish = true;
        }
        if (playerOne.getCurrentScore() == FORTY_SCORE && playerTwo.getCurrentScore() == FORTY_SCORE) {
            localStatus = DEUCE;


        }
        if (playerOne.getCurrentScore() == FORTY_SCORE && playerTwo.getCurrentScore() == FORTY_SCORE &&
                status.equals(DEUCE)) {
            localStatus = ADVANTAGE;
            playerOne.setAvantage(true);
            playerOne.setAvantage(false);
        }
        if (playerOne.getCurrentScore() == FORTY_SCORE && playerTwo.getCurrentScore() == FORTY_SCORE &&
                status.equals(ADVANTAGE) && playerOne.isAvantage() && !playerTwo.isAvantage()) {
            this.winner = playerOne;
            this.isFinish = true;
        }
        if (playerOne.getCurrentScore() == FORTY_SCORE && playerTwo.getCurrentScore() == FORTY_SCORE &&
                status.equals(ADVANTAGE) && playerTwo.isAvantage()) {
            status = DEUCE;
            playerTwo.setAvantage(false);
            playerOne.setAvantage(false);

        }
        if (localStatus != null) this.status = localStatus;



        System.out.print(this.getStatus()+" ");



    }

    public void setScoreOfPlayerTwo() {
        playerTwo.setScore();
        String localStatus = null;

        if (playerTwo.getCurrentScore() == FORTY_SCORE && playerOne.getCurrentScore() != FORTY_SCORE) {
            this.winner = playerOne;
            winner = playerTwo;
            this.isFinish = true;
        }
        if (playerTwo.getCurrentScore() == FORTY_SCORE && playerOne.getCurrentScore() == FORTY_SCORE
                && !this.status.equals(DEUCE)) {

            localStatus = DEUCE;
            playerTwo.setAvantage(false);
            playerOne.setAvantage(false);
        }
        if (status.equals(DEUCE) && !playerOne.isAvantage() && !playerTwo.isAvantage()) {

            playerTwo.setAvantage(true);
            playerOne.setAvantage(false);
            localStatus = ADVANTAGE;

        }
        if (status.equals(ADVANTAGE) && playerTwo.isAvantage()) {
            winner = playerTwo;
            this.isFinish = true;
        }
        if (status.equals(ADVANTAGE) && playerOne.isAvantage()) {
            this.status = DEUCE;
            playerOne.setAvantage(false);
            playerTwo.setAvantage(false);

        }
        if (localStatus != null)
            this.status = localStatus;

        System.out.print(this.getStatus());


    }

    public boolean isFinish() {

        return isFinish;
    }


    public String getCurrentGameScore() {
        return "("+playerOne.getCurrentScore() + "-" + playerTwo.getCurrentScore()+")";
    }


    public String getWinner() {
        return this.winner.getName();
    }

    public static void main(String... args) {


    }

}
