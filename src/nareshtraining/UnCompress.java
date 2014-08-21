package nareshtraining;

import com.sun.xml.internal.fastinfoset.util.CharArray;

/**
 * Created by idnsas on 8/14/2014.
 */
public class UnCompress {
    public static String uncomp(String inputstring) {
        int len = inputstring.length();
        String output = "";
        char[] charArray = new char[len];
        for(int i=0;i<len-1;i++) {
            charArray[i] = inputstring.charAt(i);

            output+=charArray[i];

            int counter=1;
            for(int j=i+1;j<len;j++) {
                charArray[j] = inputstring.charAt(j);
                if (charArray[i] == charArray[j])
                    counter=counter+1;
                else
                    break;
            }
            output+=charArray[i];

            if(counter>1)
                output+=counter;


        }


        return output;
    }
}
