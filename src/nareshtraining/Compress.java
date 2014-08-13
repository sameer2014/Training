package nareshtraining;

/**
 * Created by idnsas on 8/12/2014.
 */
public class Compress {
    public static String comp(String inputstring) {
        int len = inputstring.length();
        String output = "";
        int j=0;

        char[] charArray = new char[len];
        for(int i=0;i<len-1;i++) {
            charArray[i] = inputstring.charAt(i);
            int counter=0;
            for(j=i;j<len;++j) {
                counter=counter+1;
                charArray[j] = inputstring.charAt(j);
                if (charArray[i] == charArray[j]);

                else
                break;
            }
           output += charArray[i];
            if(j==len){
                counter=counter+1;}
            if(counter>1)
            output+=counter;

            i = j - 1;

            }
        return output;
    }
}
