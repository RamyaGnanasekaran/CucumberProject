Feature: To Test the add Customer functionality - Input Form

  Scenario Outline: To enter the Add Customer details in Input Form
    Given The User is in gurantetelecom home page to submit the Input Form
    And The User navigates to Input Form page
    When The user fill in the Input Form details "<fname>", "<lname>", "<email>", "<phone>", "<address>", "<city>", "<pincode>", "<domain>", "<desc>"
    And the User clicks the submit button
    Then The Customer ID should be generated for the user

    Examples: 
      | fname | lname | email             | phone      | address    | city       | pincode | domain     | desc              |
      | Ramya | G     | ramya02@gmail.com | 7765678876 | Royapettah | Chennai    |  600045 | Air Domain | Air Travel Domain |
      | Abi   | S     | abi677@gmail.com  | 7765678876 | Royapettah | Kumbagonam |  600050 | Air Domain | Air Travel Domain |
