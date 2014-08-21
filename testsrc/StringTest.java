import junit.framework.Assert;
import org.junit.Test;
import training.ideas.java.StringPrint;
import training.ideas.java.decisions.Fplos;

/**
 * Created by idnsas on 8/19/2014.
 */
public class StringTest {
    @Test
    public void given_string_print_string(){
        String input = "Sameer";


        Assert.assertEquals("NANANNE", StringPrint.main(input));

    }
}
