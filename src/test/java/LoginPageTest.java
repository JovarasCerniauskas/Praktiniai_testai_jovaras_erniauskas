import id.Testai.LoginPage;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPageTest extends BaseTest{


    @Test
    public void loginPagePositiveTest()
    {
        setUp();

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("useris");

        loginPage.enterPassword("password123");

        loginPage.clickPrisijungti();

        String isLoggedIn = loginPage.getLoggedIn();

        Assertions.assertEquals("Skaičiuotuvas", isLoggedIn);
    }
    @Test
    public void loginPageNegativeTest()
    {
        setUp();

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("useris");

        loginPage.enterPassword("");

        loginPage.clickPrisijungti();

        String isNotLoggedIn = loginPage.getLoginError();

        Assertions.assertEquals("Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi", isNotLoggedIn);

    }
}
