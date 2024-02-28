package org.baseall;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static  WebDriver driver ;
	public static Actions a;
	public static JavascriptExecutor js;
	public static void browser(String browserName, String url) {

		if (browserName.equals("Chrome")) {
			
			driver = new ChromeDriver();
		}
		else if (browserName.equals("Edge")) {
			
			driver = new EdgeDriver();
		}
		else if (browserName.equals("Firefox")) {
			
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.get(url);
	}
	
	
	public static void implicitywaiting() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void clickAll(WebElement ele) {
	ele.click();
	}
	
	public static  void textFill(WebElement textEle ,String ValueFill ) {
		textEle.sendKeys(ValueFill);
	}
	
	public static void scrollDownPage(WebElement scrollDownEle) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrollDownEle);
	}
	public static String titleget() {
		String sdstitle = driver.getTitle();
		return sdstitle;
	}
	
	public static String ctrlUrl() {
		String ctrl = driver.getCurrentUrl();
		return ctrl;
	}
	
	public static void mouseAction(WebElement target) {
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();
		
	}
	
	public static void clickjavaScript(WebElement scriptEle) {
		js = (JavascriptExecutor)driver;
		js.executeAsyncScript("arguments[0].click()", scriptEle);
	}
	
	
	public static void checkingpageTitle(String titleName ,String titlecontains) {
		if (titleName.contains(titlecontains)) {
			
			System.out.println("Verification "+titlecontains+" page pass");
		} else {
			System.out.println("Verification "+titlecontains+ "page Fail");
		}
	}
	
	public static void CheckingPageUrl(String ctrlUrl ,String UrlValue) {
		if (ctrlUrl.contains(UrlValue)) {
			System.out.println("Verification "+UrlValue+" page Url pass ");

		} else {
			System.out.println("Verification" +UrlValue+" page Url fail ");

		}
		
	}
	
	
	public static void pageRefresh() {
		driver.navigate().refresh();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
