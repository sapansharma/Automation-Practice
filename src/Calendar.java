import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calendar {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver" , "/Users/sapansharma/Onedirect/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testing.onedirect.in/sso/login");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("chris.onedirect10@gmail.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("t");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(3000L);

        driver.findElement(By.xpath("//span[contains(text(),'SERVICE CLOUD')]")).click();

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("[class='right-header-section od-info-popover'] [class='icon-search header-search-icon']")).click();

        WebDriverWait searchbox = new WebDriverWait(driver,10);
        searchbox.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='searchInput']")));

        driver.findElement(By.cssSelector("input[name='searchInput']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("[class='icon-arrow-down tag-icon']")).click();
        driver.findElement(By.cssSelector("#created_8")).click();
        driver.findElement(By.xpath("//app-prime-calendar/span/input[@type='text']")).click();


        while(!driver.findElement(By.cssSelector("[class='ui-datepicker-title']")).getText().contains("June 2018")){

            driver.findElement(By.cssSelector("[class='ui-datepicker-prev ui-corner-all']")).click();

        }
        try{
            Thread.sleep(7000);
            System.out.println("SLEEP Completed..");
            //List<WebElement> date = driver.findElements(By.cssSelector("tbody.ng-tns-c29-1>tr>td > a"));
            List<WebElement> dateList = driver.findElements(By.cssSelector(".ui-datepicker-calendar tr td"));

            int count = dateList.size();
            System.out.println("Count value "+count);


//            for(int i=0;i<count;i++){

  //              String text = driver.findElements(By.cssSelector(".ui-datepicker-calendar tr td a")).get(i).getText();


                for(WebElement element:dateList){
                    String val = element.getText();
                    System.out.println("value of date is:"+val);
                    if(val.equalsIgnoreCase("10")||val.equalsIgnoreCase("20")){
                        element.click();
                    }

                }



                //System.out.println("value of date is:"+text);
//                if (text.equalsIgnoreCase("10")){
//                    driver.findElements(By.cssSelector(".ui-datepicker-current-day")).click();
//                }if (text.equalsIgnoreCase("20")){
//                    driver.findElement(By.cssSelector(".ui-datepicker-current-day")).click();
//                }
//
//            }
        } catch (Exception ex) {
            System.out.println(ex.getStackTrace());
        }


        driver.findElement(By.xpath("//button[text()='Done']")).click();
        driver.findElement(By.xpath("//button[text()='Apply Filter']")).click();




        Thread.sleep(5000);
        driver.quit();
    }
}
