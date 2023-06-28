import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class BaseTest {

    protected WebDriver driver;

    @BeforeEach
    public void setUp(){

       ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
       driver = new ChromeDriver(options);
       driver.get("http://localhost:8080/prisijungti");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterEach
    public void closeBrowser()
    {
        driver.close();
    }
}
