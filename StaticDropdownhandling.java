package firstjavaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdownhandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdrive.chrome.driver",
				"C:\\Users\\patel\\OneDrive\\Desktop\\SDET\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement selectDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		driver.findElement(By.xpath("//option[@value='AED']")).click();

		// these methods are working on when select tag is available in code
		Select dropdown = new Select(selectDropdown);
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.id("divpaxinfo")).click();


    	// Another dropdown
		
		Thread.sleep(2000);
		/*int i = 1;
		while (i<5) {
			
			Thread.sleep(3000);
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;

		} */
		
		// using for loop
		
		for(int i=1; i<5; i++) {
			Thread.sleep(2000);
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();

	}

}
