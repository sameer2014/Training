package training.ideas.java.calculator;

/**
 * Created by idnsas on 8/10/2014.
 */
public class Fibonaccirec {
    public static int[] fiborec(int number) {
        int fiborec[] = new int[number];

    calc(fiborec,number);
    return fiborec;
    }

    private static void calc(int fiborec[], int j) {
        if(j==0)
            return;
        if(j==1|| j == 2) {
            fiborec[0] = 0;
            fiborec[1] = 1;
            return;
        }
        calc(fiborec,j - 1);
        fiborec[j-1]=fiborec[j-2]+fiborec[j-3];

    }


}
