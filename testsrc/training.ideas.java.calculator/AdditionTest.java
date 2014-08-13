package training.ideas.java.calculator;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Filter;

/**
 * Created by idnsas on 7/21/2014.
 */
public class AdditionTest {
    @Test
    public void addDouble(){
          Assert.assertEquals(5.0,Addition.add(2,3));
    }
    @Test
    public void addTwoDouble(){
        Assert.assertEquals(2.5 + 3.6, Addition.add(2.5, 3.6));
    }
    @Test
    public void addNegative(){
        Assert.assertEquals(-2.5 + -3.6, Addition.add(-2.5, -3.6));
    }
    @Test
    public void addNegativePositive(){
        Assert.assertEquals(-2.5 + 3.6, Addition.add(-2.5, 3.6));
    }
    @Test
    public void addDoubleArray() {
        double[] dArray = {1.5, 2, 3, 4};

        Assert.assertEquals(1.5 + 2 + 3 + 4, Addition.add(dArray));
    }
    @Test
            public void addVariableIntegerNumbers(){
            Assert.assertEquals(21.0,Addition.add(1,2,3,4,5,6));}

    @Test
    public void addVariabledoubleNumbers(){
        Assert.assertEquals(1+2.5+3+4+5.8+6,Addition.add(1,2.5,3,4,5.8,6));}
}

