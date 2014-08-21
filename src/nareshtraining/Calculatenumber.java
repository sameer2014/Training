package nareshtraining;

import java.text.DecimalFormat;

import static java.lang.Math.round;

/**
 * Created by idnsas on 8/18/2014.
 */
public class Calculatenumber {

    public static double modnumber(double inputnumber) {
        DecimalFormat df = new DecimalFormat("#.##");
        double calinputnumber = Double.valueOf(df.format(inputnumber % 0.05));
        if (calinputnumber == 0.0)
            return inputnumber;
        if (calinputnumber != 0) {
            double i = Double.valueOf((df.format(0.05 - calinputnumber)));
            inputnumber = Double.valueOf(df.format(inputnumber + i));
            return inputnumber;
        }
return inputnumber;
    }
}
