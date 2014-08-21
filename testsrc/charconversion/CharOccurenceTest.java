package charconversion;

import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.charconversion.Charocc;

/**
 * Created by idnsas on 8/17/2014.
 */
public class CharOccurenceTest {
    @Test
    public void char_occurence_find_num_of_index(){
        char inputarray [];
        inputarray = new char[]{'a', 'b', 'c','b','e'};
        char inputarray1[]=new char[]{'b'};
        int expectedarray= 2;

        Assert.assertEquals(expectedarray, Charocc.calccharocc(inputarray, inputarray1));
    }
    @Test
    public void char_occurence_one_find_num_of_index(){
        char inputarray [];
        inputarray = new char[]{ 'b'};
        char inputarray1[]=new char[]{'b'};
        int expectedarray= 1;

        Assert.assertEquals(expectedarray, Charocc.calccharocc(inputarray,inputarray1));
    }
    @Test
    public void char_occurence_last_find_num_of_index(){
        char inputarray [];
        inputarray = new char[]{'a', 'b', 'c','b','e'};
        char inputarray1[]=new char[]{'e'};
        int expectedarray= 1;

        Assert.assertEquals(expectedarray, Charocc.calccharocc(inputarray,inputarray1));
    }
    @Test
    public void char_occurence_last_three_find_num_of_index(){
        char inputarray [];
        inputarray = new char[]{'a', 'b', 'E','e','e'};
        char inputarray1[]=new char[]{'e'};
        int expectedarray= 3;

        Assert.assertEquals(expectedarray, Charocc.calccharocc(inputarray,inputarray1));
    }
}
