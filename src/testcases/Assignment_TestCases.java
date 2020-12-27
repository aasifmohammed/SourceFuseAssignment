package testcases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObject.SourceFuse_Form;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Assignment_TestCases {
	public WebDriver driver;
	SourceFuse_Form form;
	Statement s;
	Connection con;
	ResultSet rs;

	@BeforeTest
	public void BeforeTest() {
		String driverPath = System.getProperty("user.dir")
				+ "\\src\\testcases\\Resources\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://sfwebhtml:t63KUfxL5vUyFLG4eqZNUcuRQ@sfwebhtml.sourcefuse.com/automation-form-demo-for-interview/");

	}

	@Test
	public void testCase1() {
		form = new SourceFuse_Form(driver);
		form.submitButton().click();
		Assert.assertEquals(true, form.submitButton().isDisplayed());
		System.out.println("TC_1_logConsole : Request not get submitted");
		for (int i = 0; i < form.labels().size(); i++) {
			System.out.println("TC_1_logConsole :" + form.labels().get(i).getText());
		}
	}

	@Test
	public void testCase2() {
		form = new SourceFuse_Form(driver);
		SoftAssert softAssertion = new SoftAssert();
		softAssertion.assertEquals(true, form.firstName().isEnabled());
		System.out.println("TC_2_logConsole : First Name TextBox is enable");
		softAssertion.assertEquals(true, form.lastName().isEnabled());
		System.out.println("TC_2_logConsole : Last Name TextBox is enable");
		softAssertion.assertEquals(true, form.email().isEnabled());
		System.out.println("TC_2_logConsole : Email TextBox is enable");
		softAssertion.assertEquals(true, form.currentCompany().isEnabled());
		System.out.println("TC_2_logConsole : Current Company TextBox is enable");
		softAssertion.assertEquals(true, form.moblie().isEnabled());
		System.out.println("TC_2_logConsole : Mobile TextBox is enable");
		softAssertion.assertEquals(true, form.dayPicker().isEnabled());
		System.out.println("TC_2_logConsole : Date of Birth TextBox is enable");
		softAssertion.assertEquals(true, form.position().isEnabled());
		System.out.println("TC_2_logConsole : Position you are applying for TextBox is enable");
		softAssertion.assertEquals(true, form.portfolioWebsite().isEnabled());
		System.out.println("TC_2_logConsole : Portfolio Website TextBox is enable");
		softAssertion.assertEquals(true, form.salary().isEnabled());
		System.out.println("TC_2_logConsole : Salary Requirements TextBox is enable");
		softAssertion.assertEquals(true, form.whenCanWeStart().isEnabled());
		System.out.println("TC_2_logConsole : When can we start TextBox is enable");
		softAssertion.assertEquals(true, form.address().isEnabled());
		System.out.println("TC_2_logConsole : Address TextBox is enable");
		softAssertion.assertEquals(true, form.resumeUpload().isEnabled());
		System.out.println("TC_2_logConsole : Resume upload is enable");
		softAssertion.assertEquals(false, form.yesRadio().isSelected());
		System.out.println("TC_2_logConsole : Yes Redio button is not selected");
		softAssertion.assertEquals(false, form.noRadio().isSelected());
		System.out.println("TC_2_logConsole : No Redio button is not selected");
		softAssertion.assertEquals(false, form.notSureRadio().isSelected());
		System.out.println("TC_2_logConsole : Not Sure Redio button is not selected");
		softAssertion.assertEquals(true, form.submitButton().isDisplayed());
		System.out.println("TC_2_logConsole : Submit button is enable");
		softAssertion.assertAll();
	}

	@Test
	public void testCase3() {
		Assert.assertEquals(true, form.firstName().isEnabled());
		System.out.println("TC_3_logConsole : First Name TextBox is enable");
		Assert.assertEquals(true, form.lastName().isEnabled());
		System.out.println("TC_3_logConsole : Last Name TextBox is enable");
		Assert.assertEquals(true, form.email().isEnabled());
		System.out.println("TC_3_logConsole : Email TextBox is enable");
		Assert.assertEquals(true, form.currentCompany().isEnabled());
		System.out.println("TC_3_logConsole : Current Company TextBox is enable");
		Assert.assertEquals(true, form.moblie().isEnabled());
		System.out.println("TC_3_logConsole : Mobile TextBox is enable");
		Assert.assertEquals(true, form.dayPicker().isEnabled());
		System.out.println("TC_3_logConsole : Date of Birth TextBox is enable");
		Assert.assertEquals(true, form.position().isEnabled());
		System.out.println("TC_3_logConsole : Position you are applying for TextBox is enable");
		Assert.assertEquals(true, form.portfolioWebsite().isEnabled());
		System.out.println("TC_3_logConsole : Portfolio Website TextBox is enable");
		Assert.assertEquals(true, form.salary().isEnabled());
		System.out.println("TC_3_logConsole : Salary Requirements TextBox is enable");
		Assert.assertEquals(true, form.whenCanWeStart().isEnabled());
		System.out.println("TC_3_logConsole : When can we start TextBox is enable");
		Assert.assertEquals(true, form.address().isEnabled());
		System.out.println("TC_3_logConsole : Address TextBox is enable");
		Assert.assertEquals(true, form.resumeUpload().isEnabled());
		System.out.println("TC_3_logConsole : Resume upload is enable");
		Assert.assertEquals(false, form.yesRadio().isSelected());
		System.out.println("TC_3_logConsole : Yes Redio button is not selected");
		Assert.assertEquals(false, form.noRadio().isSelected());
		System.out.println("TC_3_logConsole : No Redio button is not selected");
		Assert.assertEquals(false, form.notSureRadio().isSelected());
		System.out.println("TC_3_logConsole : Not Sure Redio button is not selected");
		Assert.assertEquals(true, form.submitButton().isDisplayed());
		System.out.println("TC_3_logConsole : Submit button is enable");
	}

	@Test
	public void testCase4() {
		form = new SourceFuse_Form(driver);
		form.firstName().sendKeys("Asif");
		form.lastName().sendKeys("Mohammed");
		form.email().sendKeys("aasif.mohd1@gmail.com");
		form.currentCompany().sendKeys("LTI");
		form.moblie().sendKeys("8989098041");
		// Date
		form.dayPicker().click();
		while (!form.dayPicker().findElement(form.month()).getText().contains("November")) {
			form.nextCal().click();
		}

		for (int i = 0; i < form.date().size(); i++) {
			String day = form.date().get(i).getText();
			if (day.equalsIgnoreCase("30")) {
				form.date().get(i).click();
				break;
			}
		}
		form.position().sendKeys("Software Engineer");
		form.portfolioWebsite().sendKeys("www.linkedin.com/in/asif-mohammed-209203115/");
		form.salary().sendKeys("00000000000");
		form.whenCanWeStart().sendKeys("2 Months");
		form.address().sendKeys("Mumbai");
		String resumePath = System.getProperty("user.dir") + "\\src\\testcases\\Resources\\SourceFuse_Resume.pdf";
		form.resumeUpload().sendKeys(resumePath);
		form.notSureRadio().click();
		form.submitButton().click();
		System.out.println("TC_4_logConsole : Request got submitted");

	}

	@Test
	public void testCase5() throws SQLException {
		String host = "localhost";
		String port = "3306";
		con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/Demo", "root", "root");
		s = con.createStatement();
		rs = s.executeQuery("select * from jobApplications where mobile ='8989098041'");
		while (rs.next()) {
			Assert.assertEquals("Asif", rs.getString("firstName"));
			System.out.println("TC_5_logConsole : First Name is Verified");
			Assert.assertEquals("Mohammed", rs.getString("lastName"));
			System.out.println("TC_5_logConsole : Last Name is Verified");
			Assert.assertEquals("aasif.mohd1@gmail.com", rs.getString("email"));
			System.out.println("TC_5_logConsole : email is Verified");
			Assert.assertEquals("LTI", rs.getString("currentCompany"));
			System.out.println("TC_5_logConsole : currentCompany is Verified");
			Assert.assertEquals("8989098041", rs.getString("moblie"));
			System.out.println("TC_5_logConsole : moblie is Verified");
			Assert.assertEquals("30/11/1995", rs.getString("dob"));
			System.out.println("TC_5_logConsole : dob is Verified");
			Assert.assertEquals("Software Engineer", rs.getString("position"));
			System.out.println("TC_5_logConsole : position is Verified");
			Assert.assertEquals("https://www.linkedin.com/in/asif-mohammed-209203115/",
					rs.getString("portfolioWebsite"));
			System.out.println("TC_5_logConsole : portfolioWebsite is Verified");
			Assert.assertEquals("00000000000", rs.getString("salary"));
			System.out.println("TC_5_logConsole : salary is Verified");
			Assert.assertEquals("2 Months", rs.getString("whenCanWeStart"));
			System.out.println("TC_5_logConsole : whenCanWeStart is Verified");
			Assert.assertEquals("Mumbai", rs.getString("address"));
			System.out.println("TC_5_logConsole : address is Verified");
			Assert.assertEquals("Y", rs.getString("resumeUpload"));
			System.out.println("TC_5_logConsole : resumeUpload is Verified");
			Assert.assertEquals("NS", rs.getString("relocate"));
			System.out.println("TC_5_logConsole : relocate is Verified");
		}
	}

	@Test
	public void testCase6() throws SQLException {
		String host = "localhost";
		String port = "3306";
		con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/Demo", "root", "root");
		s = con.createStatement();
		rs = s.executeQuery("select * from jobApplications where mobile ='8989098041'");
		while (rs.next()) {
			Assert.assertEquals("Yes", rs.getString("email_sent"));
			System.out.println("TC_6_logConsole : Verified Email has been sent to the applicant");
		}
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
