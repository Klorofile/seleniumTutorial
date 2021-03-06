package seleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findElementLocator {
	
	public static void main (String [] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://www.facebook.com";
        String tagName = "";
        String text ="";
        
        driver.get(baseUrl);
        tagName = driver.findElement(By.id("email")).getTagName();
        text = tagName = driver.findElement(By.id("email")).getText();
        System.out.println(tagName);
        System.out.println(text);
        driver.close();
        System.exit(0);
	}
}
