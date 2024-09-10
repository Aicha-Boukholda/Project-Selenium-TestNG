package com.todos.tests;

import java.io.IOException;

import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

import com.todos.pages.TodosPage;
import com.todos.utils.Setup;

public class AddTodoTest extends Setup{
	
	public AddTodoTest() throws IOException {
		super();
	}
	
	TodosPage todoPage ;
	@Test
	void iCanAddTodo() throws InterruptedException, IOException
	{
		todoPage= new TodosPage();
		boolean checkFieldTodo =todoPage.isElementDisplayed(TodosPage.inputField);
		Assert.assertTrue(checkFieldTodo);
		todoPage.fillTodo(prop.getProperty("todo1"));
		Thread.sleep(3000);
		String textTodo = todoPage.checkElementContain(TodosPage.tododtext);
		
		//System.out.println("ffffff"  + prop.getProperty("todo1"));
		Assert.assertEquals(textTodo,prop.getProperty("todo1"));
		Thread.sleep(3000);
		
		
		boolean checkBox =todoPage.isSelectedElement(TodosPage.checkbox);
		//System.out.println("fffffffffff"  +checkBox);
		Assert.assertFalse(checkBox);
		
		
	}

}
