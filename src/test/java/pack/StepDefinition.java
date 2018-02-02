package pack;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition {
	WebDriver drv = null;

	@Before public void setUp(){ 
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
	      drv = new FirefoxDriver();
	      }
	
	@After public void close(){
		drv.close();
	}

	@Given("^I am on the login page$")
	public void i_am_on_the_login_page() {
		drv.get("http://newtours.demoaut.com/");
	}

	@And("^I insert username$")
	public void i_insert_username()  {
	    WebElement usrname_txt = drv.findElement(By.name("userName"));
	    usrname_txt.sendKeys("tomsmith");
	}

	@And("^I insert password$")
	public void i_insert_password()  {
	    WebElement pass_txt = drv.findElement(By.name("password"));
	    pass_txt.sendKeys("Super");
	}

	@When("^I click login$")
	public void i_click_login()  {
	    WebElement lgn_btn = drv.findElement(By.name("login"));
	    lgn_btn.click();
	}

	@Then("^go to dashboard$")
	public void go_to_dashboard() throws Throwable {
		//String actual=drv.getCurrentUrl();
		String vpn = drv.getTitle();
		String expectedTitle="Sign-on: Mercury Tours";
		assertEquals(expectedTitle, vpn);
	}
}
