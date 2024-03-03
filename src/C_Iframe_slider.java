import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C_Iframe_slider {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider");
	
		driver.manage().window().maximize();

		//1.loacte iframe IFrame ke liye frame pe switch karna pdta hai.for inspect element. inspet krkr otipn ata hai iframe 
		
		WebElement Iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		//switchTo() ----for switch any window or frame
		driver.switchTo().frame(Iframe);
		
		//to drag souce to destination.
		WebElement slider = driver.findElement(By.cssSelector("div[id='slider'] >:nth-child(1)"));
		
		
		Actions action =new Actions(driver);
		//action.dragAndDropBy(slider, 100, 0).perform();
		
		action.dragAndDropBy(slider, 500, 0).perform();
        driver.quit();
	}

}
