import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
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
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");//name locator
		driver.findElement(By.className("signInBtn")).click(); //classname locator
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); //cssSelector using tagname.attribute
		
		driver.findElement(By.linkText("Forgot your password?")).click(); //linkText locator
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("rahul"); //xpath locator
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com"); //cssSelector locator
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear(); //Xpath index locator 
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com"); //css index locator
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253"); //xpath locator using tagname
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); //cssSelector using .opertaor if classname
		driver.findElement(By.cssSelector("form p")).getText(); //cssSelector using tagname
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();//xpath selector using regular expression
		Thread.sleep(1000);//is used to stable the flow eg going to next pae will take time 
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");//cssSelector using #opertaor if id is there
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy"); //cssSelector locator using regular expression
		driver.findElement(By.xpath("//input[@value='rmbrUsername']")).click();//xpath locator
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();//xpath locator using regular expression
		
		
		
	
	}

}
