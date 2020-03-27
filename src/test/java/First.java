
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class First {
    protected WebDriver driver;

    public First(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
