package training.ideas.java.decisions;

/**
 * Created by idnsas on 7/27/2014.
 */
public class Minlos {
    public static int minlos(double rate, double[] lrv) {

        String MINLOS = "";
        int finalminlos = 0;
        double rate1 = 0;
        double finalvalue1=0;
        for (double finalvalue : lrv) {
            rate1 += rate;
            finalvalue1+=finalvalue;

            if (rate1 >= finalvalue1) {
                MINLOS = "Y";
                break;
            }
            else{
                MINLOS = "N";


            }

            finalminlos = finalminlos+1;
            }
        return finalminlos;
    }

    }

