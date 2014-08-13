package training.ideas.java.nareshtraining;

/**
 * Created by idnsas on 8/11/2014.
 */
public class Fizzbuzz {

    public static String fizz(int number) {
        String fizzbuzz = "";

       for (int i = 1; i <= number; i++) {
           String j= "";
            if (i % 3 == 0)
                j = "fizz";
            if (i % 5 == 0)
                j = "buzz";
           if (i % 3 == 0 && i % 5 == 0)
                j = "fizzbuzz";
           if(i%3!=0 && i%5!=0)
           j= String.valueOf(i);
            fizzbuzz=fizzbuzz.concat(j);
       }
        return fizzbuzz;
    }
}
