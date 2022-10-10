package com.mvn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	
	@Test
	public void logTest1() {
		Login lg = new Login();
		Assert.assertEquals("valid", lg.userLogin("clouds123", "cds@321"));
	}
	
	@Test
	public void logTest2() {
		Login lg = new Login();
		Assert.assertEquals("invalid", lg.userLogin("clouds", "cds@321"));
	}
}
