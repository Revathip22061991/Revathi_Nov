package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicXpathSalesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ChromeDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.get(" https://login.salesforce.com/?locale=in");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    String title = driver.getTitle();
    System.out.println(title);
    if(title.contains("Home")) {
    	System.out.println("Title is printed");
    }
    else {
	System.out.println("Title is not printed");
	}
	
	String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	System.out.println(text);
	if(text.contains("Dilip")) {
		System.out.println("Lead is created");
	}
	else {
		System.out.println("Lead is not created");
	}
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("dilip@testleaf.com");
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@2024");
    driver.findElement(By.xpath("//input[@id='Login']")).click();
	}

}
