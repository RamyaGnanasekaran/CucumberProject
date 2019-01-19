package org.hex;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	@Before
	public static void beforeMethod() {
		System.out.println("Before Method");

	}

	@Before("@smoke")
	public static void beforeMethod1() {
		System.out.println("Before Method_1");

	}

	@Before
	public static void beforeMethod2() {
		System.out.println("Before Method 1");

	}

	@After
	public static void afterMethod() {
		System.out.println("After Method");
	}

	@After
	public static void afterMethod1() {
		System.out.println("After Method_1");
	}

	@After
	public static void afterMethod2() {
		System.out.println("After Method1");
	}
}
