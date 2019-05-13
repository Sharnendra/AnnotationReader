package com.mkyong.test;

import com.mkyong.test.core.Test;
import com.mkyong.test.core.TesterInfo;
import com.mkyong.test.core.TesterInfo.Priority;


public class TestExample {

	@TesterInfo(
			priority = Priority.HIGH, 
			createdBy = "mkyong.com",  
			tags = {"sales","test" }
		)
	@Test
	void testA() {
	  if (true)
		throw new RuntimeException("This test always failed");
	}

	@SuppressWarnings("unused")
	@Test(enabled = false,value = {"sales","test" },createdBy = "mkyong.com,sharnendra,sanjeev")
	void testB() {
	  if (false)
		throw new RuntimeException("This test always passed");
	}

	@Test(enabled = true, value = {"Admin","User" },createdBy = "mkyong.com,sharnendra,sanjeev")
	void testC() {
	  if (10 > 1) {
		// do nothing, this test always passed.
	  }
	}

}