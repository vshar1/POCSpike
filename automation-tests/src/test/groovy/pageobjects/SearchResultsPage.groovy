package pageobjects

import net.serenitybdd.core.annotations.findby.By
import net.serenitybdd.core.pages.PageObject
import net.serenitybdd.core.pages.WebElementFacade

class SearchResultsPage extends PageObject{

    boolean searchResultsContain(String searchText) {
        List<WebElementFacade> searchResults = findAll(By.cssSelector("div.srg div.rc h3"))

        if(searchResults[1].getText().toLowerCase().contains(searchText)){
            return true
        }
        return false
    }
}
