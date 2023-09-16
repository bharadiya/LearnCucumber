package StepDefinations2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinations2 {

	public static WebDriver driver = null;

	@Before
	public static void launchBrowser() {
		driver = new ChromeDriver();
	}

	@After
	public static void tearDown() {
		driver.close();
	}

	@BeforeStep
	public static void learnBeforeStep() {
		System.out.println("this ones before every step");
	}

	@AfterStep
	public static void learnAfterStep() {
		System.err.println("this ones after every step");
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
		driver.get("https://www.saucedemo.com");
		System.out.println("User has reached login page");
	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_username_and_password(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		System.out.println("User has entered username and password successfully");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("login-button")).click();
		System.out.println("User has clicked login button successfully");
	}

	@Then("user should be logged in")
	public void user_should_be_logged_in() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		boolean logOutBtnIsVisible = driver.findElement(By.id("logout_sidebar_link")).isDisplayed();
		Assert.assertTrue(logOutBtnIsVisible);
		System.out.println("User has logged in successfully");

		driver.navigate().to("https://www.saucedemo.com/logout");
	}
}
