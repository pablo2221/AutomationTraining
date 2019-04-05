import pages.homePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.driverProvider;

public class homePageTest{

    private WebDriver driver;
    public homePage homepage;

    @BeforeClass
    public void setup(){

        driver= driverProvider.createDriver("chrome");
        homepage = new homePage(driver);

    }

    @AfterClass
    public void tearDown(){

        driver.quit();

    }

    @Test
    public void testHomePage(){

        driver.get("http://automationpractice.com/index.php");
        homepage.clickWomenOption();

    }

}
