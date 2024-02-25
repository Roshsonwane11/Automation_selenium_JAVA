import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_Alert_Try_catch {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();//to maximize screen
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//div[@class='_3sdu8W emupdz']//child::a[4]")).click();
		
		//Try--catch
		try {
			driver.switchTo().alert().accept();			
		}catch(Throwable ex){
			System.out.println("Exception handle " + ex);
			
		}
		Thread.sleep(4000);
        driver.findElement(By.xpath("//div[text()='Round Trip']")).click();

	}

}
