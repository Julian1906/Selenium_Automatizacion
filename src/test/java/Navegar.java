import static org.junit.Assert.*;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class Navegar {




/*
    @Before
    public void NavegandoConWebDriver() {
        System.setProperty("webdriver.chrome.driver",
                "Driver/chromedriver_win32/chromedriver.exe");
        assertEquals("Login", driver.getTitle());

    }
*/
    @Test
    public void btn_Ingresar() {
        System.setProperty("webdriver.chrome.driver",
                "Driver/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.manage().window().maximize();
        driver.get("https://matricula.upc.edu.pe/loginupc/oAuth/Login?_tk=KO");
        WebElement codigo = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div/div/a"));
        codigo.click();

        driver.get("https://micuenta.upc.edu.pe/home/index?_f=2");
        WebElement codigo2 = driver.findElement(By.xpath("//*[@id=\"link-login\"]"));
        codigo2.click();


        WebElement Alumno = driver.findElement(By.name("user"));
        Alumno.sendKeys("u201625684");

        WebElement clave = driver.findElement(By.name("password"));
        clave.sendKeys("Upc2022#");


        WebElement boton = driver.findElement(By.xpath("//*[@id=\"btn-login\"]"));
        boton.click();


       try {
           wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"btn-vincular-continuar\"]")));
           WebElement boton2 = driver.findElement(By.xpath("//*[@id=\"btn-vincular-continuar\"]"));
           boton2.click();
       }catch (Exception e){}
    }



    @Test
    public void TraerValor() {
        System.setProperty("webdriver.chrome.driver",
                "Driver/chromedriver_win32/chromedriver.exe");
        WebDriver driver2 = new ChromeDriver();
        driver2.get("https://matricula.upc.edu.pe/loginupc/oAuth/Login?_tk=KO");

        String Valor = driver2.findElement(By.xpath("/html/body/div/div/div/div[3]/div/h1")).getText();

        System.out.println(Valor);
    }





}


