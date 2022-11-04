package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		
		WebElement button = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(button).build().perform();
		
		

	}

}
