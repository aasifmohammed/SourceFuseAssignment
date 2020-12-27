package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SourceFuse_Form {
	WebDriver driver;
	private By firstName = By.xpath("//div[@id='fnameInput']/input");
	private By lastName = By.xpath("//div[@id='lnameInput']/input");
	private By email = By.xpath("//div[@id='emailInput']/input");
	private By currentCompany = By.xpath("//div[@id='curCompanyInput']/input");
	private By moblie = By.xpath("//div[@id='mobInput']/input");
	private By dayPicker = By.xpath("//div[@data-provide='datepicker']/input");
	private By month = By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']");
	private By nextCal = By.xpath("//div[@class='datepicker-days']//th[@class='next']");
	private By date = By.xpath("//div[@class='datepicker-days']//td[@class='day']");
	private By position = By.xpath("//div[@id='positionInput']/input");
	private By portfolioWebsite = By.xpath("//div[@id='portfolioInput']/input");
	private By salary = By.xpath("//div[@id='salaryInput']/input");
	private By whenCanWeStart = By.xpath("//div[@id='whenStartInput']/input");
	private By address = By.xpath("//div[@id='addressInput']/textarea");
	private By resumeUpload = By.xpath("//div[@id='resumeInput']/input");
	private By yesRadio = By.xpath("//div[@id='relocateInput']/div/input[1]");
	private By noRadio = By.xpath("//div[@id='relocateInput']/div/input[2]");
	private By notSureRadio = By.xpath("//div[@id='relocateInput']/div/input[3]");
	private By submitButton = By.xpath("//button[@class='btn btn-primary']");
	private By labels = By.xpath("//label");
	
	
	
	public SourceFuse_Form(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement firstName()
	{
		return driver.findElement(firstName);
	}
	public WebElement lastName()
	{
		return driver.findElement(lastName);
	}
	public WebElement email()
	{
		return driver.findElement(email);
	}
	public WebElement currentCompany()
	{
		return driver.findElement(currentCompany);
	}
	public WebElement moblie()
	{
		return driver.findElement(moblie);
	}
	public WebElement dayPicker()
	{
		return driver.findElement(dayPicker);
	}
	public By month()
	{
		return month;
	}
	public WebElement nextCal()
	{
		return driver.findElement(nextCal);
	}
	public List<WebElement> date()
	{
		return driver.findElements(date);
	}
	public WebElement position()
	{
		return driver.findElement(position);
	}
	public WebElement portfolioWebsite()
	{
		return driver.findElement(portfolioWebsite);
	}
	public WebElement salary()
	{
		return driver.findElement(salary);
	}
	public WebElement whenCanWeStart()
	{
		return driver.findElement(whenCanWeStart);
	}
	public WebElement address()
	{
		return driver.findElement(address);
	}
	public WebElement resumeUpload()
	{
		return driver.findElement(resumeUpload);
	}
	public WebElement yesRadio()
	{
		return driver.findElement(yesRadio);
	}
	public WebElement noRadio()
	{
		return driver.findElement(noRadio);
	}
	public WebElement notSureRadio()
	{
		return driver.findElement(notSureRadio);
	}
	public WebElement submitButton()
	{
		return driver.findElement(submitButton);
	}
	public List<WebElement> labels()
	{
		return driver.findElements(labels);
	}
}
