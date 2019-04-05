package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

    @FindBy(linkText = "Women")
    private WebElement womenOption;

    @FindBy(linkText = "Dresses")
    private WebElement dressOption;

    private WebDriver driver;
    public homePage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(this.driver,this);
    }

    public void clickWomenOption() {

        womenOption.click();

    }

    public void clickDressesoption(){

        dressOption.click();

    }
}
