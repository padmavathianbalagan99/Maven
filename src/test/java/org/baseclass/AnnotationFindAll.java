package org.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AnnotationFindAll extends BaseClass{
	public AnnotationFindAll() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(xpath="//input[@type='text']"),@FindBy(className="MuiInputBase-input MuiInput-input")})
    private WebElement userid;
    @FindAll ({@FindBy(xpath="//input[@type='password']"),@FindBy(className="MuiInputBase-input MuiInput-input")})
	private WebElement pass;
	@FindAll({@FindBy(xpath="//span[text()='Login']"),@FindBy(className="MuiButton-label")})
	private WebElement clklogin;
	/*
	 * public WebElement getuserid() { return userid;
	 * 
	 * } public WebElement getpass() { return pass;
	 * 
	 * } public WebElement getclklogin() { return clklogin;
	 * 
	 * }
	 */
	public WebElement getUserid() {
		return userid;
	}
	public void setUserid(WebElement userid) {
		this.userid = userid;
	}
	public WebElement getPass() {
		return pass;
	}
	public void setPass(WebElement pass) {
		this.pass = pass;
	}
	public WebElement getClklogin() {
		return clklogin;
	}
	public void setClklogin(WebElement clklogin) {
		this.clklogin = clklogin;
	}
	

}

