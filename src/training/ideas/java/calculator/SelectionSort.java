package training.ideas.java.calculator;

/**
 * Created by idnsas on 8/5/2014.
 */
public class SelectionSort {



    public static int[] sort(int[] descArr) {

        for (int sortnumber=0;sortnumber<descArr.length-1;sortnumber++) {
            int hold = sortnumber;
        for (int j=sortnumber+1;j<descArr.length;j++)

            if (descArr[j] <descArr[hold]) {
                hold=j;

                int temp=descArr[hold];
                descArr[hold]=descArr[sortnumber];
                descArr[sortnumber]=temp;

            }
        }
       return descArr;
    }


}
