import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejet {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver" , "/Users/sapansharma/Onedirect/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
//        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
//        driver.findElement(By.xpath("///a[@value='BLR']")).click();
//        driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
//        System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
//        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
//        System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());

        System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());
        driver.findElement(By.xpath("//label[@for='switch__input_2']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());


        String s = driver.findElement(By.xpath("//div[@class='fd_heading clearfix']")).getText();

        System.out.println("The text displaying is " + s);

    }
}
