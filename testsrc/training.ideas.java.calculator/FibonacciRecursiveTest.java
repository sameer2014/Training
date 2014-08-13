package training.ideas.java.calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnsas on 8/10/2014.
 */
public class FibonacciRecursiveTest {@Test
     public void give_numbers_to_create_fibonaccirecursive(){
    int number=12;
    int expectedDescNumber[] = {0,1,1,2,3,5,8,13,21,34,55,89};

    Assert.assertArrayEquals(expectedDescNumber, Fibonaccirec.fiborec(number));


}
}
