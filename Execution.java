package org.execution;

import org.baseclass.BaseClass;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.support.PageFactory;

import org.pagefactory.LoginPageFactory;
@RunWith(Suite.class)
@SuiteClasses({LoginPageFactory.class})
public class Execution extends PageFactory{
	

	
	public static void main(String[] args) {
		Result r=JUnitCore.runClasses(LoginPageFactory.class);
		int runCount = r.getRunCount();
		//System.out.println(runCount);
		int failureCount = r.getFailureCount();
		//System.out.println(failureCount);
		int ignoreCount = r.getIgnoreCount();
		//System.out.println(ignoreCount);
		int totalpass=runCount-(failureCount+ignoreCount);
		System.out.println(totalpass);

	}

	}


