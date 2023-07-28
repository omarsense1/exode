package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Settings {

    public Settings () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[contains(text(), 'Настройки')]")
    public WebElement settingsHeader;

    @FindBy(xpath = "//h5[contains(text(), 'Имя')]")
    public WebElement firstNameTextField;

    @FindBy(xpath = "//div/input[@name='firstName']")
    public WebElement firstNameInputField;

    @FindBy(xpath = "//h5[contains(text(), 'Фамилия')]")
    public WebElement lastNameTextField;

    @FindBy(xpath = "//div/input[@name='lastName']")
    public WebElement lastNameInputField;

    @FindBy(xpath = "//h5[contains(text(), 'Адрес страницы')]")
    public WebElement pageAddressTextField;

    @FindBy(xpath = "//div/input[@name='domain']")
    public WebElement pageAddressInputField;

    @FindBy(xpath = "//h5[contains(text(), 'Твоя роль')]")
    public WebElement yourRoleTextFiled;

    @FindBy(xpath = "//h5[contains(text(), 'Пол')]")
    public WebElement sexTextField;

    @FindBy(xpath = "//h5[contains(text(), 'Дата рождения')]")
    public WebElement dateOfBirthTextField;

    @FindBy(xpath = "//span[contains(text(), 'Сохранить')]/../..")
    public WebElement saveBtn;

    @FindBy(xpath = "//span[contains(text(), 'Информация успешно сохранена')]")
    public WebElement informationSuccessfullySavedMessage;
}
