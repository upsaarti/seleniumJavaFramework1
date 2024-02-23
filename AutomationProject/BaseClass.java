
   package com.testcases;
   
   import java.io.File;
   import java.io.IOException;
   import java.time.Duration;
   import java.util.List;
   import org.openqa.selenium.TakesScreenshot;
   
   import org.apache.commons.io.FileUtils;
   //import org.apache.xmlbeans.impl.xb.xsd schema.ListDocument.List;
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

         WebDriver driver = new ChromeDriver();

         System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

         driver.get("https:\\www.ups.com");

         driver.findElement(By.xpath("//a [@class='ups-cta ups-cta-primary d-none d-md-block ups-analytics']")).click();
         driver.findElement(By.xpath("//input [@id='email']")).sendKeys("aumak@ups.com");
         driver.findElement(By.xpath("//button [@name='getTokenWithPassword1']")).click();
         driver.findElement(By.xpath("//input [@name='password']")).sendKeys("TcsUps@031296");
         driver.findElement(By.xpath("// button[@name='getTokenWithPassword']")).click();

         File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(screenshotFile, new File(".//screenshot/screen.png"));

         driver.findElement(By.xpath("// input[@name='trackNums']")).sendKeys("1Z0337YY7722924765");
         driver.findElement(By.xpath("// button[@id='stApp_widgetTrkNumBtn']")).click();

         driver.findElement(By.xpath("//span[@class='icon ups-icon-x']")).click();

         driver.findElement(By.id("dropdownMenuButton")).click();

         Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(20));
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("// button[@id='stApp_payNowLink']")));
         driver.findElement(By.xpath("//button [@id='stApp_payNowLink']")).click();

         Wait<WebDriver> wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));

         wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ippa_payment_input_continue']")));

         driver.findElement(By.xpath("//input [@id='ippa_payment_input_continue']")).submit();

         driver.manage().window().maximize();

         WebElement DropDown = driver.findElement(By.id("cpcWidget_paymentMethodSelect"));
         Select select = new Select(DropDown);
         select.selectByValue("99_new");

         WebElement DropDown1 = driver.findElement(By.name("cct"));
         Select select1 = new Select(DropDown1);
         select1.selectByValue("02_06");

         driver.findElement(By.id("cpcWidget_ccn")).sendKeys("4111 1111 4555 1142");
         driver.findElement(By.id("cpcWidget_svc")).sendKeys("737");

         WebElement DropDown2 = driver.findElement(By.id("cpcWidget_exm"));
         Select select2 = new Select(DropDown2);
         select2.selectByValue("3");

         WebElement DropDown3 = driver.findElement(By.id("cpcWidget_exy"));
         Select select3 = new Select(DropDown3);
         select3.selectByValue("2030");


         driver.findElement(By.id("cpcWidget_newAddress")).click();
         driver.findElement(By.id("cpcWidget_FirstName")).sendKeys("NIKLAS KARVONEN");
         driver.findElement(By.id("cpcWidget_City")).sendKeys("Voeraa");
         driver.findElement(By.id("cpcWidget_LastName")).sendKeys("NIKLAS KARVONEN");

         WebElement DropDown4 = driver.findElement(By.id("cpcWidget_States"));
         Select select4 = new Select(DropDown4);
         select4.selectByValue("NY");

         WebElement DropDown10 = driver.findElement(By.id("cpcWidget_Country"));
         Select select10 = new Select(DropDown10);
         select10.selectByValue("US");


         driver.findElement(By.id("cpcWidget_PostalCode")).sendKeys("21250");
         driver.findElement(By.id("cpcWidget_Address1")).sendKeys("5 Bergs Leden");
         driver.findElement(By.id("cpcWidget_Address2")).sendKeys("Oesterbotten");
         driver.findElement(By.id("cpcWidget_Address3")).sendKeys("Finland");

         WebElement DropDown5 = driver.findElement(By.id("cpcWidget_saveCard"));
         Select select5 = new Select(DropDown5);
         select5.selectByValue("2");


         driver.findElement(By.id("ippa_payment_continue")).submit();

         /*GooglePay*//*

      WebElement DropDown6= driver.findElement(By.name("cct"));
      Select select6= new Select(DropDown6);
      select6.selectByValue("30_97");

      *//* driver.findElement(By.id("cpcWidget_existingAddress")).click();*//*

      driver.findElement(By.id("cpcWidget_newAddress")). click();
      driver.findElement(By.id("cpcWidget_FirstName")).sendKeys("NIKLAS KARVONEN");
      driver.findElement(By.id("cpcWidget_City")).sendKeys("Voeraa");
      driver.findElement(By.id("cpcWidget_LastName")).sendKeys("NIKLAS KARVONEN");

      WebElement DropDown4= driver.findElement(By.id("cpcWidget_States"));
      Select select4= new Select(DropDown4);
      select4.selectByValue("NY");

      WebElement DropDown10= driver.findElement(By.id("cpcWidget_Country"));
      Select select10= new Select(DropDown10);
      select10.selectByValue("US");


      driver.findElement(By.id("cpcWidget_PostalCode")).sendKeys("21250");
      driver.findElement(By.id("cpcWidget_Address1")).sendKeys("5 Bergs Leden");
      driver.findElement(By.id("cpcWidget_Address2")).sendKeys("Oesterbotten");
      driver.findElement(By.id("cpcWidget_Address3")).sendKeys("Finland");

      WebElement DropDown12= driver.findElement(By.id("cpcWidget_saveAPM"));
      Select select12= new Select(DropDown12);
      select12.selectByValue("2");

      driver.findElement(By.id("ippa_payment_continue")).submit();
      driver.findElement(By.id("ippa_review_submit")).submit();



      driver.findElement(By.xpath("//div[@class='goog-inline-block jfk-button jfk-button-action b3-button b3id-button b3-ripple-container b3-primary-button jfk-button-hover']")).click();


      *//*PayPal*//*
      WebElement DropDown8= driver.findElement(By.name("cct"));
      Select select8= new Select(DropDown8);
      select8.selectByValue("12_97");


      
      driver.findElement(By.id("ippa_review_submit")).submit();
      driver.findElement(By.id("email")).sendKeys("");

      driver.findElement(By.id("password")).sendKeys("");
      driver.findElement(By.id("btnLogin")).submit();





   }
   }
*/


      }
   }




   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
