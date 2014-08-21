package training.ideas.java;

/**
 * Created by idnsas on 8/19/2014.
 */
public class StringPrint {
    public static String main(String input) {

        int len = input.length();
        String output = "";

        String counter = "";
            int j=0;
        String counter1 = "";
        String reversestring = "";
        for (int i = len; i > 0; i--) {

            for(j=i;j>0;j--){
            counter = input.substring( j-1,j);
            output = counter+output+ counter;
             }
            System.out.println(output);
            output="";
        }

            for (j = 0; j <len-1; j++) {
                reversestring = reversestring + " ";
            }
            reversestring = output + reversestring + output;
            System.out.println(reversestring);
            reversestring = "";


        return output;
    }
}