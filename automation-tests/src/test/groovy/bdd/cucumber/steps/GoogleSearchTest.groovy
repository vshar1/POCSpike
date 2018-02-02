package bdd.cucumber.steps

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import pageobjects.GoogleSearchPage
import pageobjects.SearchResultsPage

class GoogleSearchTest {
    GoogleSearchPage googleSearchPage
    SearchResultsPage searchResultsPage

    @Given("^user is on search page")
     void user_is_on_search_page() throws Exception {
       googleSearchPage.open()
    }

    @When("^user enters selenium")
     void user_enters_selenium() throws Exception {
        googleSearchPage.enterSearchText("selenium")
    }

    @Then("^user can see selenium")
     void user_can_see_selenium() throws Exception {
        assert(searchResultsPage.searchResultsContain("selenium").booleanValue()==true)
    }
}
