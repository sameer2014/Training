package training.ideas.java.charconversion;

/**
 * Created by idnsas on 8/15/2014.
 */
public class Chariupper {

    public static char[] calupper(char[] inputarray) {
        char outputarray []=new char[inputarray.length];
        boolean lower = false;
        for(int i=0;i<inputarray.length;i++)
            calc(outputarray, inputarray, i,true);
        return outputarray;
    }
    public static char[] callower(char[] inputarray) {
        char outputarray []=new char[inputarray.length];
        for(int i=0;i<inputarray.length;i++)
            calc(outputarray, inputarray, i,false);
        return outputarray;
    }

    public static void calc(char[] outputarray, char[] inputarray, int i,boolean j) {
                if(j==false)
                outputarray[i]=Character.toLowerCase(inputarray[i]);
                else
                outputarray[i] = Character.toUpperCase(inputarray[i]);


    }

}




