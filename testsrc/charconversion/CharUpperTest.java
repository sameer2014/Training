package charconversion;

import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.charconversion.Chariupper;

/**
 * Created by idnsas on 8/15/2014.
 */
public class CharUpperTest {
    @Test
     public void Charlower_to_upper() {
        char inputarray[];
        inputarray = new char[]{'a', 'b', 'c', 'c'};
        char expectedarray[] = new char[]{'A','B','C','C'};
        Assert.assertArrayEquals(expectedarray, Chariupper.calupper(inputarray));

    }
    @Test
     public void Charupper_to_upper() {
        char inputarray[];
        inputarray = new char[]{'A', 'B', 'C', 'C'};
        char expectedarray[] = new char[]{'A','B','C','C'};
        Assert.assertArrayEquals(expectedarray, Chariupper.calupper(inputarray));

    }
    @Test
    public void Charupperspecial_to_upper() {
        char inputarray[];
        inputarray = new char[]{'&','A', 'B', 'C', 'C','%','$'};
        char expectedarray[] = new char[]{'&','a','b','c','c','%','$'};
        Assert.assertArrayEquals(expectedarray, Chariupper.callower(inputarray));

    }
    @Test
    public void Charupper_to_lower() {
        char inputarray[];
        inputarray = new char[]{'A', 'B', 'C', 'C'};
        char expectedarray[] = new char[]{'a','b','c','c'};
        Assert.assertArrayEquals(expectedarray, Chariupper.callower(inputarray));

    }
}
