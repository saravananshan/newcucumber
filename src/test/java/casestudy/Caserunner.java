package casestudy;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
//@CucumberOptions(monochrome=true)
@CucumberOptions(tags="@sanity")
public class Caserunner {

}