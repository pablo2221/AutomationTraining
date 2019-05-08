package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class driverProvider {

    public static WebDriver driver;

    public static WebDriver createDriver (){

        Reader config = new Reader();
        String browser = config.readProperty("BROWSER");

        switch (browser){

            case "chrome":

                WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver();
                break;

            case "firefox":

                WebDriverManager.firefoxdriver().setup();
                driver= new FirefoxDriver();
                break;
        }

        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);

        return  driver;
    }
}
