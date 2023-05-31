package Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Aditionalcomponent.Waitforelement;

public class Logout extends Waitforelement {

	public Logout(WebDriver wd) {
		super(wd);
		this.driver=wd;
		PageFactory.initElements(driver, this);
	}
	 By Logout=By.xpath("//span[contains(text(),'Log Out')]");
	  
	 public void Logout() {
		 waitForElementToAppearAndClick(Logout);
		
	}
	   

}
