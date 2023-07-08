package Steps;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import com.baseutils.BaseClass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class LoginSteps 

{
	@When("I will add {string} to the search box")
	public void iWillAddToTheSearchBox(String keyword) {
		BaseClass.element(By.name("q")).sendKeys(keyword);
		
	}
	
	

	@Given("that I have gone to the Google page")
	public void thatIHaveGoneToTheGooglePage() {
		
		BaseClass.broswerLaunch();
		BaseClass.getUrl("https://www.google.com/");
		BaseClass.maximizeWindow();
		BaseClass.wait1();
		
		
	    
	}

	@When("I add cats to the search box")
	public void iAddCatsToTheSearchBox() {
		
		BaseClass.element(By.name("q")).sendKeys("Cats");
	}

	@When("click the Search Button")
	public void clickTheSearchButton() {
		BaseClass.element(By.name("btnK")).click();
	}

	@Then("cats should be mentioned in the results")
	public void catsShouldBeMentionedInTheResults() {
		
		System.out.println("Cats should be mentioned in page");
	    
	}

	@Then("close the browser")
	public void closeTheBrowser() {
		  System.out.println("Close");
		BaseClass.close();
	  
	}

	@When("I add Dog to the search box")
	public void iAddDogToTheSearchBox() {
		BaseClass.element(By.name("q")).sendKeys("dogs");  
	}
	
	
	@When("I add Parrot to the search box")
	public void iAddParrotToTheSearchBox() {
		BaseClass.element(By.name("q")).sendKeys("parrot");
	}
	
	@When("I add Horse to the search box")
	public void iAddHorseToTheSearchBox() {
		BaseClass.element(By.name("q")).sendKeys("Horse");
	}


@When("I add {string} to the search box")
public void iAddToTheSearchBox(String searchKeyword) {
	BaseClass.element(By.name("q")).sendKeys(searchKeyword);
}

@Given("open the facebook app")
public void openTheFacebookApp() 

{
	
	BaseClass.broswerLaunch();
	BaseClass.getUrl("https://www.facebook.com/");
	BaseClass.maximizeWindow();
	BaseClass.wait1();    
}

@When("user enter the {string} and {string}")
public void userEnterTheAnd(String username, String password) {
	
	BaseClass.element(By.name("email")).sendKeys(username);
	BaseClass.element(By.name("pass")).sendKeys(password);
}
   

@When("Clik the login button")
public void clikTheLoginButton() {
	
	BaseClass.element(By.name("login")).click();
}

  

@Then("Login should be successfull")
public void loginShouldBeSuccessfull() {
	System.out.println("Login success");
	assertTrue(false);
}

    

@Then("close the browser properly")
public void closeTheBrowserProperly() {
	BaseClass.close();
}

	
}
