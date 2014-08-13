package training.ideas.java.calculator;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnsas on 8/5/2014.
 */
public class SelectionSortTest {
    @Test
    public void given_set_of_number_then_do_selection_sort_descending() {
        int DescArr[] = {3, 2,1};
        int expectedDescNumber[] = {1, 2, 3};
        int actualarray[] = SelectionSort.sort(DescArr);
        for (int i = 0; i < DescArr.length; i++) {
            Assert.assertEquals(expectedDescNumber[i], actualarray[i]);
        }
    }
    }
