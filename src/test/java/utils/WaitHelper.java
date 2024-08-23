package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BaseClass;

public class WaitHelper {
	
	public void waitForElementLoading(By elementToWait,int timeOutInseconds) {
		WebDriverWait wait=new WebDriverWait(BaseClass.driver, timeOutInseconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(elementToWait));
		
		
	}

}
