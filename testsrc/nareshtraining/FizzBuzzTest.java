package nareshtraining;

import junit.framework.Assert;
import org.junit.Test;
import training.ideas.java.nareshtraining.Fizzbuzz;

/**
 * Created by idnsas on 8/11/2014.
 */
public class FizzBuzzTest {
    @Test
    public void fizzBuzz(){
        int number=15;
        String expectedDescNumber = "12fizz4buzzfizz78fizzbuzz11fizz1314fizzbuzz";
        Assert.assertEquals(expectedDescNumber, Fizzbuzz.fizz(number));
    }
}
