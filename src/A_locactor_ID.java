import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//loactor find by ID
public class A_locactor_ID {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
		
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		driver.findElement(By.id("nav-hamburger-menu")).click();
	}
	
}
