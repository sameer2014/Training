package training.ideas.java.calculator;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnsas on 8/7/2014.
 */
public class InsertionSortTest {
    @Test
    public void given_set_of_number_then_do_insertion_sort_ascending() {
        int DescArr[] = {1, 2,3};
        int expectedDescNumber[] = {3, 2,1};
        int actualarray[] = InsertionSort.sort(DescArr);
        for (int i = 0; i < DescArr.length; i++) {
            Assert.assertEquals(expectedDescNumber[i], actualarray[i]);
        }
    }
}
