import org.openqa.selenium.By;
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

    @Test
    public void testHomePage2(){

        driver.get("http://automationpractice.com/index.php");
        homepage.clickDressesoption();

    }

    @Test
    public void cssSelectorTest()throws Throwable{

        driver.get("http://automationpractice.com/index.php");
        System.out.println(driver.findElement(By.cssSelector("a[title$='T-shirts']")));


    }

    @Test
    public void xpathSelector()throws Throwable{

        driver.get("https://wordpress.com/log-in");
        System.out.println(driver.findElement(By.xpath("//p[@class='login__form-terms']/a[target$='_blank']")).getText());

    }



}
