package basic_of_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		
		WebDriver aju = new ChromeDriver();
		
		aju.get("https://www.flipkart.com/");
		
		aju.manage().window().maximize();
		

	}

}
