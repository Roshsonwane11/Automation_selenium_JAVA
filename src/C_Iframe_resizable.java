import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C_Iframe_resizable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable");
		driver.manage().window().maximize();

		//tp locate iframe, inspect element. inspet krkr otipn ata hai iframe 
		WebElement Iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		
		//switchTo() ----for switch any window or frame
	    driver.switchTo().frame(Iframe); //webelemnt ko deke store karaya.
	    
	    //to drag souce to destination.
	    WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']//child::div[3]"));   //source
	    
	    Actions action = new Actions(driver);
	    
	    //x is horizonatl
	    //y is vertical
	    //uper: -
	    //lower: +
	    action.dragAndDropBy(resize, 150, -70).perform();  //ref_var, x, y
	    //action.dragAndDropBy(resize, -150, -70).perform();
	    //use this option for resize box
	}

}
