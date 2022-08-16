package com.mystore.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Action.Action;
import page.Page;

public class Runner extends Action{
	Page p=new Page();
	@BeforeMethod
	public void launchBrowser() {
		
		LaunchBrowser();
		
		
	}
	@Test
	public void verifyLogo() {
		isDisplayed(p.logo);
		
		isDisplayed(p.contact);
		
	}
	@Test
	public void contactLable() {
		isDisplayed(p.contact);
	}
	

	
}
