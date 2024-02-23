import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class basic8 {

	public static void main(String[] args) {
		 // Setting Chrome Driver Path
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Automation_java_selenium\\Driver_folder\\chromedriver.exe");
		 
		// Initializing ChromeDriver with options
		 ChromeOptions options = new ChromeOptions();
		// Setting Chrome Binary Path
		 options.setBinary("C:\\Users\\User\\Downloads\\chrome-win32\\chrome-win32\\chrome.exe");
		
		 ChromeDriver driver = new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.com");
	}

}
