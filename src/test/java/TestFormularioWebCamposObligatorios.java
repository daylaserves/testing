import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class TestFormularioWebCamposObligatorios {
    private WebDriver driver;
    JavascriptExecutor js;
    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:/Chromedriver/Chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        js = (JavascriptExecutor) driver;
    }

    @Test
    public void testUntitledTestCase() throws Exception {
        driver.get("https://forms.gle/1MbYv8WmGnhu6K7D9");
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[3]/div/div/div/span/span")).click();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[3]/div/div/div[2]/span/span")).click();
        driver.findElement(By.xpath("//input[@type='text']")).clear();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1036645344");
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[3]/div/div/div[2]/span/span")).click();
        driver.findElement(By.xpath("//input[@type='text']")).click();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div")).click();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[2]/div[4]/div/div")).click();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[2]/div[5]/div/div")).click();
        driver.findElement(By.xpath("//input[@type='email']")).click();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[2]/div[6]/div/div/div[2]/div/div")).click();
        driver.findElement(By.xpath("//input[@type='text']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).clear();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Daniela López");
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div/div/div/input")).clear();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div/div/div/input")).sendKeys("123654-7");
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div/div/div/input")).clear();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div/div/div/input")).sendKeys("COHAN");
        driver.findElement(By.xpath("//input[@type='email']")).click();
        driver.findElement(By.xpath("//input[@type='email']")).clear();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("dlopez29@misena.edu.co");
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[3]/div/div/div[2]/span")).click();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[3]/div/div/div[2]/span/span")).click();
        driver.findElement(By.xpath("//div[@id='i8']/div[3]/div")).click();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[3]/div/div/div[2]/span/span")).click();
        driver.findElement(By.xpath("//div[@id='i24']/div[3]/div")).click();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[3]/div/div/div[2]/span/span")).click();
        driver.findElement(By.xpath("//div[@id='i43']/div[3]/div")).click();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[3]/div/div/div[2]/span/span")).click();
        driver.findElement(By.xpath("//div[@id='i59']/div[3]/div")).click();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[3]/div/div/div[2]/span/span")).click();
        driver.findElement(By.xpath("//div[@id='i75']/div[3]/div")).click();
        driver.findElement(By.xpath("//div[@id='i88']/div[3]/div")).click();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[3]/div/div/div[2]/span")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();

    }
}
