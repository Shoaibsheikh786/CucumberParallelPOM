package parallel;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import util.ConfigReader;

public class Login {
 
 private ConfigReader configReader=new ConfigReader();
  WebDriver driver;
 private LoginPage loginPage=new LoginPage(DriverFactory.getDriver());
@Given("user is on the login page")
public void user_is_on_the_login_page() {
	String url=configReader.init().getProperty("url");
	driver= DriverFactory.getDriver();
	driver.get(url);
}

@When("user gives username {string}")
public void user_gives_username(String username) {
	loginPage.enterUsername(username);
	
}

@When("user given password {string}")
public void user_given_password(String password) {
	loginPage.enterPassword(password);
}

@Then("user should be redirected to the dashboard {string}")
public void user_should_be_redirected_to_the_dashboard(String title) {
	loginPage.clickOnLogin();
	Assert.assertTrue(driver.getTitle().contains(title));
}

}
