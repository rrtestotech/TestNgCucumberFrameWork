package com.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BrowserActionsUtil {
	public void clickElement(By obj, String objName) {
		try {
			//waitForElement(obj, objName);
			getWebElement(obj, objName).click();
			//log(LogType.INFO, "click on element " + objName);
		} catch (Exception e) {
			//log(LogType.ERROR, "Exception while clicking element: " + objName + " Exception: " + e.getMessage());
		}
	}
	public WebElement getWebElement(By streetname, String objName)
	 {
		// TODO Auto-generated method stub
		return null;
	}
	public void waitForElement(By streetname, String objName) 
	{
		// TODO Auto-generated method stub
		
	}
	public void cliclElementManyTimes(By obj, String objName,int productCount) {
		try {
			for(int i=1;i<productCount;i++) {
				waitForElement(obj, objName);
				getWebElement(obj, objName).click();
				//log(LogType.INFO, "click on element " + objName);
			}
		} catch (Exception e) {
			//log(LogType.ERROR, "Exception while clicking element: " + objName + " Exception: " + e.getMessage());
		}
			}

	
	public void type(WebElement ele,String txt){
		ele.sendKeys(txt);
	}
	
	public void click(WebElement ele){
		ele.click();
	}

	public void selectByValue(WebElement ele,String value){
		Select drop=new Select(ele);
		drop.selectByValue(value);
	}


	public void selectByIndex(WebElement ele,int index){
		Select drop=new Select(ele);
		drop.selectByIndex(index);
	}


	public void selectByVisibleText(WebElement ele,String text){
		Select drop=new Select(ele);
		drop.selectByVisibleText(text);
	}

	public boolean isSelected(WebElement ele){
		return ele.isSelected();
	}


	public boolean isDisplaye(WebElement ele){
		return ele.isDisplayed();
	}

	
	
}







