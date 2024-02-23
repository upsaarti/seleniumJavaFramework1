package com.testcases;
   
   import org.openqa.selenium.By;
   import org.openqa.selenium.WebDriver;
   import org.openqa.selenium.chrome.ChromeDriver;
   import org.testng.annotations.AfterTest;
   import org.testng.annotations.BeforeTest;
   import org.testng.annotations.Test;
   
   public class TestNG {
   
   WebDriver driver=null;
   
   @BeforeTest
   
   public void SetUpTest()
   {
   
   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver (1).exe");
   
   driver = new ChromeDriver();

   }
   
   @Test public void Search()
   {

       driver.get("https:\\www.ups.com");
   driver.findElement(By.xpath("// [@class='ups-cta ups-cta-primary d-none d-md-block ups-analytics']")).click();
   
   }
   
   @AfterTest public void TearDown() {
   
   
   driver.close();
   driver.quit();
   System.out.println("Completed");
   
   }
   
   }
   
