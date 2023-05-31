package Testcase;

import org.testng.annotations.Test;

import Pageobjectmodel.Loginpage;
import Pageobjectmodel.Logout;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class Testcases {
	WebDriver driver;
  @BeforeSuite
  public void beforeSuite() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.navigate().to("https://pratikshanaik-trials79.orangehrmlive.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  }
  @BeforeTest
  public void Login() {
	  Loginpage loginApplication=new Loginpage(driver);
	  loginApplication.Loginpage("Admin","@5RctPdF1M");  
  }
  
  
  @Test(enabled=true)
  public void Addnewuser() {
	  Pageobjectmodel.Addnewuser HRAdministration=new Pageobjectmodel.Addnewuser(driver);
	  HRAdministration.Addnewuser("Adella Lopez", "Prathvik", "pavi@2023", "pavi@2023");
	  
	  Logout logout=new Logout(driver);
	  logout.Logout();
  }
  
}
