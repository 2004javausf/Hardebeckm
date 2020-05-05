package com.revature.strange;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class StringTest {
	private String str;
	@BeforeAll
	static void beforeAll() {
		System.out.println("Beforeall");
	}
	
	@BeforeEach
	void beforeEach(TestInfo info) {
		System.out.println("Initialize test data for " + info.getDisplayName());
	}
	@AfterEach
	void afterEach(TestInfo info) {
		System.out.println("clean up test data for " + info.getDisplayName());
	}
	@Test
	@DisplayName("checking for the string length")
	void lengthCheck() {
		int actualLength = "ABCD".length();
		int expectedLength = 4;
		//assertEquals(expected value, actual value)
		assertEquals(expectedLength,actualLength);
	}
	
	@Test
	@DisplayName("checking for is it in")
	void contains_basic() {
		String str = "abcdefg";
		boolean result = str.contains("ijk");
		//assertEquals(result,str);
		assertFalse(result);
	}
	@SuppressWarnings("null")
	@Test
	@DisplayName("Check for exceptions")
	void lengthException() {
		String str = null;
		assertThrows(NullPointerException.class,
				()->{str.length();}
				);
	}
	
	@Nested
	@DisplayName("Nested Test")
	class nestTest {
		@BeforeEach
		void setToEmpty() {
			str = "";
		}
		@Test
		void lengthIsZero() {
			assertEquals(0,str.length());
		}
		@Test
		void uppercaseIsEmpty() {
			assertEquals("",str.toUpperCase());
		}
	}

}
