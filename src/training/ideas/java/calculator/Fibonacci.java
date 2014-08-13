package training.ideas.java.calculator;

/**
 * Created by idnsas on 8/6/2014.
 */
public class Fibonacci {

    public static int[] fibo(int number) {
        int array[] = new int[number];

              array[1]=1;
              array[0]=0;
            for(int j=2;j<array.length;j++)
                array[j]=array[j-1]+array[j-2];

        return array;
    }
}
