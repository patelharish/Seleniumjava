package firstjavaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class resetpassandpastelogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdrive.chrome.driver", "C:\\Users\\patel\\OneDrive\\Desktop\\SDET\\chromedriver-win64\\chromedriver.exe");
	      WebDriver driver;
	      driver = new ChromeDriver();
	      // calling the method
	      String password = getPassword(driver);
	      driver.get("https://rahulshettyacademy.com/locatorspractice/");
	      driver.manage().window().maximize();
	      Thread.sleep(1000);
	      driver.findElement(By.id("inputUsername")).sendKeys("rahul");// id locator used in this area
	      driver.findElement(By.name("inputPassword")).sendKeys(password);
	      driver.findElement(By.name("chkboxOne")).click();
	      driver.findElement(By.cssSelector("button[type='submit']")).click();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		
	    driver.get("https://rahulshettyacademy.com/locatorspractice/");
	    driver.findElement(By.linkText("Forgot your password?")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		// Please use temporary password 'rahulshettyacademy' to Login.
		String[] passArray = passwordText.split("'");
		String[] passArray2 = passArray[1].split("'");
		return passArray2[0];
		//String password = passArray[1].split("'")[0];
		//return password;
		// 0th index - Please use temporary password 
		// 1st index - rahulshettyacademy' to Login.
		
		// 0th index - rahulshettyacademy
		// 1st index - to Login.
			
	
	}

}
