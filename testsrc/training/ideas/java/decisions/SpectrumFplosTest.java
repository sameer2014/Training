package training.ideas.java.decisions;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnsas on 7/26/2014.
 */
public class SpectrumFplosTest {
    @Test
    public void given_rate_0_and_lrv_more_than_rate_then_fplos(){
        double rate [] = {0.0,0.0,0.0,0.0,0.0,0.0,0.0};
        double lrv [] = {1.0,1.0,1.0,1.0,1.0,1.0,1.0};

        Assert.assertEquals("NNNNNNN,NNNNNNN,NNNNNNN,NNNNNNN,NNNNNNN,NNNNNNN,NNNNNNN,", Specfplos.specfplos(rate, lrv));

    }
    @Test
    public void given_rate_has_some_values_and_lrv_has_some_value_then_fplos(){
        double rate [] = {70.0,80.0,90.0,100.0,70.0,90.0,80.0};
        double lrv [] = {89.6,90.9,80.9,100.0,0.0,90.0,20.0};

        Assert.assertEquals("NNNNNNY,NNNNYYY,YNYNYYY,YYYYYYY,NNNNNNY,YNYNYYY,NNNNYYY,", Specfplos.specfplos(rate, lrv));

    }
    @Test
    public void given_rate_more_than_lrv_then_fplos() {
        double rate[] = {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0};
        double lrv[] = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};

        Assert.assertEquals("YYYYYYY,YYYYYYY,YYYYYYY,YYYYYYY,YYYYYYY,YYYYYYY,YYYYYYY,", Specfplos.specfplos(rate, lrv));
    }
    }
