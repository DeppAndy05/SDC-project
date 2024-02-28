package org.pojoall;

import org.baseall.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPojo extends BaseClass {

	public ContactPojo() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//a[text()='Contact']")
	private WebElement contactfill;
	
	
	public WebElement getContactFill() {
		return contactfill;
	}
	
	@FindBy(xpath = "//input[@placeholder = 'First name*']")
	private WebElement firstName;
	
	
	
	@FindBy(xpath = "//input[@placeholder = 'Last name*']")
	private WebElement lastName;
	
	
	
	@FindBy(xpath = "//input[@placeholder = 'Company name*']")
	private WebElement companyName;
	
	
	
	@FindBy(xpath = "//input[@name= 'phonenumber']")
	private WebElement phoneNumber;
	
	

	@FindBy(xpath = "//input[@placeholder= 'Your email address*']")
	private WebElement email;

	
	@FindBy(xpath = "//h2[text()='Get in touch']")
	private WebElement scrollDown;
	

	public WebElement getScrollDown() {
		return scrollDown;
	}
	

	public WebElement getContactfill() {
		return contactfill;
	}


	public WebElement getFirstName() {
		return firstName;
	}


	public WebElement getLastName() {
		return lastName;
	}


	public WebElement getCompanyName() {
		return companyName;
	}


	public WebElement getPhoneNumber() {
		return phoneNumber;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getCheckBox() {
		return checkBox;
	}


	public WebElement getSubmitButton() {
		return submitButton;
	}



	@FindBy(xpath = "(//input[@type= 'checkbox'])[1]")
	private WebElement checkBox;		
			
		
	@FindBy(xpath = "//input[@type= 'submit']")
	private WebElement submitButton;	
	
}
