package Testcase;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilities.XLUtils;
import pageobjects.loginpage;




public class TC_002_datadriven extends Baseclass{
	@Test(dataProvider="surekha")
	public void logindt(String Email,String Password) throws InterruptedException, IOException
	{

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
		Thread.sleep(2000);
		lp.setcategories();
		Thread.sleep(2000);
		lp.SetLogout();
	}
	@DataProvider(name="surekha")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/Testdata/surekha.xlsx";

		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",2);

		String logindata[][]=new String[rownum][colcount];

		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
			}

		}
		return logindata;
	}
}



