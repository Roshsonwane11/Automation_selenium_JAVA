import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C_DropDown2 {

	public static void main(String[] args){
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/samplepagetest");
        driver.manage().window().maximize(); // to maximize screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Name
        driver.findElement(By.id("g2599-name")).sendKeys("Roshani");
        driver.findElement(By.id("g2599-email")).sendKeys("sonawanerosh6@gmail.com");

        // Dropdown
        WebElement dropdown = driver.findElement(By.id("g2599-experienceinyears"));
        Select select = new Select(dropdown);
        select.selectByValue("7-10");

        // Checkboxes
        driver.findElement(By.cssSelector("input[value='Automation Testing']")).click();
        driver.findElement(By.cssSelector("input[value='Graduate']")).click();

        // Handle unexpected alert
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            System.out.println("Alert text: " + alertText);
            alert.dismiss();
        } catch (Exception e) {
            System.out.println("No alert present or unable to handle alert: " + e.getMessage());
        }

        // Add a comment
        driver.findElement(By.id("contact-form-comment-g2599-comment")).sendKeys("hello, please find above details");

        // Submit the form
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}

}
