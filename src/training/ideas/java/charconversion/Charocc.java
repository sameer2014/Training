package training.ideas.java.charconversion;

/**
 * Created by idnsas on 8/17/2014.
 */
public class Charocc {
    public static int calccharocc(char[] inputarray, char[] inputarray1) {
        int len=inputarray.length;
        int len1=inputarray1.length;
        int output=0;
        for(int i=0;i<len;i++)
            for(int j=0;j<len1;j++)
            if(inputarray1[j]==Character.toLowerCase(inputarray[i]))
                output=output+1;
        return output;
    }
}
