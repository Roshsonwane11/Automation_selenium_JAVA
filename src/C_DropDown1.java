import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C_DropDown1 {

	public static void main(String[] args) {
		// ChromeDriver instance creation and navigation to Amazon
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		// Set an implicit wait for elements to be found
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Find the dropdown toggle button and click on it to reveal the options
		WebElement dropdownToggle = driver.findElement(By.id("searchDropdownBox"));
		dropdownToggle.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Find the desired option and click on it
		WebElement option = driver.findElement(By.xpath("//option[text()='Books']"));
		option.click();
		driver.findElement(By.className("nav-search-submit")).click();
        
   
    //by text and 
    //select.selectByVisibleText("Books");
    
    //by index index text start form 0
    //select.selectByIndex(4);
    
    

	}

}
