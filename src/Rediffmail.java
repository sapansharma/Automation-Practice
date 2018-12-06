import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffmail {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver" , "/Users/sapansharma/Onedirect/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.rediff.com/");
        driver.findElement(By.xpath("//a[contains(@title,'Sign in')]")).click();
        driver.findElement(By.cssSelector("input[id*='login1']")).sendKeys("testusername");
        driver.findElement(By.xpath("//input[contains(@name,'passwd')]")).sendKeys("testpassword");
        System.out.println("testing");
        driver.findElement(By.cssSelector("input[name*='proceed']")).click();
        System.out.println("testing2");


    }

}
