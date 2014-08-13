package training.ideas.java.decisions;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnsas on 7/23/2014.
 */
public class fplosTest {
    @Test
    public void given_rate_0_and_lrv_more_than_rate_then_fplos_should_be_NNNNNNN(){
        double rate = 0.0;
        double lrv [] = {1.0,1.0,1.0,1.0,1.0,1.0,1.0};

     Assert.assertEquals("NNNNNNN", Fplos.fplos(rate,lrv));

    }
    @Test
    public void given_rate_greater_than_lrv_then_fplos_should_be_YYYYYYY(){
        double rate = 1.0;
        double lrv [] = {0.0,0.0,0.0,0.0,0.0,0.0,0.0};

        Assert.assertEquals("YYYYYYY", Fplos.fplos(rate,lrv));

    }
    @Test
    public void given_rate_and_lrv_then_fplos(){
        double rate = 80.0;
        double lrv [] = {89.6,90.9,80.9,100.0,0.0,90.0,20.0};

        Assert.assertEquals("NNNNYYY", Fplos.fplos(rate,lrv));
    }

    @Test
    public void fplosPattenForSpectrumOfaRates(){
        double rateSpectrum [] = {80.0,0,100,200};
        double lrv [] = {89.6,90.9,80.9,100.0,0.0,90.0,20.0};
        String expectedFPLOSPattern[] = {"NNNNYYY","NNNNNNN","YYYYYYY","YYYYYYY"};
        String actualFPLOSPattern[] = Fplos.fplos(rateSpectrum,lrv);

        Assert.assertEquals(expectedFPLOSPattern.length,actualFPLOSPattern.length);

        for (int rateCounter=0;rateCounter<rateSpectrum.length;rateCounter++){
            Assert.assertEquals(expectedFPLOSPattern[rateCounter],actualFPLOSPattern[rateCounter]);
        }

    }
}
