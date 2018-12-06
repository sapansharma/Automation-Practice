import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IframesPractice {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver" , "/Users/sapansharma/Onedirect/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://toolsqa.com/iframe-practice-page/");
//        WebElement frame1 = driver.findElement(By.xpath("//div[@class='wpb_wrapper']/div[1]"));
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe#IF1")));
        String text1 =  driver.findElement(By.xpath("//div[@class='wpb_wrapper']/div[1]/p[2]")).getText();
        System.out.println(text1);

//        driver.get("http://jqueryui.com/droppable/");
//        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
//        WebElement source = driver.findElement(By.cssSelector("div[id='draggable']"));
//        WebElement target = driver.findElement(By.cssSelector("div[id='droppable']"));
//        Actions a = new Actions(driver);
//        a.dragAndDrop(source , target).build().perform();

        driver.switchTo().defaultContent();

        driver.switchTo().frame(driver.findElement(By.cssSelector("form[class='form-horizontal']")));
        driver.findElement(By.xpath("//a[@title='Automation Practice Form']")).click();
        System.out.println("Clicked");
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sapan");
        System.out.println("Typed");




    }
}
