import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class B_Hover {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Thread.sleep(2000);
		
		driver.findElement(By.className("Pke_EE")).sendKeys("Mobile" + Keys.ENTER);
		
		WebElement hover = driver.findElement(By.xpath("//span[text()='Electronics']"));//by text xpath
		
		Actions action = new Actions(driver); // always use driver here as a constructor value for hover
		action.moveToElement(hover).perform();  //hover is webelement which is created by us
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//samsung
		driver.findElement(By.linkText("Samsung")).click();
	}

}
