package nareshtraining;

/**
 * Created by idnsas on 8/12/2014.
 */
public class Compress {
    public static String comp(String inputstring) {
        int len = inputstring.length();
        String output = "";
        int j=0;
        int i=0;
        int counter=1;
        char[] charArray = new char[len];
        charArray[i] = inputstring.charAt(i);

        for(i=0;i<len-1;i++) {
            charArray[i] = inputstring.charAt(i);
               counter=1;
            for(j=i+1;j<len;j++) {
                charArray[j] = inputstring.charAt(j);
                if (charArray[i] == charArray[j])
                counter=counter+1;
                else
                break;
            }
            output+=charArray[i];

            if(counter>1)
            output+=counter;

            i = j - 1;
            }

        if (counter>=1)
        output+=inputstring.substring(i);
        return output;
    }
}