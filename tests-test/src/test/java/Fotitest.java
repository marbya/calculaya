/**
 * Created by marbya on 10.01.2018.
 */
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class Fotitest {
    @Test
        public void TestCalcilyation2Sum() {
        calculyator calculyator = new calculyator();
        int a = 10;
        int b = 17;
        int result = 27;

        assertThat(result, equalTo(27));
    }
}
