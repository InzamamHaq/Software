package org.stepdefinition;

import org.bas.BaseClass;
import org.los.Login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Flipkartcucumber extends BaseClass{
	@Given("To launch the chrome browser and maximise window")
	public void to_launch_the_chrome_browser_and_maximise_window() {
		launchBrowser();
		windowMaximize();
	}
	@When("To launch the url of the flipkart application")
	public void to_launch_the_url_of_the_flipkart_application() {
		launchUrl("https://www.flipkart.com/account/login");
	}
	@When("To pass valid username in email field")
	public void to_pass_valid_username_in_email_field() {
		Login l = new Login();
		passText("inzamambash@gmail.com", l.getEmail());
	}
	@When("To click the LoginBtn")
	public void to_click_the_LoginBtn() {
		Login l = new Login();
		clickBtn(l.getLogin());
	}
	@When("To check whether navigaten to the home page or not")
	public void to_check_whether_navigaten_to_the_home_page_or_not() {
		System.out.println("To check your login id");
	}
	@Then("To close the browser")
	public void to_close_the_browser() {
		closeEntireBrowser();
	}
}
