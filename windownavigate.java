package firstjavaselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windownavigate {

	public static void main(String[] args) {
		System.setProperty("webdrive.chrome.driver", "C:\\Users\\patel\\OneDrive\\Desktop\\SDET\\chromedriver-win64\\chromedriver.exe");
	      WebDriver driver;
	      driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.google.com/");
	      driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
	      driver.manage().window().maximize();
	      driver.navigate().back();
	      driver.navigate().forward();
	      driver.close();
	}

}
