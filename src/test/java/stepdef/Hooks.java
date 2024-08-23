package stepdef;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pages.BaseClass;

public class Hooks extends BaseClass {
	public static Scenario scenario;
	public String scenarioName="";
	BaseClass baseOb=new BaseClass();
	@Before
	public void startProcess(Scenario scenario) {
		Hooks.scenario=scenario;
		scenarioName=scenario.getName();
	}
	
	@SuppressWarnings("deprecation")
	@After
	public void screenShotAfterScenario(Scenario scenario) throws IOException {
		final byte[] screenShot =((TakesScreenshot)BaseClass.driver).getScreenshotAs(OutputType.BYTES);
		//scenario.embed(screenShot,"image/png");
//		File DestFile=new File("");
//		FileUtils.copyFile(SrcFile, DestFile);
		if(scenario.isFailed()) {
			scenario.embed(screenShot,"image/png");
		}
		BaseClass.driver.quit();
		Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
	}

}
