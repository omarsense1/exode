package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Login {
    public Login() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(text(), 'Войти через email')]")
    public WebElement loginFromEmailBtn;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement emailInputField;

    @FindBy(xpath = "//span[contains(text(), 'Далее')]")
    public WebElement continueBtn;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInputField;

    @FindBy(xpath = "(//span[contains(text(), 'Войти')])[2]")
    public WebElement loginBtn;
}
