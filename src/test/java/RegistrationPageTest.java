import id.Testai.LoginPage;
import id.Testai.RegistrationPage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class RegistrationPageTest extends BaseTest {

        @Test
        public void registrationPagePositiveTest()
        {
                setUp();
                RegistrationPage registrationPage = new RegistrationPage(driver);

                LoginPage loginPage = new LoginPage(driver);

                loginPage.clickSukurtiPaskyra();

                registrationPage.enterUsername("useris4");

                registrationPage.enterPassword("password123");

                registrationPage.enterConfirmPassword("password123");

                registrationPage.clickSukurti();

                String isLoggedIn =  registrationPage.getLoggedIn();


                Assertions.assertEquals("Logout, useris4", isLoggedIn);

        }
        @Test
        public void registrationPageNegativeTest()
        {
                setUp();
                RegistrationPage registrationPage = new RegistrationPage(driver);

                LoginPage loginPage = new LoginPage(driver);

                loginPage.clickSukurtiPaskyra();

                registrationPage.enterUsername("");

                registrationPage.enterPassword("password123");

                registrationPage.enterConfirmPassword("password123");

                registrationPage.clickSukurti();

                String isError =  registrationPage.getError();

                Assertions.assertEquals("Šį laukelį būtina užpildyti\n" +
                        "Privaloma įvesti nuo 3 iki 32 simbolių", isError );
        }

}
