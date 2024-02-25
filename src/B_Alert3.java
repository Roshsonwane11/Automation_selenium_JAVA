import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_Alert3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();//to maximize screen
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

		Thread.sleep(2000);
		//driver.switchTo().alert().accept();  //alert for OK  or allow  button
		
		driver.switchTo().alert().dismiss();  //to click on cancel or block
	}

}
