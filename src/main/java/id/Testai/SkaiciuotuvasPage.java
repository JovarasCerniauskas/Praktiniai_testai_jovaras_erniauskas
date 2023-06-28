package id.Testai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SkaiciuotuvasPage extends AbstractObjectPage{


    @FindBy(id = "Sk1")
    private WebElement sk1;

    @FindBy(id = "Sk2")
    private WebElement sk2;

    @FindBy(name = "zenklas")
    private WebElement operacija;

    @FindBy(xpath = "//input[@value='skaičiuoti']")
    private WebElement btnSkaiciuoti;

    @FindBy(xpath = "//a[contains(text(),'Logout')]" )
    private WebElement btnLogout;

    @FindBy(xpath = "//h4")
    private WebElement mathResult;

    @FindBy(xpath="//h1[contains(.,'Whitelabel Error Page')]")
    private WebElement mathError;

    @FindBy(xpath = "//a[contains(.,'Atliktos operacijos')]")
    private WebElement opList;

    public void enterFirstNumber(String number1)
    {
        sk1.clear();
        sk1.sendKeys(number1);
    }

    public void enterSecondNumber(String number2)
    {
        sk2.clear();
        sk2.sendKeys(number2);
    }

    public void selectDivionOperation()
    {
        Select mathOp = new Select(operacija);
        mathOp.selectByVisibleText("Dalyba");
    }

    public void clickSkaiciuoti()
    {
        btnSkaiciuoti.click();
    }

    public String getResults()
    {
        return mathResult.getText();
    }

    public String getError()
    {
        return mathError.getText();
    }
    public SkaiciuotuvasPage(WebDriver driver) {
        super(driver);
    }
}
