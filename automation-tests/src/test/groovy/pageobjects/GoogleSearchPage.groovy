package pageobjects

import net.serenitybdd.core.annotations.findby.FindBy
import net.serenitybdd.core.pages.PageObject
import net.thucydides.core.annotations.DefaultUrl
import org.openqa.selenium.WebElement

import java.util.concurrent.TimeUnit

@DefaultUrl("https://www.google.by")
class GoogleSearchPage extends PageObject {

    @FindBy(name="q")
    WebElement searchField

    void enterSearchText(String searchText) {
        setImplicitTimeout(10, TimeUnit.SECONDS)
        searchField.sendKeys(searchText)
        searchField.submit()
    }
}
