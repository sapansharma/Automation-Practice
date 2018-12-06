import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Qaclickacademy {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver" , "/Users/sapansharma/Onedirect/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.qaclickacademy.com/");

        //Through Absolute Xpath

        driver.findElement(By.xpath("//div[@role='navigation']/div/nav/ul/li[4]")).click();
        driver.findElement(By.xpath("//li[@id='tablist1-tab1']")).click();
        System.out.println("test1");
        driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[1]")).click();
        System.out.println("test2");
        driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[1]/following-sibling::li[1]")).click();
        System.out.println("test3");
        driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[1]/parent::ul/li[4]")).click();
        System.out.println("test4");
//        driver.manage().timeouts().implicitlyWait(5 , TimeUnit.SECONDS);
        driver.navigate().back();

        //Through Xpath using text

//        driver.findElement(By.xpath("//*[text()=' Appium ']")).click();
//        driver.findElement(By.xpath("//*[text()=' Selenium ']")).click();
//        driver.findElement(By.xpath("//*[text()=' Soap UI ']")).click();
//        driver.findElement(By.xpath("//*[text()=' Testing ']")).click();

    }
}
