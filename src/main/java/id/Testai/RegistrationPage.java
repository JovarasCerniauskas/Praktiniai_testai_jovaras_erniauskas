package id.Testai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public  class RegistrationPage extends AbstractObjectPage {

    @FindBy(id = "username")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "passwordConfirm")
    private WebElement passwordConfirm;

    @FindBy(xpath = "//button[contains(.,'Sukurti')]")
    private WebElement btnSukurti;

    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    private WebElement isloggedIn;

    @FindBy(id = "username.errors")
    private WebElement isRegistrationError;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public  void enterUsername(String user)
    {
        username.sendKeys(user);
    }

    public void enterPassword(String pass)
    {
        password.sendKeys(pass);
    }

    public void enterConfirmPassword(String confirmPass)
    {
        passwordConfirm.sendKeys(confirmPass);
    }

    public void clickSukurti()
    {
        btnSukurti.click();
    }

    public String getLoggedIn()
    {
        return isloggedIn.getText();
    }

    public String getError()
    {
        return isRegistrationError.getText();
    }




}
