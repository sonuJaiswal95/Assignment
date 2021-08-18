package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {


	@Given("user is to login page")
	public void user_is_to_login_page() {

		System.out.println("Inside step - user is on login page");

	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Inside step - user enters username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Inside step- click on login button");

	}

	@Then("user is navigate to the home page")
	public void user_is_navigate_to_the_home_page() {
		System.out.println("Inside step user navigated to the home page");

	}



}
