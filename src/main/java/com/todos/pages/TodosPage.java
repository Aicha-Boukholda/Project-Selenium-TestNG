package com.todos.pages;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.todos.utils.BasePage;

public class TodosPage extends BasePage{
	public TodosPage() throws IOException
	{
		//super
		PageFactory.initElements(driver, this);
		
		
	}
	//retriev element
	@FindBy(how= How.XPATH ,using="//input[@placeholder='What needs to be done?']")
	public static  WebElement inputField;
	
	// 2eme cas de test pour verifier si l elet existe ds la liste 
	@FindBy(how= How.XPATH ,using="//label[contains(text(),'Adopter des')]")
	public static  WebElement tododtext;
	
	//3eme besoin on cherche si l elemnt est selctionné
	@FindBy(how= How.XPATH ,using= "// input[@type='checkbox']")
	public static  WebElement checkbox; 
	public void fillTodo(String todo) {
		inputField.sendKeys(todo);
		inputField.sendKeys(Keys.ENTER);
		
	}
	public Boolean isElementDisplayed(WebElement element)
	{
		return element.isDisplayed();
	}
	//méthode pr verifier si todo existe deja
	public String checkElementContain(WebElement element) {
		return element.getText();
		
	}
	//méthode pr verifier si lelement selectionne
	
	public Boolean isSelectedElement(WebElement element) {
		return element.isSelected();
	}
	
	

}
