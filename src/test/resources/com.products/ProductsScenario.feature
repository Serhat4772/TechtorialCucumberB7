Feature: Validation of the Products Page

  @products
  Scenario: Validation of the new Product Creation
    Given the user navigates product website home page
    When  the user enters the product info "MyMoney" and "4"
    And   the user enters the address info "Techtorial", "2200 E Devon", "Des Plaines", "IL", "60018"
    *     the user enters the card info "Visa", "1234567896", "04/22"
    And   the user validate success messages
    Then  the user validate product details "MyMoney", "4", "Techtorial", "2200 E Devon", "Des Plaines", "IL", "60018", "Visa", "1234567896", "04/22"

  @products @outline
  Scenario Outline: Validation of the new Product Creation
    Given the user navigates product website home page
    When  the user enters the product info "<productName>" and "<quantity>"
    And   the user enters the address info "<name>", "<street>", "<city>", "<state>", "<zipcode>"
    *     the user enters the card info "<cardType>", "<cardNumber>", "<expireDate>"
    And   the user validate success messages
    Then  the user validate product details "<productName>", "<quantity>", "<name>", "<street>", "<city>", "<state>", "<zipcode>", "<cardType>", "<cardNumber>", "<expireDate>"

    Examples:
      | productName | quantity | name       | street       | city        | state | zipcode | cardType         | cardNumber | expireDate |
      | MyMoney     | 4        | Techtorial | 2200 E Devon | Des Plaines | IL    | 60018   | Visa             | 1234567896 | 04/22      |
      | FamilyAlbum | 2        | Academy    | 2200 E Devon | Austin      | TX    | 90054   | MasterCard       | 9876543215 | 06/25      |
      | ScreenSaver | 3        | Alex       | 4420 E Devon | Chicago     | IL    | 55612   | American Express | 5432167896 | 02/28      |
      | MyMoney     | 5        | Mike       | 5316 E Devon | Naperville  | IL    | 60630   | Visa             | 1234567896 | 03/22      |
      | FamilyAlbum | 1        | Kushal     | 6537 E Devon | Pleinfield  | TX    | 60012   | MasterCard       | 6543687925 | 02/25      |
      | ScreenSaver | 2        | Priyanka   | 3225 E Devon | Rockford    | IL    | 55346   | American Express | 7896554436 | 01/28      |

