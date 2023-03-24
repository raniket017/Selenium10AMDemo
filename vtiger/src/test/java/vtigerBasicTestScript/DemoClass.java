package vtigerBasicTestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMrepo.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoClass {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://localhost:8888/");
		
		LoginPage login = new LoginPage(driver);
		login.loginAction("admin", "admin");
	}
}
