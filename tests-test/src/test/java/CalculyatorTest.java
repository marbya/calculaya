import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by marbya on 21.12.2017.
 */
public class CalculyatorTest {
    @Test
    public void TestCalcilyationSum(){
        calculyator calculyator=new calculyator();
        int a=10;
        int b=17;

        int result=27;

        assertEquals(result,calculyator.sum(a,b));
    }



}
