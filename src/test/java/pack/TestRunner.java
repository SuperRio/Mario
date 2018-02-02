package pack;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = ("D:\\repo\\Mario\\src\\test\\resources\\features\\all.feature")
,format = {"json:target/cucumber.json","html:target/site/cucumber-pretty"},
glue = "pack")




public class TestRunner extends AbstractTestNGCucumberTests {

}
