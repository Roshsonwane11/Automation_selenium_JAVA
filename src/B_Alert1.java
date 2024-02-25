import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_Alert1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/samplepagetest");
		driver.manage().window().maximize();//to maximize screen
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='Alert Box : Click Here']")).click(); 
   
		//alert for OK  or allow  button
		driver.switchTo().alert().accept();
		//to click on cancel or block
		driver.switchTo().alert().dismiss();
	}

}
