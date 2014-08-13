package training.ideas.java.decisions;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnsas on 7/27/2014.
 */
public class MinlosTest {
    @Test
    public void given_rate_greater_than_lrv_then_minlos_should_be_7() {
        double rate = 1.0;
        double lrv[] = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};

        Assert.assertEquals(0, Minlos.minlos(rate, lrv));
    }

    @Test
    public void given_rate_and_lrv_then_minlos_1() {
        double rate = 70.6;
        double lrv[] = {70.6, 100.9, 80.9, 100.0, 0.0, 90.0, 20.0};

        Assert.assertEquals(1, Minlos.minlos(rate, lrv));

    }
    @Test
    public void given_rate_less_than_lrv_then_minlos_0() {
        double rate = 0.0;
        double lrv[] = {1.0,1.0,1.0,1.0,1.0,1.0,1.0};

        Assert.assertEquals(7, Minlos.minlos(rate, lrv));

    }
}