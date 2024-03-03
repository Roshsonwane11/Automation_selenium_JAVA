import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C_Iframe_DragDrop {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();

		//1.loacte iframe IFrame ke liye frame pe switch karna pdta hai.for inspect element. inspet krkr otipn ata hai iframe 
		
		WebElement Iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		
		//switchTo() ----for switch any window or frame
	    driver.switchTo().frame(Iframe); //webelemnt ko deke store karaya.
	    
	    //to drag souce to destination.
	    WebElement Drag = driver.findElement(By.xpath("//div[@id='draggable']"));   //source
	    WebElement Drop =driver.findElement(By.xpath("//div[@id='droppable']"));    //destination
	    
	    //Actions is  perform krne ke liye predefine class 
	    //Action me hamesha driver pass krte hai
	    Actions action =new Actions(driver);
	  
	    //.dragAndDrop(source, Destination);
	    action.dragAndDrop(Drag, Drop).perform();
	    
	    driver.quit();
	}

}
