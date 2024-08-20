package stepdef;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.BaseClass;
import pages.HomePage;

public class MobilePageStep extends BaseClass {
	 
	BaseClass baseOb=new BaseClass();
	HomePage homeObj=new HomePage();
	
	@Given("I am on Amazon Home page$")
	
    public void launchHomePage() throws IOException  {  
		baseOb.setUp();
		baseOb.launchPortal();
    }
	
	 @When("^I select mobile category$")
	    public void selectMobileOption(){
		 homeObj.selectMobileOption();
	    }
	 
	 @When("^I select brand Samsung$")
	    public void selectMobileBrand(){
		 homeObj.selectMobBrand();
	    }
    @When("^I select price range$")
    public void selectItemPriceRange(){
      homeObj.selectPriceRange();
    }
    @When("^I select min max range$")
    public void selectItemminmaxRange(){
      homeObj.selectMinmaxRange();
    }
    
    
    @When("^I validate filter result$")
    public void validateMobilePageContents(){
     homeObj.mobileDeviceList();
    }
    @When("^Mobile page should contains all the mobile with their details$")
    public void validateMobileModelWithDetails(){
       
    }

}
