package training.ideas.java.decisions;

/**
 * Created by idnsas on 7/26/2014.
 */
public class Specfplos {
    public static String specfplos(double[] rate, double[] lrv) {
        String FPLOS = "";
        String FPLOSfinal = "";


        for (double finalratevalue : rate) {
          double finalratevalue1=0;
           double  finallrv1=0;
            for (double finallrv : lrv) {
                finalratevalue1 += finalratevalue;
                finallrv1 += finallrv;

                if (finalratevalue1 > finallrv1) {
                    FPLOS = "Y";
                } else {
                    FPLOS = "N";
                }

                FPLOSfinal += FPLOS;
            }
            FPLOSfinal+=",";
        }
        return FPLOSfinal;
    }
    }

