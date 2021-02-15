package tcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3 {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.deccanrummy.com/");
		String title = driver.getTitle();
		System.out.println(title);

	}

}
