
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

//import android.util;
//import android.view.accessibility.AccessibilityNodeInfo;

import com.google.common.util.concurrent.Monitor;


public class FirstAppiumCode {
	public static void main(String args[]) throws MalformedURLException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		/*
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Google Nexus 5");

		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		WebDriver driver = new ChromeDriver(capabilities);*/
		DesiredCapabilities capabilities = new DesiredCapabilities();
		File app= new File("C:\\Users\\Inspiron\\Downloads\\com.salesforce.chatter.apk");
		capabilities.setCapability("deviceName", "080b7e41006991b3");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, ""); //Name of mobile web browser to automate. Should be an empty string if automating an app instead.
		capabilities.setCapability(CapabilityType.VERSION, "5.1.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("newCommandTimeout","240");
		capabilities.setCapability("app",app.getAbsolutePath());
		capabilities.setCapability("app-package", "com.salesforce.chatter"); //Replace with your app's package
		capabilities.setCapability("app-activity", "salesfore.chatter.main"); //Replace with app's Activity
	    RemoteWebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4722/wd/hub"), capabilities);
	   // driver.wait(60);
	   
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   Thread.sleep(5000);
	//   driver.findElement(By.id("com.salesforce.chatter:id/mi_accept")).click();
	   Thread.sleep(5000);
	    driver.findElement(By.id("com.salesforce.chatter:id/log_in")).click();
	   driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='More options']")).click();
	    //driver.findElement(By.id("android:id/title")).click();
	   
	   driver.findElement(By.xpath("//android.widget.TextView[@text='Change Server']")).click();
	   //Thread.sleep(5000);
	   //android.widget.RadioGroup/
	    driver.findElement(By.xpath("//android.widget.RadioButton[@index='2']")).click();
	    
	    driver.findElement(By.id("com.salesforce.chatter:id/sf__apply_button")).click();
	  
	    Thread.sleep(20000);
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	   // driver.findElementByLinkText("Log in to Salesforce");
	   // driver.wait(6000);
	    //driver.manage().wait(6000);
	    
	    driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	    //driver.findElement(by)
	    driver.findElementByXPath("//android.widget.EditText[@index='2']").sendKeys("suruchiagrawal12@accenture.com");
	    //driver.findElementByXPath("//android.view.View[@content-desc='Username']").sendKeys("suruchiagrawal12@accenture.com");
	    driver.findElementByXPath("//android.widget.EditText[@index='6']").sendKeys("suruchi@sales1");
	  //  driver.findElementByXPath("//android.view.View[@content-desc='Password']").sendKeys("suruchi@sales1");
	  driver.findElement(By.xpath("//android.widget.Button[@content-desc='Log in to Salesforce']")).click();
	  Thread.sleep(20000);
	 //----- driver.findElement(By.xpath("//android.widget.Button[@content-desc='Email me a verification code']")).click();
	    
	  driver.findElement(By.xpath("//android.widget.Button[@content-desc='Allow']")).click();
	  Thread.sleep(5000);
	  //driver.findElement(By.xpath("//android.view.View[@content-desc='Skip']")).click();
	  /*driver.findElement(By.id("android:id/home")).click();
	  
	  driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='8']")).click();
	  //------driver.findElement(By.id("com.salesforce.chatter:id/standard_title")).click();
	  Thread.sleep(5000);
	 driver.findElement(By.xpath("//android.widget.TextView[@text='Accounts']")).click();
	  //UiSelector us =new UiSelector().text();
	// Thread.sleep(5000);
	  //driver.findElement(By.xpath("//android.widget.RelativeLayout[8]/android.widget.TextView[@text='Accounts']")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.id("com.salesforce.chatter:id/new_button")).click();
	  Thread.sleep(65000);
	  driver.findElement(By.xpath("//android.widget.EditText[@content-desc='Account Name*']")).sendKeys("abcdef1");
	  driver.findElement(By.xpath("//android.widget.Button[@content-desc='Save']")).click();
	  */
	  
	  
	  driver.findElement(By.id("android:id/home")).click();
	  //driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='10']")).click();
	    
	  driver.findElement(By.xpath("//android.widget.TextView[@text='Log out']")).click();
	    //driver.findElement(By.id("com.salesforce.chatter:id/sign_up")).click();
		//DesiredCapabilities caps = new DesiredCapabilities();
		//caps.setCapability("newCommandTimeout", 300);
		 //caps.setCapability("app", "Chrome");
		
		//RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4723/wd/hub"),caps);

		

	}
}
