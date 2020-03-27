import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


public class TestClass {
   // public String exePath = "/Tools/geckodriver.exe";
    public WebDriver driver = new FirefoxDriver();



    @BeforeClass
    public void init() {
        //System.setProperty("webdriver.gecko.driver", exePath);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test
    public void testLoginInWikipedia() {

        String startWikipediaPage = "https://ru.wikipedia.org/wiki";
        driver.get(startWikipediaPage);

        StartWikipediaPage wikipediaPage = new StartWikipediaPage(driver);

        wikipediaPage.clickLoginButon();
        wikipediaPage.inputLogin("Oksana");
        wikipediaPage.inputPasword("333444555");
        wikipediaPage.clickEnterButon();
    }
}