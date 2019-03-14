import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class App {

	@Test
	public void openGmail() 
	{
	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\preet\\Desktop\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
		WebDriver  driver;	

	driver=new FirefoxDriver();
	driver.get("https://www.gmail.com");
	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
