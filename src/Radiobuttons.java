import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {

    public static void main(String[] args ){

        System.setProperty("webdriver.chrome.driver" , "/Users/sapansharma/Onedirect/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/radio.html");

        int count = driver.findElements(By.xpath("//input[@type='radio']")).size();

        for(int i =0;i<count;i++){

//            String text = driver.findElements(By.xpath("//input[@type='radio']")).get(i).getAttribute()
//            System.out.println(text);

           String s =  driver.findElements(By.xpath("//input[@type='radio']")).get(i).getAttribute("value");

           if (s.equals("Option 3")){

               driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();

           }
        }

    }

}
