package nareshtraining;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnsas on 8/14/2014.
 */
public class UncompressTest {
    @Test
    public void unCompressString(){
        String inputstring="15A3B15C5E";
        String expectedDescNumber = "15AAAB15CCCCCE";
        Assert.assertEquals(expectedDescNumber, UnCompress.uncomp(inputstring));
    }
    @Test
    public void unCompressString_onechar(){
        String inputstring="A";
        String expectedDescNumber = "A";
        Assert.assertEquals(expectedDescNumber, UnCompress.uncomp(inputstring));
    }
    @Test
    public void unCompressString_twochar(){
        String inputstring="AE";
        String expectedDescNumber = "AE";
        Assert.assertEquals(expectedDescNumber, UnCompress.uncomp(inputstring));
    }
    @Test
    public void unCompressString_singlenumber_in_between(){
        String inputstring="A5C";
        String expectedDescNumber = "AAAAAC";
        Assert.assertEquals(expectedDescNumber, UnCompress.uncomp(inputstring));
    }

}
