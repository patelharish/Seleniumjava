package firstjavaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import dev.failsafe.internal.util.Assert;

public class locator2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  String name = "rahul";
	      //System.setProperty("webdrive.edge.driver", "C:\\Users\\patel\\OneDrive\\Desktop\\SDET\\edgedriver_win64\\msedgedriver.exe");
         // WebDriver driver;
         // driver = new EdgeDriver();// here we use edge driver
		  System.setProperty("webdrive.chrome.driver", "C:\\Users\\patel\\OneDrive\\Desktop\\SDET\\chromedriver-win64\\chromedriver.exe");
	      WebDriver driver;
	      driver = new ChromeDriver();
          driver.get("https://rahulshettyacademy.com/locatorspractice/");
          driver.manage().window().maximize();
          driver.findElement(By.id("inputUsername")).sendKeys(name);
          driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
          driver.findElement(By.name("chkboxOne")).click();
          driver.findElement(By.cssSelector("button[type='submit']")).click();
          Thread.sleep(2000);
          System.out.println(driver.findElement(By.tagName("p")).getText());
          //driver.manage().window().minimize(); 
          //Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
          System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
          driver.findElement(By.xpath("//*[text()='Log Out']")).click();
          
	}

}
