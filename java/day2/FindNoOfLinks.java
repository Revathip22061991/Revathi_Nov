package week3.day2;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindNoOfLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://leafground.com/dashboard.xhtml");
		
	List<WebElement> totalLink = driver.findElements(By.tagName("a"));
		int size = totalLink.size();
		System.out.println(size);
		 for (int i = 0; i < totalLink.size(); i++) {
			 System.out.print(totalLink.get(i).getText());
			
		}
		
		
		
	}

}
