package com.timekeeping.actitime.seleniumAutomation.com.timekeeping.actitime.seleniumAutomation;

import org.testng.annotations.Test;

public class ToPerformGroupExecution {
	
	@Test 
	public void login() {
		        System.out.println("Login is Successfully");
		}
	@Test (groups="regressionTesting")
	public void select() {
		       System.out.println("Product is selected");
		}
	@Test (groups="regressionTesting")
	public void addToCart() {
		       System.out.println("Product add to cart");
	}
	@Test (groups="smokeTesting")
	public void logout() {
		       System.out.println("logged out succesfully");
	}
	}
		       
		       