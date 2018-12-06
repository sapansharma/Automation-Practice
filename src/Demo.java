import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo{

    public static void main(String[] args){

        System.setProperty("webdriver.gecko.driver","/Users/sapansharma/Onedirect/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://admin.onedirect.in/");
        System.out.println(driver.getTitle());

    }
}