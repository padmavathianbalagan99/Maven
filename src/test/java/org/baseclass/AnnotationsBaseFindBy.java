package org.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnnotationsBaseFindBy extends BaseClass {
	public AnnotationsBaseFindBy() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (id="email")
	public WebElement txtEmail;
	@FindBy (id="pass")
	public WebElement txtpass;
	@FindBy (xpath="//button[@type='submit']")
	public WebElement clklogin;
	public WebElement gettextmail() {
		return txtEmail;	
	}
	public WebElement gettextpass() {
		return txtpass;	
	}
	public WebElement getlogin() {
		return clklogin;	
	}
	
	
}
