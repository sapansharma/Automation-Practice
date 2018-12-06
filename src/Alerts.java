import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver" , "/Users/sapansharma/Onedirect/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
        driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
        System.out.println(driver.switchTo().alert().getText());


        driver.switchTo().alert().accept();
    }
}
