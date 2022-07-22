import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Navegar {


    @Test
    public void NavegandoConWebDriver() {
        System.setProperty("webdriver.chrome.driver",
                "Driver/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        assertEquals("Google", driver.getTitle());
        driver.quit();
    }


}
