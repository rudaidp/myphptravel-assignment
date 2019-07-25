package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		//features = "src/test/resources/features", //folder path
		features = {"src/test/resources/features/SearchHotel.feature"}, 
		glue = {"com.phptravel.myphptravel"})	//package name

public class TestRunner extends AbstractTestNGCucumberTests {

}
