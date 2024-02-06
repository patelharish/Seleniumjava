package firstjavaselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorspractice {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdrive.chrome.driver", "C:\\Users\\patel\\OneDrive\\Desktop\\SDET\\chromedriver-win64\\chromedriver.exe");
      WebDriver driver;
      driver = new ChromeDriver();
      //here we are using implicitwait(synchronization) for set a required timeout
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      driver.get("https://rahulshettyacademy.com/locatorspractice/");
      driver.manage().window().maximize();
      driver.findElement(By.id("inputUsername")).sendKeys("Harish");// id locator used in this area
      driver.findElement(By.name("inputPassword")).sendKeys("Harish@321");// name locator used in this area
      driver.findElement(By.name("chkboxOne")).click();
      driver.findElement(By.cssSelector("button[type='submit']")).click();// cssSelector locator used in this area
      //printing error message in console 
      // we can write this way also System.out.println((driver.findElement(By.cssSelector("p.error")).getText()););
      String err = (driver.findElement(By.cssSelector("p.error")).getText());// cssSelector locator used in this area
      System.out.println(err);
      driver.findElement(By.linkText("Forgot your password?")).click();// linkText locator used in this area

      Thread.sleep(1000);//

      driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John"); // xpath locator used in this area

      driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");

      driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

      driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");

      driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");

      driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

      System.out.println(driver.findElement(By.cssSelector("form p")).getText());

      driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

      Thread.sleep(1000);

      driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

      driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

      driver.findElement(By.id("chkboxOne")).click();

      driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	}

}
