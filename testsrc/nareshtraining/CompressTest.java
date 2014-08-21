package nareshtraining;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnsas on 8/12/2014.
 */
public class CompressTest {
    @Test
    public void compressString(){
        String inputstring="15AAAB15CCCCCE";
        String expectedDescNumber = "15A3B15C5E";
        Assert.assertEquals(expectedDescNumber, Compress.comp(inputstring));
    }
    @Test
    public void compressString_twochar(){
        String inputstring="AE";
        String expectedDescNumber = "AE";
        Assert.assertEquals(expectedDescNumber, Compress.comp(inputstring));
    }
    @Test
    public void compressString_onechar(){
        String inputstring="A";
        String expectedDescNumber = "A";
        Assert.assertEquals(expectedDescNumber, Compress.comp(inputstring));
    }
    @Test
    public void compressString_lastcharmultiple(){
        String inputstring="AEEEE";
        String expectedDescNumber = "AE4";
        Assert.assertEquals(expectedDescNumber, Compress.comp(inputstring));
    }
    @Test
    public void compressString_lastcharaftermultiple(){
        String inputstring="AEEEEF";
        String expectedDescNumber = "AE4F";
        Assert.assertEquals(expectedDescNumber, Compress.comp(inputstring));
    }
    @Test
    public void compressString_lastcharaftermultiple_end() {
        String inputstring = "AEEEEFFFFFFFFFFF";
        String expectedDescNumber = "AE4F11";
        Assert.assertEquals(expectedDescNumber, Compress.comp(inputstring));
    }
}
