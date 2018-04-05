package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OpenBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver","lib//IEDriverServer.exe" );
		WebDriver driver = new InternetExplorerDriver();
		//in order to solve ssl certificate issue: desired capabilities a webdriver package class ,set the browser behavior
		DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		////////////////////////////////
		driver.get("http://google.com");//method to open a new webpage in current browser
		String sTitle = driver.getTitle();//to get the current web page title as string
		String sCurrentUrl= driver.getCurrentUrl();//to get the current open url string
		//String sPageSource = driver.getPageSource();//to get the sorce code in string
		
		System.out.println("title : " +sTitle +"//n" +"url : "+sCurrentUrl);
		//driver.close();//will close only current browser window in focus
		driver.quit();//will close all the browser windows opened by driver object so far
		
	}

}
