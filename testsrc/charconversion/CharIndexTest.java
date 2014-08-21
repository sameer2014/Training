package charconversion;

import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.charconversion.Charindex;

/**
 * Created by idnsas on 8/14/2014.
 */
public class CharIndexTest {
    @Test
    public void Charindex(){
        char inputarray [];
        char input ='b';
        inputarray = new char[]{'a', 'b', 'c'};
        int expectedarray=1;

        Assert.assertEquals(expectedarray, Charindex.index(inputarray, input));
    }
    @Test
    public void Charindex_char_not_matching(){
        char inputarray [];
        char input ='e';
        inputarray = new char[]{'a', 'b', 'c'};
        int expectedarray=-1;
        Assert.assertEquals(expectedarray, Charindex.index(inputarray, input));
    }
    @Test
    public void Charindex_same_char() {
        char inputarray[];
        char input = 'c';
        inputarray = new char[]{'a', 'b', 'c', 'c'};
        int expectedarray = 2;
        Assert.assertEquals(expectedarray, Charindex.index(inputarray, input));

    }
    @Test
    public void Charindex_same_num() {
        char inputarray[];
        char input = '1';
        inputarray = new char[]{'1', '2', '3', 'c'};
        int expectedarray = 0;
        Assert.assertEquals(expectedarray, Charindex.index(inputarray, input));

    }
}
