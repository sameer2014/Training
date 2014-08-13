package training.ideas.java.decisions;

/**
 * Created by idnsas on 7/23/2014.
 */
public class Fplos {


        public static String fplos(final double rateValue, final double[] lrvArray) {
            String fplosPattern="";
            double totalRate = 0;
            double totalLRV=0;
            for(double lrvForIndividualLOS : lrvArray)
            {
                totalRate+=rateValue;
                totalLRV+=lrvForIndividualLOS;

                if(totalRate>=totalLRV) {
                    fplosPattern+= "Y";
                }
                else{
                    fplosPattern+= "N";
                }

            }

            return fplosPattern;
        }


        public static String[] fplos(double[] rateSpectrum, double[] lrv) {
            String generatedFPLOSPattern[] = new String[rateSpectrum.length];
            int rateCounter=0;
            for (double rateValue : rateSpectrum) {
                generatedFPLOSPattern[rateCounter++]=fplos(rateValue,lrv);
            }

            return generatedFPLOSPattern;
        }

}






