package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Chatting {
    public Chatting() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[contains(text(), 'Общение')]")
    public WebElement chattingHeader;

    @FindBy(xpath = "//textarea")
    public WebElement chatInputField;

    public static boolean sentMessageIsDisplayed(String message) {
        String locator = "//span[contains(text(), '" + message + "')]";
        Driver.waitForVisibility(By.xpath(locator), 4);
       return Driver.getDriver().findElement(By.xpath("//span[contains(text(), '" + message + "')]")).isDisplayed();
    }

}
