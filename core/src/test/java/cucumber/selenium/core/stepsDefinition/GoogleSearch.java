package cucumber.selenium.core.stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

    WebDriver driver = null;

    @Given("^browser is open$")
    public void browser_is_open() {
        System.out.println("Inside step - browser is open");

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");

        driver = new ChromeDriver();
    }

    @And("^user is on google search page$")
    public void user_is_on_google_search_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("^user enter a text in search box$")
    public void user_enter_a_text_in_search_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("^user hits enter$")
    public void user_hits_enter() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("^user navigated to search results$")
    public void user_navigated_to_search_results() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
