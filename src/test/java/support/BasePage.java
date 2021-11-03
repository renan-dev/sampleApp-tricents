package support;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

	public static WebDriver abrirNavegadorChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renan\\drivers\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();
		navegador.manage().window().maximize();
		navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		navegador.get("http://sampleapp.tricentis.com/101/app.php");
		
		return navegador;
	}

}
