package com.todos.utils;

import java.io.IOException;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;

public class Setup extends BasePage{
	
	public Setup() throws IOException {
	//methode pour utiliser les fonctions de classe mère BasePage
	super();
	}
	
	@Parameters({"browser"})
	@BeforeMethod
	public void setupTest(String browser) {
		
		
		initialization(browser);
		//ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("['start-maximized']");
		//chromeOptions.addArguments("--disable-search-engine-choice-screen");
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
		
	}
}
