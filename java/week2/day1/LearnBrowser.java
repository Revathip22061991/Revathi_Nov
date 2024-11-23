package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Instantiate the driver
		ChromeDriver driver= new ChromeDriver();
		//Load the url
		driver.get("http:/www.facebook.com");
		//Maximize the window
		driver.manage().window().maximize();
		//Enter the username
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("testleaf.2023@gmail.com");
		//Enter the password
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("Tuna@321");
		//Click on login button
		driver.findElement(By.name("login")).click();
		//thread.sleep
		Thread.sleep(3000);
		//Close the window
		//driver.close();
		

	}

}
