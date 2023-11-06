package Testcase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utilities.Readingdata;

public class Baseclass {
	Readingdata rd=new Readingdata();
	public String url=rd.getapplicationurl();
	
	public String email=rd.getemail();
	public String password=rd.getpassword();
	public static Logger log;
	public static WebDriver driver;
	@BeforeClass
	public void openapplication() throws InterruptedException{

		log=Logger.getLogger(this.getClass());
		PropertyConfigurator.configure("log4j.properties");
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@AfterClass

	public void Closepage()
	{
		//driver.close();
}
	public void capturescreen(WebDriver driver, String name) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File target=new File("./screenshots/"+name+".png");
		FileUtils.copyFile(src, target);
		log.info("screenshot is taken");
		
		
		
		
		
	}
}

