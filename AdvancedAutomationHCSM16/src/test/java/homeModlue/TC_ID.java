package homeModlue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.UtilityMethods;

public class TC_ID extends BaseClass{
	@Test
	public void TestCaseDescription() throws IOException, InterruptedException {
		WebElement email = driver.findElement(By.id("Email"));
		WebElement password = driver.findElement(By.id("Password"));
		WebElement login = driver.findElement(By.xpath("//input[@value='Log in']"));
		
		UtilityMethods.ActionsUtility(driver).sendKeys(email, "hello").perform();
		UtilityMethods.ActionsUtility(driver).sendKeys(password,"password").perform();
		UtilityMethods.ActionsUtility(driver).click(login).perform();
		/*
		 * JavaScriptExcecutorUtility.EnteringDataToELementsUsingJavaScript(email,
		 * "hcsm166");
		 * JavaScriptExcecutorUtility.EnteringDataToELementsUsingJavaScript(password,
		 * "demo1223234");
		 * JavaScriptExcecutorUtility.clickingOnELementUsingJavaScript(login);
		 */	}
	

}
