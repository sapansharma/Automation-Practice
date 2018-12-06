import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver" , "/Users/sapansharma/Onedirect/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.qaclickacademy.com/practice.php");


        //find out the no. of links in the webpage

        int a = driver.findElements(By.tagName("a")).size();
        System.out.println(a);


        // get the no.of links in only footer section

        WebElement footerdriver = driver.findElement(By.id("gf-BIG"));  // limiting webdriver scope
        System.out.println(footerdriver.findElements(By.tagName("a")).size());

        //get the no. of links in a column given in footer section.

        WebElement columnfooter =  footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columnfooter.findElements(By.tagName("a")).size());

        for(int i=1;i<columnfooter.findElements(By.tagName("a")).size();i++)
        {

            String clickonlink=Keys.chord(Keys.CONTROL,Keys.ENTER);

            columnfooter.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);

            Thread.sleep(5000);

        }

    }
}
