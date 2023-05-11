package wrapper_GenericWrapper_CW;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GenericWrapper implements Wrapper{
static RemoteWebDriver driver;

	public void invokeApp(String browser, String Url) {
		if(browser.equalsIgnoreCase("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
		else { 
			System.setProperty("", "");
			driver = new FirefoxDriver();
		}
		
	}

	public void enterByID(String idValue, String Data) {
		// TODO Auto-generated method stub
		
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		
	}

	public void verifyByTitle(String title) {
		// TODO Auto-generated method stub
		
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		
	}

	public void getElementByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		
	}

	public void getTextById(String idVal) {
		// TODO Auto-generated method stub
		
	}

	public void getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		
	}

	public void selectVisibleTextById(String id, String value) {
		// TODO Auto-generated method stub
		
	}

	public void indexById(String id, int value) {
		// TODO Auto-generated method stub
		
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		
	}

	public void switchToFrameUsingIdName(String name) {
		// TODO Auto-generated method stub
		
	}

	public void takeSnap() {
		// TODO Auto-generated method stub
		
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		
	}

}
