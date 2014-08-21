package charconversion;

import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.charconversion.Concatarr;

/**
 * Created by idnsas on 8/14/2014.
 */
public class ConcatArrayTest {

    @Test
    public void Concattwoarray(){
       char inputarray [];
        char inputarray1 [];
        inputarray = new char[]{'a', 'b', 'c'};
        inputarray1= new char[]{'d','e','f'};
        char expectedarray[];
        expectedarray=new char[]{'a','b','c','d','e','f'};
        Assert.assertArrayEquals(expectedarray, Concatarr.concat(inputarray, inputarray1));
    }
    @Test
    public void Concattwoarray_differentsize(){
        char inputarray [];
        char inputarray1 [];
        inputarray = new char[]{'a', 'b', 'c','b','d'};
        inputarray1= new char[]{'d','e','f'};
        char expectedarray[];
        expectedarray=new char[]{'a','b','c','b','d','d','e','f'};
        Assert.assertArrayEquals(expectedarray, Concatarr.concat(inputarray,inputarray1));
    }
    @Test
    public void Concattwoarray_numbers(){
        char inputarray [];
        char inputarray1 [];
        inputarray = new char[]{'a', 'b', 'c',1,3};
        inputarray1= new char[]{'d','e','f',4,5};
        char expectedarray[];
        expectedarray=new char[]{'a','b','c',1,3,'d','e','f',4,5};
        Assert.assertArrayEquals(expectedarray, Concatarr.concat(inputarray,inputarray1));
    }
}
