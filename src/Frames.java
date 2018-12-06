import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Frames {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver" , "/Users/sapansharma/Onedirect/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://testing.onedirectdev117.in/sso/login");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("varun.helpchat@gmail.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("t");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='product-item-title']/span[contains (text() , 'SERVICE CLOUD')]")).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//i[@class='icon-plus_line']")).click();

//        Actions createTicket = new Actions(driver);
//        createTicket.moveToElement(driver.findElement(By.xpath("//i[@class='icon-plus_line']"))).click();

        driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("test subject");



    }
}
