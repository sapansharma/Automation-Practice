import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver" , "/Users/sapansharma/Onedirect/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");
        Actions a = new Actions(driver);

        WebElement move = driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']"));

        a.moveToElement(move).build().perform();

        a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();




    }
}
