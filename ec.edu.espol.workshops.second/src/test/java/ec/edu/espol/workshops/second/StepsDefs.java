package ec.edu.espol.workshops.second;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

import ec.edu.espol.workshops.second.CarInsurance;
import ec.edu.espol.workshops.second.models.Customer;

public class StepsDefs {

	private Customer customer;
	private Float actualAnswer;


	
	@Given("The customer is older than {int} years old")
	public void the_customer_is_older_than_years_old(Integer age) {
		customer =  new Customer(age, "MALE", true );
	}
	

	
	@Given("The customer is a young single men")
	public void the_customer_is_a_young_single_men() {
		customer =  new Customer(18, "M", false );
	}
	
	@Given("The customer is an adult married women")
	public void the_customer_is_an_adult_married_women() {
		customer =  new Customer(25, "F", true );
	}

	@When("I calculate the insurance prime")
	public void i_calculate_insurance_prime() {
    	 actualAnswer = CarInsurance.getPremiumInsurance(customer);	
	}

	
	@Then("The system should show {float}")
	public void the_system_should_show(Float expectedAnswer) {
		assertEquals(expectedAnswer, actualAnswer);
	}

}