package charconversion;

import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.charconversion.CharIndexPrint;

/**
 * Created by idnsas on 8/17/2014.
 */
public class CharTillEndIndexTest {
    @Test
    public void Chararray_index_match(){
        char inputarray [];
        int input =1;
        inputarray = new char[]{'a', 'b', 'c'};
        char [] expectedarray=new char[]{'a','b'};
        Assert.assertArrayEquals(expectedarray, CharIndexPrint.indexprint(inputarray, input));
    }
    @Test
    public void Chararray_index_match_case_insensitive(){
        char inputarray [];
        int input =3;
        inputarray = new char[]{'a', 'b', 'c','D'};
        char [] expectedarray=new char[]{'a','b','c','d'};
        Assert.assertArrayEquals(expectedarray, CharIndexPrint.indexprint(inputarray, input));
    }
}
