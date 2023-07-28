@sendChat
Feature: Sending a message in an existing conversation

  Scenario: Sending a message in an existing conversation and verifying it
    Given user navigates to "chat_endpoint"
    Then verify "chatting" is displayed
#    pleas change the message to whatever you want
    When send message "test02"
    Then verify "message" is displayed on the chat board