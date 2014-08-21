package training.ideas.java.charconversion;

/**
 * Created by idnsas on 8/14/2014.
 */
public class Charindex {
    public static int index(char[] inputarray, char input) {
        int len=inputarray.length;

        int output=0;
        for(int i=0;i<len;i++) {
           if(inputarray[i]==input){
              output=  i;

            break;}
            else
               output=-1;
            }

        return output;
    }
}
