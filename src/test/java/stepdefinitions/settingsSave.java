package stepdefinitions;

import groovy.util.logging.Log;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.Chatting;
import pages.Login;
import pages.Settings;
import utilities.ConfigurationReader;
import utilities.Driver;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static pages.Chatting.sentMessageIsDisplayed;

public class settingsSave {
    Settings settings = new Settings();
    Login login = new Login();
    Chatting chatting = new Chatting();

    @Given("user navigates to {string}")
    public void user_navigates_to(String path) {
        Driver.getDriver().get(ConfigurationReader.getProperty(path));
        login.loginFromEmailBtn.click();
        Driver.waitForVisibility(login.emailInputField, 4);
        login.emailInputField.sendKeys(ConfigurationReader.getProperty("email"));
        login.continueBtn.click();
        Driver.waitForVisibility(login.passwordInputField, 4);
        login.passwordInputField.sendKeys(ConfigurationReader.getProperty("password"));
        login.loginBtn.click();

    }

    @Then("verify {string} is displayed")
    public void verify_is_displayed(String field) {

        switch (field) {
            case "settings":
                Driver.waitForVisibility(settings.settingsHeader, 4);
                assertTrue(settings.settingsHeader.isDisplayed());
                break;
            case "firstName":
                Driver.waitForVisibility(settings.firstNameTextField, 4);
                assertTrue(settings.firstNameTextField.isDisplayed());
                assertTrue(settings.firstNameInputField.isDisplayed());
                break;
            case "lastName":
                Driver.waitForVisibility(settings.lastNameTextField, 4);
                assertTrue(settings.lastNameTextField.isDisplayed());
                assertTrue(settings.lastNameInputField.isDisplayed());
                break;
            case "pageAddress":
                Driver.waitForVisibility(settings.pageAddressTextField, 4);
                assertTrue(settings.pageAddressTextField.isDisplayed());
                assertTrue(settings.pageAddressInputField.isDisplayed());
                break;
            case "yourRole":
                Driver.waitForVisibility(settings.yourRoleTextFiled, 4);
                assertTrue(settings.yourRoleTextFiled.isDisplayed());
                break;
            case "sex":
                Driver.waitForVisibility(settings.sexTextField, 4);
                assertTrue(settings.sexTextField.isDisplayed());
                break;
            case "dateOfBirth":
                Driver.waitForVisibility(settings.dateOfBirthTextField, 4);
                assertTrue(settings.dateOfBirthTextField.isDisplayed());
                break;
            case "saveButton":
                Driver.waitForVisibility(settings.saveBtn, 4);
                assertTrue(settings.saveBtn.isDisplayed());
                break;
            case "informationSuccessfullySavedMessage":
                Driver.waitForVisibility(settings.informationSuccessfullySavedMessage, 4);
                assertTrue(settings.informationSuccessfullySavedMessage.isDisplayed());
                break;
            case "chatting":
                Driver.waitForVisibility(chatting.chattingHeader, 4);
                assertTrue(chatting.chattingHeader.isDisplayed());
        }
    }


    @And("enter {string} to {string} input field")
    public void enterToInputField(String value, String field) throws InterruptedException {
        switch (field) {
            case "firstName":
                settings.firstNameInputField.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
                settings.firstNameInputField.sendKeys(value);
                break;
            case "lastName":
                settings.lastNameInputField.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
                settings.lastNameInputField.sendKeys(value);
        }
    }

    @And("verify {string} is disabled")
    public void verifyIsDisabled(String field) {
        switch (field) {
            case "saveButton":
                assertFalse(settings.saveBtn.isEnabled());
        }
    }

    @And("verify {string} is enabled")
    public void verifyIsEnabled(String field) {
        switch (field) {
            case "saveButton":
                assertTrue(settings.saveBtn.isEnabled());
        }
    }

    @And("click on {string}")
    public void clickOn(String field) {
        switch (field) {
            case "saveButton":
                settings.saveBtn.click();
        }
    }
}
