package nareshtraining;

import junit.framework.Assert;
import org.junit.Test;
import training.ideas.java.nareshtraining.Fizzbuzz;

/**
 * Created by idnsas on 8/12/2014.
 */
public class CompressTest {
    @Test
    public void compressString(){
        String inputstring="15AAABCCCC15DDDDDE";
        String expectedDescNumber = "15A3BC415D5E";
        Assert.assertEquals(expectedDescNumber, Compress.comp(inputstring));
    }
}
