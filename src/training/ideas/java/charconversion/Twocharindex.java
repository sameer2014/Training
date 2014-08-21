package training.ideas.java.charconversion;

import java.util.Arrays;

/**
 * Created by idnsas on 8/16/2014.
 */
public class Twocharindex {

    public static int index(char[] inputarray, char[] inputarray1) {
        int len=inputarray.length;
        int len1=inputarray1.length;
        int output=0;
        for(int i=0;i<len;i++) {
           int counter=0;
           if(output>0){break;}
           for(int j=0;j<len1;j++)
            if(inputarray1[j]==inputarray[i]){
               output=i;
               if(counter<=j){
               ++i;counter++;
               if(i==len){i--;break;}
                }

               else{break;}
             }
            else {
                if(output>0){
                    i--;
                }
                output= -1;
                break;
                }
        }
        if(output!=-1)
            output=output-len1+1;
        return output;
    }
}
