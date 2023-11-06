package Testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageobjects.loginpage;

public class TC_001_login extends Baseclass{
	@Test
	public void logintest() throws InterruptedException, IOException  {

		driver.get(url);
		log.info("url is entered");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
		loginpage lp=new loginpage(driver);
	
		
		lp.setemail(email);
		Thread.sleep(2000);

;
		
		log.info("email is entered");

		lp.setpassbutton();
		Thread.sleep(2000);
		lp.setpassword(password);
		Thread.sleep(2000);
		log.info("password is eneterd");
		lp.setlogin();
		/*String actual_res=driver.getTitle();
		System.out.println(actual_res);
		String exp_res="Buy the best organic products, spices, handlooms and more at reasonable prices. Order directly from producers through Swayam Sikkim.";
		if(actual_res.equals(exp_res)) {
			Assert.assertTrue(true);
			log.info("test case is passed");
		}
		else {
			capturescreen( driver, "logintest");
			Assert.assertFalse(true);
			log.info("test case is failed");
			
		}*/
}
}

