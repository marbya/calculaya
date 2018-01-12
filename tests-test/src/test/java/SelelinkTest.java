import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Created by marbya on 12.01.2018.
 */


public class SelelinkTest {
    @Test
    public void SelelinkTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.yandex.ru");
        WebElement element = driver.findElement(By.name("text"));
        element.sendKeys("играть на барабанах");
        WebElement element1 = driver.findElement(By.className("button_theme_websearch"));
        element1.submit();
        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();
    }
  }
