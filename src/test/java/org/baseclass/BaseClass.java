package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class BaseClass {
	public static WebDriver driver;
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\MavenProject\\d\\chromedriver.exe");
	     driver=new ChromeDriver();
		}
	public static void loadUrl(String Url) {
		driver.get("https://dashboard.i2h.ai/");
	}
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	public static String getUrl() {
    	String Url = driver.getCurrentUrl();
    	return Url;
	}
	public static String getTitle() {
		String Title = driver.getTitle();
		return Title;	
	}
	public static void  insert(WebElement a ,String string) {
		a.sendKeys(string);
	}
	public static void click(WebElement b) {
		b.click();
	}
}

	

	
	
    

