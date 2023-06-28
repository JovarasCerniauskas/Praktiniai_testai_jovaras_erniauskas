import id.Testai.LoginPage;
import id.Testai.RegistrationPage;
import id.Testai.SkaiciuotuvasPage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
public class SkaiciuotuvasPageTest extends BaseTest {

    @Test
    public void SkaiciuotuvasPagePositiveDivisionTest()
    {
        setUp();
        LoginPage loginPage = new LoginPage(driver);

        SkaiciuotuvasPage skaiciuotuvasPage = new SkaiciuotuvasPage(driver);

        loginPage.enterUsername("useris");

        loginPage.enterPassword("password123");

        loginPage.clickPrisijungti();

        skaiciuotuvasPage.enterFirstNumber("10");

        skaiciuotuvasPage.enterSecondNumber("5");

        skaiciuotuvasPage.selectDivionOperation();

        skaiciuotuvasPage.clickSkaiciuoti();

        String result =  skaiciuotuvasPage.getResults();

        Assertions.assertEquals("10 / 5 = 2", result);
    }
    @Test
    public void SkaiciuotuvasPageNegativeDivisionTest()
    {
        setUp();
        LoginPage loginPage = new LoginPage(driver);

        SkaiciuotuvasPage skaiciuotuvasPage = new SkaiciuotuvasPage(driver);

        loginPage.enterUsername("useris");

        loginPage.enterPassword("password123");

        loginPage.clickPrisijungti();

        skaiciuotuvasPage.enterFirstNumber("0");

        skaiciuotuvasPage.enterSecondNumber("0");

        skaiciuotuvasPage.selectDivionOperation();

        skaiciuotuvasPage.clickSkaiciuoti();

        String result = skaiciuotuvasPage.getError();

        Assertions.assertEquals("Whitelabel Error Page", result);


    }
    @Test
    public void SkaiciuotuvasPagePositiveOperationSearch()
    {
        setUp();
        LoginPage loginPage = new LoginPage(driver);

        SkaiciuotuvasPage skaiciuotuvasPage = new SkaiciuotuvasPage(driver);

        loginPage.enterUsername("useris");

        loginPage.enterPassword("password123");

        loginPage.clickPrisijungti();


    }


}
