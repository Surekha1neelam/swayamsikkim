package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	public WebDriver driver;
	public loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="mat-input-1")
	WebElement email;
	@FindBy(xpath="//*[@id=\"kl-signin-form\"]/mat-card/div/div/div[1]/core-sign-in/form/div[2]/div[2]/button/span[1]")
	WebElement passbutton;
	@FindBy(id="mat-input-4")
	WebElement textpass;
	@FindBy(xpath="//span[text()='Login']")
	WebElement loginbutton;
	@FindBy(xpath="//span[@class='selected-option ng-tns-c358-2']")
	WebElement categoriesbtn;
	@FindBy(xpath = "//span[@class='ng-tns-c358-2'][normalize-space()='Logout']")
	WebElement Logout;
	public void setemail(String ename)
	{
		
		email.sendKeys(ename);
	}
	public void setpassbutton()
	{
		
		passbutton.click();
	}
	public void setpassword(String pass)

	{
		
		textpass.sendKeys(pass);
	}
	public void setlogin()

	{
		loginbutton.click();
	}
	public void setcategories()

	{
		categoriesbtn.click();
	}
	public void SetLogout()

	{
		Logout.click();
	}
}

