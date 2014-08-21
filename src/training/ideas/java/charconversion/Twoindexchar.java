package training.ideas.java.charconversion;

/**
 * Created by idnsas on 8/17/2014.
 */
public class Twoindexchar {
    public static char[] twoindex(char[] inputarray, int index1, int index2) {
        int len=inputarray.length;
        char [] output=new char[index2-(index1-1)];
        int counter=0;
        for(int i=0;i<len;i++){
                if(i==index1)
                do{
            output[counter] = Character.toLowerCase(inputarray[i]);
                counter=counter+1;
                i++;
                if(i>index2){break;}}
                while(i<=index2);
                counter=0;
             }
        return output;
    }
}
