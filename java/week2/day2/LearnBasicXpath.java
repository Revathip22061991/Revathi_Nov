package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnBasicXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ChromeDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("http://leaftaps.com/opentaps/control/main");
  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
  
	}

}
