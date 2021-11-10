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
        driver.get("https://docs.google.com/forms/u/2/d/e/1FAIpQLScXkFWJEaQg62bP0-modAIrED3yG5jz7bo4pzHrwIfUW-K9Zw/viewform");
        //driver.findElement(By.xpath("//div")).click();
        //driver.findElement(By.xpath("//input[@type='text']")).clear();
        //driver.findElement(By.xpath("//input[@type='text']")).sendKeys("");
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[2]/div[4]/div/div")).click();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div/div/div/input")).clear();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div/div/div/input")).sendKeys("");
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[2]/div[5]/div/div/div[2]/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[2]/div[6]/div/div")).click();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[2]/div[7]/div/div")).click();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[3]/div/div/div/span")).click();
        driver.findElement(By.xpath("//input[@type='text']")).clear();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("102554458");
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div/div/div/input")).clear();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div/div/div/input")).sendKeys("Adolfo Cardenas");
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div/div/div/input")).clear();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div/div/div/input")).sendKeys("147852369");
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[2]/div[5]/div/div/div[2]/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[2]/div[5]/div/div/div[2]/div/div/div/div/input")).clear();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[2]/div[5]/div/div/div[2]/div/div/div/div/input")).sendKeys("Cohan");
        driver.findElement(By.xpath("//input[@type='email']")).click();
        driver.findElement(By.xpath("//input[@type='email']")).clear();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("adolfo@cohan.com");
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[2]/div[7]/div/div/div[2]/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[2]/div[7]/div/div/div[2]/div/div/div/div/input")).clear();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[2]/div[7]/div/div/div[2]/div/div/div/div/input")).sendKeys("45");
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[3]/div/div/div/span/span")).click();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[3]/div/div/div[2]/span/span")).click();
        driver.findElement(By.xpath("//div[@id='i8']/div[3]/div")).click();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[3]/div/div/div[2]/span/span")).click();
        driver.findElement(By.xpath("//div[@id='i24']/div[3]/div")).click();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[3]/div/div/div[2]/span/span")).click();
        driver.findElement(By.xpath("//div[@id='i40']/div[3]/div")).click();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[3]/div/div/div[2]/span")).click();
        driver.findElement(By.xpath("//div[@id='i56']/div[3]/div")).click();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[3]/div/div")).click();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[3]/div/div/div[2]/span")).click();
        driver.findElement(By.xpath("//div[@id='i72']/div[3]/div")).click();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[3]/div/div/div[2]/span/span")).click();
        driver.findElement(By.xpath("//div[@id='i85']/div[3]/div")).click();
        driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[3]/div/div/div[2]/span/span")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();

    }
}
