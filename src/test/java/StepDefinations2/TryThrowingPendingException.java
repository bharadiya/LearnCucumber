package StepDefinations2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TryThrowingPendingException {
	@Given("user is on signup page")
	public void user_is_on_signup_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("user enters username on signup page")
	public void user_enters_username_on_signup_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on signup button")
	public void user_clicks_on_signup_button() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("sign up is not successful")
	public void sign_up_is_not_successful() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("throw a pending exception in this case")
	public void throw_a_pending_exception_in_this_case() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
}
