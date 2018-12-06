import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestiondropdown {


    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver" , "/Users/sapansharma/Onedirect/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.ksrtc.in/oprs-web/guest/home.do?h=1");

        driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys("beng");
        driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys(Keys.DOWN);
//        driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys(Keys.DOWN);


        JavascriptExecutor js = (JavascriptExecutor)driver;

        String script = "return document.getElementById(\"fromPlaceName\").value;";

        String val  = (String) js.executeScript(script);
        int i = 0;

//        if(val!="BENGALURU DARSHINI"){
//
//             driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys(Keys.DOWN);
//
//        }

        while (!val.equalsIgnoreCase("BENGALURU DARSHINI")){

            driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys(Keys.DOWN);

            val  = (String) js.executeScript(script);
            System.out.println(val);
            i++;

            if(i>10){
                break;
            }

//            driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys(Keys.ENTER);
//            driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys(Keys.TAB);

        }



        if (val.equalsIgnoreCase("BENGALURU DARSHINI")){
//
            driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys(Keys.ENTER);
            driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys(Keys.TAB);
        }

        driver.quit();

    }
}
