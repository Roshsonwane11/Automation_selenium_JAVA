import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_Alert4 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();//to maximize screen
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//prompt alert
		WebElement button = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		button.click();
		
		//Alert is Thread.sleep(2000)
		Thread.sleep(2000);
		Alert alert2 = driver.switchTo().alert();
		System.out.println("mgs sent");
		alert2.sendKeys("Welecome to Alert Demo!");
		alert2.accept();
		
		//driver.switchTo().alert().accept();  //alert for OK  or allow  button

	}

}
