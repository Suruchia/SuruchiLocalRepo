import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.Proxy.ProxyType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DOMPractice {
	
	public static void main(String args[])
	{
		WebDriver dr = new FirefoxDriver();
		dr.get("HTTP://www.gmail.com");
		dr.findElement(By.id("Email")).sendKeys("suruchiagrawal07@gmail.com");
		dr.findElement(By.id("Passwd")).sendKeys("07812225546");
		dr.findElement(By.id("signIn")).click();
		dr.findElement(By.xpath(".//a[@title='Sent Mail']"));
	}

}
