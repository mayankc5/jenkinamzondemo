package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	 public static WebDriver driver=null;
	 Properties prop=null;
	 FileInputStream fin=null;
	 String browserOPen="";
	 String amazonPortal="";
	 
	 @BeforeTest
	 public  void setUp() throws IOException {
		 prop = new Properties();
		 fin=new FileInputStream(System.getProperty("user.dir")+"//config.properties");
		 prop.load(fin);
		 
		 
	 }
	 
	
	public  void launchPortal() {
		browserOPen=prop.getProperty("browserName");
		amazonPortal=prop.getProperty("appurl");
		if(browserOPen.equalsIgnoreCase("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(amazonPortal);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	}

}
