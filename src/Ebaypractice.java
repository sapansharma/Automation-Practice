import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ebaypractice {

    public static void main(String[] agrs){

        System.setProperty("webdriver.chrome.driver" , "/Users/sapansharma/Onedirect/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.in/cat/mobiles");
        int alllinks = driver.findElements(By.tagName("a")).size();
        System.out.println(alllinks);

       WebElement footer =  driver.findElement(By.cssSelector("ul#gf-l"));
        int footerlink = footer.findElements(By.tagName("a")).size();
        System.out.println(footerlink);

        for(int i=0 ; i<footer.findElements(By.tagName("a")).size();i++){

            String footerlinks = Keys.chord(Keys.CONTROL +"t");

           //I need to open all these links in footer in new tab.

        }

    }
}
