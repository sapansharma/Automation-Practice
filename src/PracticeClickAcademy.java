import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class PracticeClickAcademy {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver" , "/Users/sapansharma/Onedirect/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.qaclickacademy.com/practice.php");
        driver.findElement(By.cssSelector("input[value='radio1']")).click();
        driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("India",Keys.TAB);


        Select s = new Select(driver.findElement(By.id("dropdown-class-example")));

        s.selectByIndex(1);

//        Boolean status = driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected();
//
//        if (status = false){
//
//            driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
//
//        }

        driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
        driver.findElement(By.cssSelector("#openwindow")).click();
        driver.findElement(By.cssSelector("#opentab")).click();

        Set <String> id = driver.getWindowHandles();
       Iterator<String> it = id.iterator();
       String parentId = it.next();
       String childId = it.next();
       String childTab = it.next();

       driver.switchTo().window(parentId);
        System.out.println("In parent window");
        System.out.println(driver.getTitle());
       driver.switchTo().window(childId);
        System.out.println("In child window");
        System.out.println(driver.getTitle());
        driver.switchTo().window(childTab);
        System.out.println("In child tab");
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentId);
        System.out.println("In parent window.");

        driver.findElement(By.cssSelector("#name")).sendKeys("Sapan");
        driver.findElement(By.cssSelector("#alertbtn")).click();
        driver.switchTo().alert().accept();
        driver.findElement(By.cssSelector("#confirmbtn")).click();
        driver.switchTo().alert().dismiss();

        System.out.println(driver.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed());
        driver.findElement(By.xpath("//input[@value='Hide']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed());
        driver.findElement(By.xpath("//input[@value='Show']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed());
        driver.findElement(By.xpath("//input[@id='displayed-text']")).sendKeys("Sapan 1");

        Actions a = new Actions(driver);
        WebElement move = driver.findElement(By.cssSelector("#mousehover"));
        WebElement top = driver.findElement(By.xpath("//div[@class='mouse-hover-content']/a[1]"));
        a.moveToElement(move).click(top).build().perform();
        System.out.println(driver.getCurrentUrl());


        WebElement iframeobject = driver.findElement(By.cssSelector("#courses-iframe"));
//        WebElement iframeobject2 = driver.findElement(By.xpath("div.sumome-react-wysiwyg-popup-animation-group"));

        driver.switchTo().frame(iframeobject);
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.sumome-react-wysiwyg-popup-animation-group")));

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sapan@test.com");
        driver.findElement(By.xpath("//*[text()='Subscribe Now']")).click();
        driver.switchTo().defaultContent();

        System.out.println("Practice Done.");

        Thread.sleep(3000);
        driver.quit();




    }
}
