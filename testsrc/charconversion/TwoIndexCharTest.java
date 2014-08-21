package charconversion;

import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.charconversion.Twoindexchar;

/**
 * Created by idnsas on 8/17/2014.
 */
public class TwoIndexCharTest {
       @Test
        public void two_index_input_find_char_between_first_occurence_of_index_and_second_index(){
            char inputarray [];
            int index1=2;
            int index2=3;
            inputarray = new char[]{'a', 'b', 'c','d','e'};
            char expectedarray[]= new char[]{'c','d'};

            Assert.assertArrayEquals(expectedarray, Twoindexchar.twoindex(inputarray, index1, index2));
        }
    @Test
    public void two_sameindex_input_find_char_between_first_occurence_of_index_and_second_index(){
        char inputarray [];
        int index1=4;
        int index2=4;
        inputarray = new char[]{'a', 'b', 'c','d','e'};
        char expectedarray[]= new char[]{'e'};

        Assert.assertArrayEquals(expectedarray, Twoindexchar.twoindex(inputarray, index1,index2));
    }
    @Test
    public void two_firstsameindex_input_find_char_between_first_occurence_of_index_and_second_index(){
        char inputarray [];
        int index1=0;
        int index2=0;
        inputarray = new char[]{'a', 'b', 'c','d','e'};
        char expectedarray[]= new char[]{'a'};

        Assert.assertArrayEquals(expectedarray, Twoindexchar.twoindex(inputarray, index1,index2));
    }

    }
