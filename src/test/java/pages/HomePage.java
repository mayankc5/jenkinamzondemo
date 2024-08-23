package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;
import utils.WaitHelper;



public class HomePage extends BaseClass {
	
	
    By mobileCat=By.xpath("//a[contains(text(),'Mobiles')]");
    By samsungBrand=By.xpath("//input[@name='s-ref-checkbox-Samsung']"); 
    By priceRange=By.xpath("//span[contains(text(),'10,000 ')]");
    By minPriceRange=By.xpath("//input[@id='low-price']");
    By maxPriceRange=By.xpath("//input[@id='high-price']");
    By goFilter=By.xpath("//input[@class='a-button-input']");
    By mobileList=By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']");
    By mobImages=By.xpath("/div[@class='a-section aok-relative s-image-fixed-height']/child::img");
    By mobileModel=By.xpath("//a[@class='a-link-normal a-text-normal']/child::span[@class='a-size-medium a-color-base a-text-normal']");
    By noOfRating=By.xpath("//a[@class='a-link-normal']/child::span");
    By starRating=By.xpath("//i[contains(@class,'a-icon a-icon-star-small')]");
    By priceSymbol=By.xpath("//span[@class='a-price-symbol']");
    By priceMobile=By.xpath("//span[@class='a-price-whole']");
    By disCountPrice=By.xpath("//span[@class='a-price a-text-price']");
    
	WaitHelper waithelpObj=new WaitHelper();
    public void selectMobileOption() {
    	waithelpObj.waitForElementLoading(mobileCat, 20); 
    	System.out.println(BaseClass.driver);
		try
		{
			BaseClass.driver.findElement(mobileCat).click();
		}
		
		catch (StaleElementReferenceException e) {
			BaseClass.driver.findElement(mobileCat).click();
			e.getMessage();
		}
		
		
		 
	 }
	 public void selectMobBrand() {
		 waithelpObj.waitForElementLoading(samsungBrand, 20); 
		 try
			{
				BaseClass.driver.findElement(samsungBrand).click();
			}
			
			catch (StaleElementReferenceException e) {
				BaseClass.driver.findElement(samsungBrand).click();
				e.getMessage();
			}
		 
		
	 }
	 public void selectPriceRange() {
		 waithelpObj.waitForElementLoading(priceRange, 20); 
		 try
			{
				BaseClass.driver.findElement(priceRange).click();
			}
			
			catch (StaleElementReferenceException e) {
				BaseClass.driver.findElement(priceRange).click();
				e.getMessage();
			}
		 
		
	 }
	 
	 public void selectMinmaxRange() {
		 BaseClass.driver.findElement(minPriceRange).clear();
		 BaseClass.driver.findElement(minPriceRange).sendKeys("15000");
		 BaseClass.driver.findElement(maxPriceRange).clear();
		 BaseClass.driver.findElement(maxPriceRange).sendKeys("18000");
		 BaseClass.driver.findElement(goFilter).click();
		 
	 }
	 
	 @SuppressWarnings("deprecation")
	public void mobileDeviceList() {
		List<WebElement> mobileItemList= BaseClass.driver.findElements(mobileList);
		
		 for(int i=0;i<mobileItemList.size();i++) {
			 Assert.assertEquals(true, mobileItemList.get(i).isDisplayed());
		 }
	 }
	 

}
