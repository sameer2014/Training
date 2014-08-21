package charconversion;

import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.charconversion.Twocharindex;

/**
 * Created by idnsas on 8/16/2014.
 */
public class TwoCharIndexTest {
    @Test
    public void two_char_input_find_index_of_first_occurence_of_second_array_do_not_match(){
        char inputarray [];
        char inputarray1 [];
        inputarray = new char[]{'a', 'b', 'c','c','d'};
        inputarray1= new char[]{'c','d'};
        int expectedarray=3;

        Assert.assertEquals(expectedarray, Twocharindex.index(inputarray, inputarray1));
    }
    @Test
    public void two_char_input_find_index_of_first_occurence_of_second_array_match(){
        char inputarray [];
        char inputarray1 [];
        inputarray = new char[]{'a', 'b', 'c','d','e'};
        inputarray1= new char[]{'a','b'};
        int expectedarray=0;

        Assert.assertEquals(expectedarray, Twocharindex.index(inputarray, inputarray1));
    }
    @Test
    public void two_char_array_with_special_char_input_find_index_of_first_occurence_of_second_array_match(){
        char inputarray[] = new char[]{'a','d','e','@','3','5','y','2'};
        char [] inputarray1= new char[]{'5','y','2'};
        int expectedarray=5;

        Assert.assertEquals(expectedarray, Twocharindex.index(inputarray, inputarray1));
    }
}
