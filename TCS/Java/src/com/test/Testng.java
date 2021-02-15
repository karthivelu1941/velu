package com.test;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng {
	
	@BeforeSuite
	
	public void Before()
	{
		System.out.println("before suit");
		
	}
	
	@BeforeClass
	
	public void Beforeclass()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	
	public void BeforeMethod()
	{
		System.out.println("Before Method");
	}

	@BeforeTest
	
	public void BeforeTest()
	{
		System.out.println("BeforeTest");
	}
	
	@Test
	
	public void Test()
	{
		System.out.println("Test");
	}
	
	@AfterSuite
	
	public void AfterTest()
	
	{
		System.out.println("After test");
	}
	
	@org.testng.annotations.AfterClass
	
	public void AfterClass()
	
	{
		System.out.println("After Class");
	}
	
	@AfterMethod
	
	public void AfterMethod()
	
	{
		System.out.println("AfterMethod");
	}
	
	@org.testng.annotations.AfterTest
	
	public void AfterTest1()
	{
		System.out.println("After test");
	}

}
