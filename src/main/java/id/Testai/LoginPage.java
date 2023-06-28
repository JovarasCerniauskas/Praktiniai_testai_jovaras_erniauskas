package id.Testai;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractObjectPage {

   @FindBy(name = "username")
   private WebElement username;

   @FindBy(name  = "password")
   private WebElement password;

   @FindBy(xpath = "//button[contains(.,'Prisijungti')]")
   private WebElement btnPrisijungti;

   @FindBy(xpath = "//a[contains(text(),'Sukurti naują paskyrą')]")
   private WebElement btnSukurtiPaskyra;

   @FindBy(xpath = "//a[contains(text(),'Skaičiuotuvas')]")
   private WebElement isloggedIn;

   @FindBy(xpath = "//span[contains(.,'Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi')]")
   private WebElement isLoginError;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String user)
    {
        username.sendKeys(user);
    }

    public void enterPassword(String pass)
    {
        password.sendKeys(pass);
    }

    public void clickPrisijungti()
    {
        btnPrisijungti.click();
    }

    public void clickSukurtiPaskyra()
    {
        btnSukurtiPaskyra.click();
    }

    public String getLoggedIn()
    {
        return isloggedIn.getText();
    }

    public String getLoginError()
    {
        return isLoginError.getText();
    }



}
