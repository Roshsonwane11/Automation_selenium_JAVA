import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//Locator Find by XPath
public class Locactor_XPath {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login");
		driver.manage().window().maximize();//to maximize screen
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[@class='btn']//preceding::input[2]")).sendKeys("student");
		driver.findElement(By.xpath("//button[@class='btn']//preceding::input[1]")).sendKeys("Password123");
		
		driver.findElement(By.xpath("//button[@class='btn']")).click();

	}

}
