import com.google.common.base.Strings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePractice {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/sapansharma/Onedirect/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18886/eng-vs-ind-4th-test-india-tour-of-england-2018");
        WebElement table1 = driver.findElement(By.cssSelector("#innings_2 > div:nth-child(1)"));

        int rows = table1.findElements(By.xpath("//div[@id='innings_2']/div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']/div[@class='cb-col cb-col-100 cb-scrd-itms']")).size();
        int columns = table1.findElements(By.xpath("//div[@id='innings_2']/div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']/div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]")).size();
        int sum = 0 ;
        for (int i = 0; i < columns - 2; i++) {

           String runs = table1.findElements(By.xpath("//div[@id='innings_2']/div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']/div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]")).get(i).getText();
           int runsbybatsmen = Integer.parseInt(runs);

           sum=sum+runsbybatsmen;

        }

        String extras = table1.findElement(By.cssSelector("#innings_2  div:nth-child(1)  div:nth-child(14)  div.cb-col-8")).getText();

        int totalextras =  Integer.parseInt(extras);
        int finaltotal = sum+totalextras ;

//        System.out.println("My total is " + finaltotal);
        String Total = table1.findElement(By.cssSelector("#innings_2 div:nth-child(1) div:nth-child(15) div.cb-col-8")).getText();
        int Sitetotal =  Integer.parseInt(Total);


        if (finaltotal==Sitetotal){

            System.out.println("Count matched.");
        }
        else {
            System.out.println("Count not matched.");
        }

//        System.out.println("Total by site is : " + Total);
//        String total = runs + extras;
//        System.out.println(total);

//        System.out.println(extras);
//        System.out.println(Total);

        driver.quit();
    }
}
