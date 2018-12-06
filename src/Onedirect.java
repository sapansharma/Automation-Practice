import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Onedirect {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=null;
        try{
        System.setProperty("webdriver.chrome.driver" , "/Users/sapansharma/Onedirect/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://testing.onedirectdev117.in/sso/login");

        //xpaths
//        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("varun.helpchat@gmail.com");
//        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("t");
//        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //Css

        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("varun.helpchat@gmail.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("t");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
         Thread.sleep(3000L);

        driver.findElement(By.xpath("//span[contains(text(),'SERVICE CLOUD')]")).click();

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

//        driver.findElement(By.xpath("//i[@class='icon-search header-search-icon']")).click();

        //I = driver.findElement(By.xpath("//div[@class=\'ticketId\']"));
        //I.selectByIndex(0);

        List<WebElement> ticketIdList = driver.findElements(By.xpath("//div[@class='ticketId']/a"));
        for (int i = 0;i<ticketIdList.size();i++)
        {

            WebElement element = ticketIdList.get(i);
            String val=element.getText();
            System.out.println(val);
            if(val.equals("6266499")){
                System.out.println("inside loop>>");
                 element.click();
                 break;
            }

        }
        Thread.sleep(5000);

    } catch(Exception e){
         e.printStackTrace();
    }finally{
            driver.quit();
        }
    }
}
