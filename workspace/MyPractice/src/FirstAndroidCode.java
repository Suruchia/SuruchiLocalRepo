
import io.selendroid.client.SelendroidDriver;
import io.selendroid.common.SelendroidCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
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

import com.google.common.util.concurrent.Monitor;


public class FirstAndroidCode {
	public static void main(String args[]) throws Exception
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
		//DesiredCapabilities capabilities = new DesiredCapabilities();
		SelendroidCapabilities cp = new SelendroidCapabilities("com.salesforce.chatter:7.1.2");
		//cp.setEmulator(false);
	//SelendroidDriver driver = new SelendroidDriver(cp);
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), cp);
	driver.quit();
		/*File app= new File("C:\\Users\\Inspiron\\Downloads\\com.salesforce.chatter.apk");
		capabilities.setCapability("deviceName", "080b7e41006991b3");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, ""); //Name of mobile web browser to automate. Should be an empty string if automating an app instead.
		capabilities.setCapability(CapabilityType.VERSION, "5.1.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app",app.getAbsolutePath());
		capabilities.setCapability("app-package", "com.salesforce.chatter"); //Replace with your app's package
		capabilities.setCapability("app-activity", "salesfore.chatter.main"); //Replace with app's Activity
	    RemoteWebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4722/wd/hub"), capabilities);*/
	   // driver.wait(60);
	    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //driver.findElement(By.id("com.salesforce.chatter:id/log_in")).click();
	   // driver.wait(6000);
	    //driver.manage().wait(6000);
	  //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //driver.findElement(by)
	    //driver.findElement(By.xpath("//android.widget.Button[@content-desc='Log in to Salesforce']")).click();
	    
	    
	    
	    
	    //driver.findElement(By.id("com.salesforce.chatter:id/sign_up")).click();
		//DesiredCapabilities caps = new DesiredCapabilities();
		//caps.setCapability("newCommandTimeout", 300);
		 //caps.setCapability("app", "Chrome");
		
		//RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4723/wd/hub"),caps);

		

	}
}
