package seleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class firstSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // declaration and instantiation of objects/variables
//    	System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
        String pageSource = "";
        String currentUrl = "";
        String tour = "New Tours";
        String text = "";
 

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();
        pageSource = driver.getPageSource();
        currentUrl = driver.getCurrentUrl();
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        System.out.println(actualTitle);
        System.out.println(pageSource);
        System.out.println(currentUrl);
        //close Fire fox
        
        text = driver.findElement(By.linkText(tour)).getText();
        driver.findElement(By.linkText(tour)).click();
        
        System.out.println(text);
        
        driver.close();
        System.exit(0);
	}

}
