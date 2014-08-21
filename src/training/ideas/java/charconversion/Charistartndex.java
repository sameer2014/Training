package training.ideas.java.charconversion;

/**
 * Created by idnsas on 8/15/2014.
 */
public class Charistartndex {

    public static char[] charindex(char[] inputarray, int input) {
        int len=inputarray.length;
       char[] output=new char[len-input];
      for(int i=0;i<len-input;i++) {
             int j=i+input;
              output[i] = inputarray[j];
          }
 return output;
    }
}
