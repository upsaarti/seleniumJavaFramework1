package com.testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.TakesScreenshot;

import org.apache.commons.io.FileUtils;
//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

//import io.cucumber.messages.types.Duration;
	
	public class BaseClass {
		
		
		
		public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver (1).exe");
		 
        WebDriver  driver = new ChromeDriver();
        
        driver.get("https:\\www.ups.com");
        
       /* String title=driver.getTitle();
        System.out.println(title);
        
        if(title.equals("UPS ")) {
        	System.out.println("correct title");
        }
        else {
        	System.out.println("In-correct title");
        }
        
        System.out.println(driver.getCurrentUrl());
       // System.out.println(driver.getPageSource());
      //  driver.quit();*/
        
       driver.findElement(By.xpath("//*[@class='ups-cta ups-cta-primary d-none d-md-block ups-analytics']")).click();
        driver.findElement(By.xpath("//*[@name='userID']")).sendKeys("aumak@ups.com");
        driver.findElement(By.xpath("//*[@name='getTokenWithPassword1']")).click();
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("TcsUps@031296");
        driver.findElement(By.xpath("//*[@name='getTokenWithPassword']")).click();
        
        File screenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile,new File(".//screenshot/screen.png"));
        		
        		
        		
        		
        		
      /*  driver.findElement(By.xpath("//*[@name='trackNums']")).sendKeys("1Z5947YY0409159667");
        driver.findElement(By.xpath("//*[@id='stApp_widgetTrkNumBtn']")).click();
        
        
        
        
     Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));   
        
     
		
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='stApp_payNowLink']")));
         driver.findElement(By.xpath("//*[@id='stApp_payNowLink']")).click();
         
         Wait<WebDriver> wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));  
 		
         wait1.until(ExpectedConditions.visibilityOfElementLocated
        		 (By.xpath("//*[@id='ippa_payment_input_continue']")));
         
         driver.findElement(By.xpath("//*[@id='ippa_payment_input_continue']")).submit();
         
         WebElement DropDown= driver.findElement(By.id("cpcWidget_paymentMethodSelect"));
         Select select= new Select(DropDown);
         select.selectByValue("99_new");
         
      /*   WebElement DropDown1= driver.findElement(By.name("cct"));
         Select select1= new Select(DropDown1);
         select1.selectByValue("02_04");*/
         
         
         
     /*    select1.selectByValue("02_06");
         select1.selectByValue("02_01");
         select1.selectByValue("02_16");
         select1.selectByValue("02_03");
         select1.selectByValue("02_19");
         select1.selectByValue("02_15");
         select1.selectByValue("02_18");
        select1.selectByValue("12_97");
        select1.selectByValue("26_97");
       select1.selectByValue("40_97");*/
       
   /*   driver.findElement(By.id("cpcWidget_cct")).click();

        List<WebElement> allOptions = driver.findElements(By.cssSelector("select option"));

               String option = "MasterCard";

      

         for (int i = 0; i < allOptions.size(); i++) {

      if (allOptions.get(i).getText().contains(option)) {

        allOptions.get(i).click();

      // System.out.println("clicked");

       //break;
         
         
        
		}
	}
         
         
         
        driver.findElement(By.id("cpcWidget_ccn")).sendKeys("");
         
        WebElement DropDown1= driver.findElement(By.id("cpcWidget_exm"));
        Select select1= new Select(DropDown);
        select.selectByValue("4");
        
        WebElement DropDown2= driver.findElement(By.id("cpcWidget_exy"));
        Select select2= new Select(DropDown);
        select.selectByValue("2028");
        
        driver.findElement(By.id("cpcWidget_existingAddress")).click();
        driver.findElement(By.id("cpcWidget_newAddress")). click();
        driver.findElement(By.id("cpcWidget_FirstName")).sendKeys("");
        driver.findElement(By.id("cpcWidget_City")).sendKeys("");
        driver.findElement(By.id("cpcWidget_LastName")).sendKeys("");
        driver.findElement(By.id("cpcWidget_PostalCode")).sendKeys("");
        driver.findElement(By.id("cpcWidget_Address1")).sendKeys("");
        driver.findElement(By.id("cpcWidget_Address2")).sendKeys("");
        driver.findElement(By.id("cpcWidget_Address3")).sendKeys("");
        
        WebElement DropDown3= driver.findElement(By.id("cpcWidget_Country"));
        Select select3= new Select(DropDown);
        select.selectByValue("US");
        
        WebElement DropDown4= driver.findElement(By.id("cpcWidget_States"));
        Select select4= new Select(DropDown);
        select.selectByValue("  ");
        
        WebElement DropDown5= driver.findElement(By.id("cpcWidget_saveCard"));
        Select select5= new Select(DropDown);
        select.selectByValue("2");
        
        
          driver.findElement(By.id("ippa_payment_continue")).submit();
          */
         
      
		}
	}
	
        
    
        
        
        
        
        
        
        
        
         
     
	
	
        
        
        
        
        
     
    
	
	


