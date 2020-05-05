package com.revature.strange;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.revature.testing.Classy;

class TestForMatt {

	@Test
	void test() {
		String t = Classy.testy("yes");	
		String s = "yes";
		assertEquals(s,t);
	}

}
