import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebooklogin {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver" , "/Users/sapansharma/Onedirect/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
//        driver.findElement(By.id("email")).sendKeys("sharmasapan10081989@gmail.com");
//        driver.findElement(By.name("pass")).sendKeys("sapan_10");
//        driver.findElement(By.linkText("Forgotten account?")).click();

//        driver.findElement(By.cssSelector("#email")).sendKeys("sharmasapan10081989@gmail.com");
//        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("sapan_10");
//        driver.findElement(By.xpath("//*[@id=\'u_0_8\']")).click();

//        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharmasapan10081989@gmail.com");
//        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("sapan_10");
//        driver.findElement(By.xpath("//input[@value='Log In']")).click();

        driver.findElement(By.cssSelector("#email")).sendKeys("sharmasapan10081989@gmail.com");
        driver.findElement(By.cssSelector("input#pass")).sendKeys("sapan_10");
//        driver.findElement(By.cssSelector("input[value='Log In']")).click();
        Select d = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        d.selectByValue("10");
        Select m = new Select(driver.findElement(By.cssSelector("#month")));
        m.selectByVisibleText("Jun");
        Select y = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        y.selectByIndex(30);






    }
}
