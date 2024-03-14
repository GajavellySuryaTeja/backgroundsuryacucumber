package Stepsfortag;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steptags {
	
	
	@Given("testcases preparation")
	public void testcases_preparation() {
		System.out.println("this is manual testing concept");
	}

	@And("selenium tool")
	public void selenium_tool() {
		System.out.println("this is automation programing setup by using tool of selenium");
	}

	@Then("json format")
	public void json_format() {
		System.out.println("this is api testing");
	}

	@And("using load runner")
	public void using_load_runner() {
		System.out.println("this is performance testing setup");
	}

	@When("sql queries")
	public void sql_queries() {
		System.out.println("this is database testing");
		
		
	}




}
