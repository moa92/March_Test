import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartWikipediaPage extends First {

    @FindBy(css = "#pt-login > a:nth-child(1)")
    private WebElement LoginButon;

    @FindBy(css = "#wpName1")
    private WebElement InputLoginField;

    @FindBy(css = "#wpPassword1")
    private WebElement InputPasswordField;

    @FindBy(css = "#wpLoginAttempt")
    private WebElement EnterButon;

    public StartWikipediaPage(WebDriver driver) {
        super(driver);
    }

    public void clickLoginButon (){
        LoginButon.click();
    }

    public void clickEnterButon (){
        EnterButon.click();
    }


    public void inputLogin(String login){
        InputLoginField.click();
        InputLoginField.clear();
        InputLoginField.sendKeys(login);
    }

    public void inputPasword(String pasword){
        InputPasswordField.click();
        InputPasswordField.clear();
        InputPasswordField.sendKeys(pasword);
    }

}

