package firstjavaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selfirst {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\OneDrive\\Desktop\\SDET\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		System.out.println(driver.getTitle());
		//launch url
		driver.manage().window().maximize();
		//find element using locator
		WebElement m= driver.findElement(By.id("user-name"));
		//enter username in  input field  
		m.sendKeys("standard_user");
		WebElement p= driver.findElement(By.id("password"));
		p.sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();

		//m.sendKeys(Keys.ENTER);
		//driver.close();

	}

}
