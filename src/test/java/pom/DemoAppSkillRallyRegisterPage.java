package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoAppSkillRallyRegisterPage 
{
	//Declaration
	@FindBy(name="firstname")
	private WebElement firstNameTF;
	
	@FindBy(name="lastname")
	private WebElement lastNameTF;
	
	@FindBy(xpath="(//input[@name='email'])[2]")   //(name="email")
	private WebElement emailTF;
	
	@FindBy(xpath="(//input[@name='password'])[2]")//(name="password")
	private WebElement passwordTF;
	
	@FindBy(xpath="//input[@name='repassword']") //name="repassword"
	private WebElement confirmPasswordTF;
	
	@FindBy(xpath="//a[text()='I Already have a membership']")
	private WebElement textLink;
	
	@FindBy(xpath="//a[text()=' Home']")
	private WebElement homeLink;
	
	@FindBy(name="signup")
	private WebElement registerBTN;
	
	//Initialization
	public DemoAppSkillRallyRegisterPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
		
	}
	//Utilization
	public void setFirstName(String firstName)
	{
		firstNameTF.sendKeys(firstName);
	}
	public void setLastName(String lastName)
	{
		lastNameTF.sendKeys(lastName);
	}
	public void setEmail(String email)
	{
		emailTF.sendKeys(email);
	}
	public void setPasword(String pwd)
	{
		passwordTF.sendKeys(pwd);
	}
	public void setConfirmPassword(String confirmPwd)
	{
		confirmPasswordTF.sendKeys(confirmPwd);
	}
	public void clickAlreadyMembershipLink()
	{
		textLink.click();
	}
	public void clickHomeLink()
	{
		homeLink.click();
		
	}
	public void clickRegisterBTN()
	{
		registerBTN.click();
	}
}
