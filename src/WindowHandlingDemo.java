import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandlingDemo {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver" , "/Users/sapansharma/Onedirect/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/gmail/about/#");
        driver.findElement(By.xpath("//a[@tabindex='2']")).click();
        String title = driver.getTitle();
        System.out.println("Title of the parent page.");
        System.out.println(title);
        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();

        String parentId = it.next();
        String childId = it.next();

        driver.switchTo().window(childId);
        System.out.println("After switching to child window.");
        System.out.println(driver.getTitle());

        System.out.println("Again switching to parent window.");
        driver.switchTo().window(parentId);
        System.out.println(driver.getTitle());



    }
}
