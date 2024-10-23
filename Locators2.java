
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name="rahul";
		//setting property
	    System.setProperty("webriver.chrome.driver", "C:\\\\Users\\\\pkuma500\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe.exe\\");
		//invoking ChromeDriver
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//is used to tell the browser to wait for certain amount of time before throwing exception
		//hitting the URL
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//printing the Title
		System.out.println("Title is "+driver.getTitle());
				
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");//id locator 
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");//name locator
		driver.findElement(By.className("signInBtn")).click(); //classname locator
		Thread.sleep(2000);	
		System.out.println(driver.findElement(By.tagName("p")).getText());//tagname locator
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");//to validate expected vs result
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		//button[text()='Log Out'] xpath locator
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();//closing the page
	
		
	}
	public static void getPassword(WebDriver driver) {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//printing the Title
		System.out.println("Title is "+driver.getTitle());
	}

}
