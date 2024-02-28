package org.homepage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.baseall.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.pojoall.ContactPojo;
import org.pojoall.HomePojo;
import org.pojoall.ProductMouse;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Home  extends BaseClass {

	
	
	@BeforeClass
	private void bfclass() throws InterruptedException {
		browser("Edge", "https://s-d-s.co.uk/");
		implicitywaiting();
		Thread.sleep(5000);
		HomePojo h = new HomePojo();
		WebElement popup = h.getPopup();
	//	clickjavaScript(popup);
		clickAll(popup);
		
		
	}
		@Ignore
		@Test
		private void tc1() throws InterruptedException  {
		// to check Url and and Title 
			String titleget = titleget();
			Assert.assertTrue(titleget.contains("Social Housing"),"Check the title");
		// to Verify The All Sections page title and Url 
			HomePojo h = new HomePojo();
			Thread.sleep(5000);
			WebElement product = h.getProductsSelect();
			product.click();
			
			String producttitle = titleget();
			checkingpageTitle(producttitle, "product");
			String productUrl = ctrlUrl();
			CheckingPageUrl(productUrl, "product");
			
			
		//	WebElement consultancy = h.getProductsSection();
		//	consultancy.click();
			clickAll(h.getConsultSelect());
			
			String consultancytitle = titleget();
			checkingpageTitle(consultancytitle, "Consultancy");
			String consultancyUrl = ctrlUrl();
			CheckingPageUrl(consultancyUrl, "consultancy");
			
			clickAll(h.getServiceSelect());
				
			String Servicestitle = titleget();
			checkingpageTitle(Servicestitle, "Services");
			String ServicesUrl = ctrlUrl();
			CheckingPageUrl(ServicesUrl, "services");
			
			clickAll(h.getSupportSelect());
			String Supporttitle = titleget();
			checkingpageTitle(Servicestitle, "Support");
			String SupportUrl = ctrlUrl();
			CheckingPageUrl(SupportUrl, "support");
			
			clickAll(h.getEventSelect());
			String Eventtitle = titleget();
			checkingpageTitle(Servicestitle, "Event");
			String EventUrl = ctrlUrl();
			CheckingPageUrl(EventUrl, "event");
			
			clickAll(h.getNewsSelect());
			String Newstitle = titleget();
			checkingpageTitle(Newstitle, "News");
			String NewsUrl = ctrlUrl();
			CheckingPageUrl(NewsUrl, "news");
			
			WebElement Contact = h.getContact();
			Contact.click();
				
			String Contacttitle = titleget();
			checkingpageTitle(Contacttitle, "Contact");
					
			String ContactUrl = ctrlUrl();
			CheckingPageUrl(ContactUrl, "contact");
			
			
		
	
		}	
		
		@Test
		private void tc2() throws InterruptedException {
			//to check Product dropdown Content 
			ProductMouse p = new ProductMouse();
			HomePojo h = new HomePojo();
			pageRefresh();
			WebElement product = h.getProductsSelect();
			mouseAction(product);
			WebElement land = p.getLand();
			clickAll(land);
		//	land.click();
			String titleLand = titleget();
			checkingpageTitle(titleLand, "Land");
			String currentUrl = ctrlUrl();
			CheckingPageUrl(currentUrl, "landval");
			pageRefresh();
			
			WebElement pr = h.getProductsSelect();
			mouseAction(pr);
			clickAll(p.getPro());
			String titleProval = titleget();
			checkingpageTitle(titleProval, "Proval");
			String ctrlUrlProval = ctrlUrl();
			CheckingPageUrl(ctrlUrlProval, "proval");
			
			pageRefresh();
			WebElement seq = h.getProductsSelect();
			mouseAction(seq);
			clickAll(p.getSequel());
			String titleseq = titleget();
			checkingpageTitle(titleseq, "Sequel");
			String ctrlUrlseq = ctrlUrl();
			CheckingPageUrl(ctrlUrlseq, "sequel");
		}
		
		@Ignore
	@Test
	private void tc3() {
		//to fill the contact details and Submit 
		ContactPojo c = new ContactPojo();
		WebElement contactFill = c.getContactFill();
		mouseAction(contactFill);
		contactFill.click();
		WebElement sdown = c.getScrollDown();
		scrollDownPage(sdown);
		WebElement first = c.getFirstName();
		textFill(first, "Deepak");
		textFill(c.getLastName(), "Pandi");
		textFill(c.getPhoneNumber(), "9500143657");
		textFill(c.getCompanyName(), "Jasmine Info Tech");
		textFill(c.getEmail(), "pandi.deepak05@gmail.com");
		clickAll(c.getCheckBox());
	//	clickAll(c.getSubmitButton());
		
		
		
		
	}
	
	
}
