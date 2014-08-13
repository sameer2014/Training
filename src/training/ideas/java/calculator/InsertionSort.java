package training.ideas.java.calculator;

/**
 * Created by idnsas on 8/7/2014.
 */
public class InsertionSort {
    public static int[] sort(int[] descArr) {
        int j = 1;
        for(int i=1;i<descArr.length;i++) {
            int hold = descArr[i];
            for( j=i-1;j>-1 ;j--) {
                if (descArr[ j ] < hold)
                descArr[j + 1] = descArr[j];
            else break;

            }

             descArr[j+1]=hold;



            }
        return descArr;
        }
        }