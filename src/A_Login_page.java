import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_Login_page {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
          
        driver.manage().window().maximize();//to maximize screen
        //wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//username
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("student");
		//password
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Password123");

	    //click button
		driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
	       
	    }
	
		
	}

