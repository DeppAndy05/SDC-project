package org.pojoall;

import org.baseall.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductMouse  extends BaseClass {

	public ProductMouse() {
		PageFactory.initElements(driver,this);
	}
	
	
	@CacheLookup
	@FindBy(xpath = "(//a[text() ='Landval'])[1]")
	private WebElement land;

	@CacheLookup
	@FindBy(xpath = "(//a[text() ='ProVal'])[1]")
	private WebElement pro;
	
	@FindBy(xpath = "(//a[text() ='Sequel'])[1]")
	private WebElement sequel;
	


	public WebElement getSequel() {
		return sequel;
	}

	public WebElement getLand() {
		return land;
	}

	public WebElement getPro() {
		return pro;
	}
	
	

}
