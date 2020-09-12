Feature: Login in sinatra

  Scenario: Happy path login
    Given I navigate to the home page
    When I log in with credentials frank and sinatra
    Then I am in the Songs Page
    And I can see a welcome message with frank

  Scenario Outline: Login incorrecto
    Given I navigate to the home page
    When I log in with credentials <user> and <password>
    Then I am in the Login Page
    And I can see an error message with "The username or password you entered are incorrect"

    Examples:
      | user    | password |
      | freddie | mercury  |
      | roger   | taylor   |
      | ma      | luma     |