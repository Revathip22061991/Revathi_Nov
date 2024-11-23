package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EdgeDriver driver=new EdgeDriver();
		        //Load the url
				driver.get("http://leaftaps.com/opentaps/control/main");
				//Maximize the browser
				driver.manage().window().maximize();
				//Enter the username
				WebElement user = driver.findElement(By.id("username"));
				user.sendKeys("DemoSalesManager");
				user.clear();
				user.sendKeys("DemoCsr");
				//Enter the password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				//Click on login 
				driver.findElement(By.className("decorativeSubmit")).click();
				//System.out.println(driver.get("Welcome Demo Sales Manager"));
				//Click the CRM/SFA
				driver.findElement(By.linkText("CRM/SFA")).click();
				//Click the partial link text'
				driver.findElement(By.partialLinkText("RM")).click();
				Thread.sleep(5000);
				//Close the window
				//driver.close();
	            
	}

}
