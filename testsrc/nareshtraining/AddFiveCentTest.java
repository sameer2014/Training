package nareshtraining;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnsas on 8/18/2014.
 */
public class AddFiveCentTest {
    @Test
    public void input_point5cent_output_point5cent(){
        double inputnumber=0.05;
        double expectedoutputnumber=0.05;
        Assert.assertEquals(expectedoutputnumber,Calculatenumber.modnumber(inputnumber));

    }
    @Test
    public void input_pointtwentypointnintyfour_cent_output_point_twentypointnintyfive_cent(){
        double inputnumber=20.94;
        double expectedoutputnumber=20.95;
        Assert.assertEquals(expectedoutputnumber,Calculatenumber.modnumber(inputnumber));

    }
    @Test
    public void input_pointtwentypointnintyseven_output_twentonecent(){
        double inputnumber=20.97;
        double expectedoutputnumber=21.00;
        Assert.assertEquals(expectedoutputnumber,Calculatenumber.modnumber(inputnumber));

    }
}
