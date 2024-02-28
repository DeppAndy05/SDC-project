package org.pojoall;

import org.baseall.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePojo  extends BaseClass {

	public HomePojo() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getPopup() {
		return popupEdge;
	}

	@FindBy(xpath = "//a[@class = 'btn btn-black litho-cookie-policy-button']")
	private WebElement popupEdge;
	
	
	@FindBy(xpath = "//a[text()='Products']")
	private WebElement productsSelect;

	@FindBy(xpath = "(//a[text()='Consultancy'])[1]")
	private WebElement consultSelect;
	
	
	@FindBy(xpath = "//a[text()='Services']")
	private WebElement serviceSelect;
	
	@FindBy(xpath = "//a[text()='Support']")
	private WebElement supportSelect;
	

	@FindBy(xpath = "(//a[text()='Events'])[1]")
	private WebElement EventSelect;
	
	@FindBy(xpath = "//a[text()='Latest News']")
	private WebElement NewsSelect;
	
	@FindBy(xpath = "//a[text()='Contact']")
	private WebElement contact;
	
	
	
	public WebElement getContact() {
		return contact;
	}

	public WebElement getProductsSelect() {
		return productsSelect;
	}

	public WebElement getConsultSelect() {
		return consultSelect;
	}

	public WebElement getServiceSelect() {
		return serviceSelect;
	}

	public WebElement getSupportSelect() {
		return supportSelect;
	}

	public WebElement getEventSelect() {
		return EventSelect;
	}

	public WebElement getNewsSelect() {
		return NewsSelect;
	}


	
	
}
