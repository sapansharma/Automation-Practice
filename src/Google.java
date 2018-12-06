import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver" , "/Users/sapansharma/Onedirect/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath("//div[@class='lst-c']/div/div[2]/div/input")).sendKeys("testing");
        driver.findElement(By.xpath("//div[@class='jsb']/center/input[1]")).click();
        driver.findElement(By.xpath("//div[@id='ires']/div/div[1]/div/div[1]/div/div/h3/a")).click();
    }

}
