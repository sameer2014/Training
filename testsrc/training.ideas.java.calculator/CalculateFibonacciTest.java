package training.ideas.java.calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnsas on 8/6/2014.
 */
public class CalculateFibonacciTest {
    @Test
    public void give_numbers_to_create_fibonacci(){
       int number=8;
        int expectedDescNumber[] = {0,1,1,2,3,5,8,13};

            Assert.assertArrayEquals(expectedDescNumber,Fibonacci.fibo(number));


        }
}
