import org.junit.Test;


import static org.assertj.core.api.Assertions.*;

/**
 * Created by marbya on 21.12.2017.
 */
public class TretiiTest {
    @Test
    public void TestCalcilyation2Sum() {

        calculyator calculyator = new calculyator();
        int a = 10;
        int b = 17;

        int result = 27;

        assertThat(calculyator.sum(a, b)).isEqualTo(27);

    }
}