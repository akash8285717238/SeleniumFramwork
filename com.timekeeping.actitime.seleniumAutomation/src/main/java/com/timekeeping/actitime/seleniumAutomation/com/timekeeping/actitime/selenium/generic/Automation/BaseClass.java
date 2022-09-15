package com.timekeeping.actitime.seleniumAutomation.com.timekeeping.actitime.selenium.generic.Automation;

public class BaseClass {
	package com.timekeeping.actitime.seleniumAutomation.com.timekeeping.actitime.seleniumAutomation;

import com.timekeeping.actitime.seleniumAutomation.com.timekeeping.actitime.seleniumAutomation.CreatNewCustomerPage;
import com.timekeeping.actitime.seleniumAutomation.com.timekeeping.actitime.seleniumAutomation.ExcelUtility;
import com.timekeeping.actitime.seleniumAutomation.com.timekeeping.actitime.seleniumAutomation.ExcelUtilty;
import com.timekeeping.actitime.seleniumAutomation.com.timekeeping.actitime.seleniumAutomation.HomePage;
import com.timekeeping.actitime.seleniumAutomation.com.timekeeping.actitime.seleniumAutomation.JavaUtility;
import com.timekeeping.actitime.seleniumAutomation.com.timekeeping.actitime.seleniumAutomation.LoginPage;
import com.timekeeping.actitime.seleniumAutomation.com.timekeeping.actitime.seleniumAutomation.TaskPage;
import com.timekeeping.actitime.seleniumAutomation.com.timekeeping.actitime.seleniumAutomation.WebDriver;
import com.timekeeping.actitime.seleniumAutomation.com.timekeeping.actitime.seleniumAutomation.javaUtilty;

public class BaseClass {
		
		public WebDriver driver;
		
		public javaUtilty jUtils= new JavaUtility();
		public ExcelUtility eUtils1=new ExcelUtilty();
	    public  LoginPage login=new LoginPage(driver);
	    public HomePage home =new HomePage(Driver);
	    public TaskPage task =new TaskPage(Driver);
	    public CreatNewCustomerPage createCustomer=new CreatNewCustomerPage(driver);
	    
			// TODO Auto-generated constructor stub
		}@
		}
		
		

	}



}
