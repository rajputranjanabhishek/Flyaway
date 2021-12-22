package com.steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

	public static WebDriver driver;
	public static LoginClass fly;

	@Given("user has opened Application")
	public void user_has_opened_application() throws InterruptedException {
		fly.Home();
		System.out.println("user has opened Application");
	}

	@When("user opens Home page")
	public void user_opens_home_page() throws InterruptedException {
		fly.MEMBER_LOGIN();
		System.out.println("user opens Home page");
	}

	@Then("user should be navigated to home page")
	public void user_should_be_navigated_to_home_page() {
		System.out.println("user should be navigated to home page");
	}

	@Given("user has opened login page")
	public void user_has_opened_login_page() throws InterruptedException {
		fly.Login();
		fly.Nav_Home();
		System.out.println("user has opened login page");
	}

	@Given("user opts to register")
	public void user_opts_to_register() throws InterruptedException {
		fly.Register();
		System.out.println("user opts to register");
	}

	@When("user enters details required")
	public void user_enters_details_required() throws InterruptedException {
		fly.See_Bookings();
		System.out.println("user enters details required");
	}

	@Given("user clicks on the book flight")
	public void user_clicks_on_the_book_flight() {
		System.out.println("user clicks on the book flight");
	}
	@When("user is on payment page clicks on complete booking")
	public void user_is_on_payment_page_clicks_on_complete_booking() {
		System.out.println("user is on payment page clicks on complete booking");
	}
	@Then("user is able to see the booked flights")
	public void user_is_able_to_see_the_booked_flights() {
		System.out.println("user is able to see the booked flights");
	}



}