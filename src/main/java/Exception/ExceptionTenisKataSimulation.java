package Exception;


/*
the goal of this exception is to controle my simulation in the main
because that is possible to get  " DEUCE ADVANTAGE DEUCE ADVANTAGE DEUCE ADVANTAGE " to infinity
 */
public class ExceptionTenisKataSimulation extends Exception{

    public ExceptionTenisKataSimulation(String message){
        super(message);
    }

}
