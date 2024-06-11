package TestCases;

import org.testng.annotations.Test;

import PageObj.PomLogin;

public class TC_02_login extends BaseClass {

	@Test
	public void Logintest()  {
		PomLogin rp=new PomLogin(driver);
		rp.setlogin();
		rp. setUsername("pavankumar");
		rp.setPassword("Pavan6789");
		rp.setsubmitbuttonn();
		
	}

}

