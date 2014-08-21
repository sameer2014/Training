package charconversion;

import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.charconversion.Charistartndex;

/**
 * Created by idnsas on 8/15/2014.
 */
public class CharStartIndexTest {
    @Test
    public void Charindex_same_char() {
        char inputarray[];
        int input = 1;
        inputarray = new char[]{'a', 'b', 'c', 'c'};
        char expectedarray[] = new char[]{'b','c','c'};
        Assert.assertArrayEquals(expectedarray, Charistartndex.charindex(inputarray, input));

    }
    @Test
    public void Charindex_special_char() {
        char inputarray[];
        int input = 3;
        inputarray = new char[]{'a', 'b', 'c', 'c','%','4','^','&'};
        char expectedarray[] = new char[]{'c','%','4','^','&'};
        Assert.assertArrayEquals(expectedarray, Charistartndex.charindex(inputarray, input));

    }
}
