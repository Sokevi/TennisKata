import util.KataUtil;

import java.util.Scanner;


public class Main {


    public static void main(String... args) {

        System.out.println("********** TENIS KATA **********");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a username for player1 : ");
        String namePlayer1 = scanner.nextLine();

        Player player1 = new Player(namePlayer1);

        System.out.print("Enter a username for player2 : ");
        String namePlayer2 = scanner.nextLine();
        Player player2 = new Player(namePlayer2);

        System.out.println("********** " + player1.getName() + " vs " + player2.getName() + " **********");
        System.out.println();

        Match match = new Match(player1, player2);



        System.out.print("How many sets have you planned? : ");
        int setNumber = Integer.parseInt(scanner.nextLine());
        Set set ;
        for (int i=0; i<setNumber;i++){

            set=  playSet(player1,player2);
            match.addSet(set);
            System.out.println();
            System.out.println(" Set Score  "+ set.getScore());

        }

        System.out.println("*** ***  *** **** *** *** **");
        System.out.println("********** Match  **********");
        System.out.println(" Match summary \n "+ match.toString());
        System.out.println("**********        **********");
    }


    public static Game playGame(Player player1, Player player2) {
        player1.resetScore();
        player2.resetScore();
        Game game = new Game(player1, player2);
        System.out.println();
        System.out.print(" Game score :");
        while (!game.isFinish()) {
            int score = KataUtil.generate1or2();
            if (score == 1) {
                game.setScoreOfPlayerOne();
            } else {
                game.setScoreOfPlayerTwo();
            }
            game.getCurrentGameScore();
        }
        return game;
    }



    public static Set playSet(Player player1, Player player2){

        Set set = new Set(player1, player2);
        set.ressetSet();
        while(!set.isFinish()){
            set.addGame(playGame(player1,player2));
        }

        return set;

    }
}
