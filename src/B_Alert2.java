import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class B_Alert2 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();//to maximize screen
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//div[@class='_3sdu8W emupdz']//child::a[4]")).click();
		
		//to hanlde alert  with disable notification
		ChromeOptions options= new ChromeOptions();
		//FirefoxOptions option = new FirefoxOptions();
		options.addArguments("--disable-notifications");
		
        driver.findElement(By.xpath("//div[text()='Round Trip']")).click();

	}

}
