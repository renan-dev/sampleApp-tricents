package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbrirNavegador {
	
	public static WebDriver abrirNavegadorChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renan\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		return driver;
		
	}
}
