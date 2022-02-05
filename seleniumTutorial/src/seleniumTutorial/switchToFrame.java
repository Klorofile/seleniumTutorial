package seleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class switchToFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
        driver.switchTo().frame("classFrame");
        driver.findElement(By.linkText("Deprecated")).click();
        driver.close(); 
    
	}

}
