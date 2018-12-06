import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chromeinvoke {

    public static void main(String[] args)
    {
       //setting chrome property
        System.setProperty("webdriver.chrome.driver" , "/Users/sapansharma/Onedirect/chromedriver");


        //creating object for webdriver

        WebDriver driver = new ChromeDriver();

        //invoking url
        driver.get("http://www.google.com");

        //validating page url title
        System.out.println(driver.getTitle());

        //validating page url

        System.out.println(driver.getCurrentUrl());

        driver.get("http://yahoo.com");
        System.out.println(driver.getTitle());

        driver.navigate().back();

        System.out.println(driver.getTitle());
        driver.navigate().forward();
        System.out.println(driver.getTitle());
        driver.quit();


    }
}
