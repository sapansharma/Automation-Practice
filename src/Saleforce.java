import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saleforce {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver" , "/Users/sapansharma/Onedirect/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/?locale=in");

//        driver.findElement(By.id("username")).sendKeys("This is Sapan");
//        driver.findElement(By.id("password")).sendKeys("12345");
//        driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
//        System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());


        //Css

        driver.findElement(By.cssSelector("input#username")).sendKeys("This is Sapan");
        driver.findElement(By.cssSelector("#password")).sendKeys("test");
        driver.findElement(By.cssSelector("input#Login")).click();

    }
}
