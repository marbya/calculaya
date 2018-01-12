import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by marbya on 21.12.2017.
 */
public class SecondTest {
    @Test
    public void TestCalcilyation1Sum() {
        calculyator calculyator = new calculyator();
        int a = 10;
        int b = 17;

        int result = 27;

        assertEquals(result, calculyator.div(a, b));

    }
}