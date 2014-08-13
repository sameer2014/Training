package training.ideas.java.calculator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by idnsas on 7/21/2014.
 */
public class Addition {



    public static double add(double...doubleNumbers) {
        double sum=0;
       for(double individualelement:doubleNumbers){
        sum+=individualelement;}
           return sum;
    }
}
