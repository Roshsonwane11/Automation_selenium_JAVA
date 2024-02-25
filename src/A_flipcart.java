import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_flipcart {

	public static void main(String[] args) {
		 //to call webdriver 
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();//to maximize screen
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.className("Pke_EE")).sendKeys("Mobile" + Keys.ENTER);
		
		//select fisr-child
		//driver.findElement(By.cssSelector("div[class='_5THWM1'] > *:first-child")).click();
		
		//select last-child
		//driver.findElement(By.cssSelector("div[class='_5THWM1'] > *:last-child")).click();
		
		//select Nth child
		driver.findElement(By.cssSelector("div[class='_5THWM1'] > *:nth-child(5)")).click();

		//driver.quit();
	}

}
