package TreinamentoSelenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void helloWorld(){

    WebDriver driver = new ChromeDriver();

    driver.navigate().to("http://google.com");

    Assert.assertEquals("Google", driver.getTitle());

    driver.quit();

    }
}
