package org.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseRun extends BaseClass{
	public static void main(String[] args) {
		launchBrowser();
		loadUrl("https://www.facebook.com/");
		System.out.println(getUrl());
		System.out.println(getTitle());
		WebElement txtEmail =driver.findElement(By.id("email"));
		insert (txtEmail,"anu@123");
		WebElement txtpass =driver.findElement(By.id("pass"));
		insert (txtpass,"qwert");
		WebElement clkbtn =driver.findElement(By.xpath("//button[@value='1']"));
        click(clkbtn);
	}
	

}
