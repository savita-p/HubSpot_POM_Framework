package com.qa.hubspot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.hubspot.base.BasePage;

public class ContactsPage extends BasePage 
{
	
	 @FindBy(xpath="//li/button[@data-confirm-button='accept']")
	    WebElement CreateContactSecondbtn;
	
	 @FindBy(xpath="//span[text()='Create contact']")
	    WebElement CreateFirstBtn;
	 
    @FindBy(xpath="//input[@data-field='email']")
    WebElement email;
    
    @FindBy(xpath="//input[@data-field='firstname']")
    WebElement FirstName;
    
    @FindBy(xpath="//input[@data-field='lastname']")
    WebElement LastName;
    
    @FindBy(xpath="//input[@data-field='jobtitle']")
    WebElement JobTitle;
    
    public ContactsPage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    public void createNewContact(String emailValue,String firstname,String lastname,String jobTitle)
    {
    	WebDriverWait wait=new WebDriverWait(driver,10);
    	
    	wait.until(ExpectedConditions.elementToBeClickable(CreateFirstBtn));
    	CreateFirstBtn.click();
    	
    	
    	wait.until(ExpectedConditions.elementToBeClickable(email));
    	email.sendKeys(emailValue);
    	
    	wait.until(ExpectedConditions.elementToBeClickable(FirstName));
    	FirstName.sendKeys(firstname);
    	
    	wait.until(ExpectedConditions.elementToBeClickable(LastName));
    	LastName.sendKeys(lastname);
    	
    	wait.until(ExpectedConditions.elementToBeClickable(JobTitle));
    	JobTitle.sendKeys(jobTitle);
    	
    	wait.until(ExpectedConditions.elementToBeClickable(JobTitle));
    	CreateContactSecondbtn.click();
    	
    	
    }
    
    
    
    
    
    
}
