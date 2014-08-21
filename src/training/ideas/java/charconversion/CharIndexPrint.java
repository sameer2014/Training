package training.ideas.java.charconversion;

/**
 * Created by idnsas on 8/17/2014.
 */
public class CharIndexPrint {
    public static char[] indexprint(char[] inputarray, int input) {
        int len=inputarray.length;
        char output[]=new char[input+1];
        for(int i=0;i<len;i++) {
            for (int j = 0; j < input+1; j++){
                output[j] = Character.toLowerCase(inputarray[i]);
                 i++;
                if(i==len){break;}
            }
           break;

        }
        return output;
    }
}
