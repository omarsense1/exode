package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.Chatting;
import utilities.Driver;

import static pages.Chatting.sentMessageIsDisplayed;

public class sendChat {
    Chatting chatting = new Chatting();

    @When("send message {string}")
    public void send_message(String message) {
        Driver.waitForVisibility(chatting.chatInputField, 4);
        chatting.chatInputField.sendKeys(message + Keys.ENTER);
    }

    @Then("verify {string} is displayed on the chat board")
    public void verify_is_displayed_on_the_chat_board(String message) {
        sentMessageIsDisplayed(message);
    }
}
