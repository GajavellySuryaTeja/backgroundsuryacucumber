package TagsOhrm;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Ohrmtags {
	
	@Given("browser login")
	public void browser_login() throws InterruptedException {
	 
	 System.out.println("Browser logged successfully");
	}

	@And("username and password")
	public void username_and_password() throws InterruptedException {
    
     System.out.println("Added Username and Password credentials");
	}

	@Then("select profile")
	public void select_profile() throws InterruptedException {
	
	System.out.println("Selected dropdown profile");
	}

	@And("select logout options")
	public void select_logout_options() throws InterruptedException {
	
	System.out.println("selected logged out successfully");
	}

	@When("Close the browser")
	public void close_the_browser() {
	
	 System.out.println("browser closed successfully");
	}


}
