package training.ideas.java.charconversion;

/**
 * Created by idnsas on 8/14/2014.
 */
public class Concatarr {

    public static char[] concat(char[] inputarray, char[] inputarray1) {
        int len = inputarray.length;
        int len1 = inputarray1.length;
        char outputarray[]  = new char[len+len1];
        System.arraycopy(inputarray,0,outputarray,0,len);
        System.arraycopy(inputarray1,0,outputarray,len,len1);

        return outputarray;
    }
}
