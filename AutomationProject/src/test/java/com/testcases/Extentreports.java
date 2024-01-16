package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extentreports {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("extentReports.html");
		
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlreporter);       
		
		ExtentTest test1= extent.createTest("BaseClass","validation");
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver (1).exe");
		 
           driver = new ChromeDriver();
        
        test1.log(Status.INFO,"Starting The test");
        
        driver.get("https:\\www.ups.com");
        
        driver.findElement(By.xpath("//*[@class='ups-cta ups-cta-primary d-none d-md-block ups-analytics']")).
        click();
        test1.pass("search the url");
		
		driver.close();
		
		driver.quit();
		
		test1.pass("Closed the browser");
		
		test1.info("Test Completed");
		
		extent.flush();
		
	}

}
