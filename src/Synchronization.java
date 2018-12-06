import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Synchronization {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver" , "/Users/sapansharma/Onedirect/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.alaskaair.com/");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='fromCity1']")).sendKeys("nyc");
        driver.findElement(By.xpath("//input[@id='fromCity1']")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//input[@id='toCity1']")).sendKeys("dal");
        driver.findElement(By.xpath("//input[@id='toCity1']")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//input[@id='departureDate1']")).sendKeys(Keys.ENTER);

        WebDriverWait d = new WebDriverWait(driver,20);
        d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ContinueButton']")));
        driver.findElement(By.xpath("//input[@id='ContinueButton']")).click();
        d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ResultsError0\"]/a[1]")));


    }
}
