package week2.day2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(" https://login.salesforce.com/?locale=in");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    https://www.snapdeal.com/
	    	Home & Kitchen- ES to YS
	    	//span[@classname='labelIcon']/following-sibling::span
	    	Search - Parent to child
	    	//div[contains(@class,'search-box')]/i
	    	Cart- gp to gc
	    	//div[contains(@class,'cartContainer col-xs-11')]//span

	}

}
