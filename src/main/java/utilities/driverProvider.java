package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class driverProvider {

    public static WebDriver driver;

    public static WebDriver createDriver (){

        Reader config = new Reader();
        String browser = config.readProperty("BROWSER");

        config.writeProperty("BASEURL","www.gmail.com");

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

    public static void getScreenShotPass (String filename){


        try {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileHandler.copy(scrFile, new File("./screenshots/pass/" + filename +".png"));
            System.out.println("Screenshot was taken");
        } catch (IOException e) {
            System.out.println("Exception while taking screenshot " + e.getMessage());
        }


    }

    public static void getScreenShotFailed (String filename){


        try {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileHandler.copy(scrFile, new File("./screenshots/failed/" + filename +".png"));
            System.out.println("Screenshot was taken");
        } catch (IOException e) {
            System.out.println("Exception while taking screenshot " + e.getMessage());
        }


    }
}
