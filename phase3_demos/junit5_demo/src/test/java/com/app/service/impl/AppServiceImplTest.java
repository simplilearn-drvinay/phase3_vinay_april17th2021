package com.app.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.app.service.AppService;

class AppServiceImplTest {

	private static AppService service;
	
	@BeforeAll
	public static void createService() {
	service=new AppServiceImpl();	
	}
	
	@Test
	void testIsValidEvenNumberForValid() {
		int n=100;
		Assertions.assertEquals(true, service.isValidEvenNumber(n));
	}
	
	@Test
	void testIsValidEvenNumberForInValid() {
		int n=101;
		Assertions.assertEquals(false, service.isValidEvenNumber(n));
	}

	@Test
	void testIsValidPrimeNumberForNegativeValue() {
		int n=-1222;
		Assertions.assertFalse(service.isValidPrimeNumber(n));
	}
	
	@Test
	void testIsValidPrimeNumberForNonPrime() {
		int n=12;
		Assertions.assertFalse(service.isValidPrimeNumber(n));
	}
	@Test
	void testIsValidPrimeNumberForPrime() {
		int n=5;
		Assertions.assertTrue(service.isValidPrimeNumber(n));
	}

	@Test
	void testIsValidMobileNumberForNull() {
		Assertions.assertEquals(false, service.isValidMobileNumber(null));
		//Assertions.assertNull(service.isValidMobileNumber(null)); //return null
	}
	
	@Test
	void testIsValidMobileNumberForValid() {
		Assertions.assertEquals(true, service.isValidMobileNumber("+1-1234567890"));
	
	}
	
	@Test
	void testIsValidMobileNumberForInValid() {
		Assertions.assertEquals(false, service.isValidMobileNumber("+1-fdsfsddf"));
	
	}

}
