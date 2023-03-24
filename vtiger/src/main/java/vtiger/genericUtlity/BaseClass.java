package vtiger.genericUtlity;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.mysql.cj.jdbc.Driver;

import POMrepo.HomePage;
import POMrepo.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver sDriver;
	public WebDriver driver;
	public WebDriverUtility wUtils = new WebDriverUtility();
	public FileUtility fUtils=new FileUtility();
	public Connection connection;
	@BeforeSuite
	public void bsConfig() throws SQLException {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "root", "root");
		System.out.println("Data base connection has been established");
	}
	@BeforeClass
	public void bcConfig() throws IOException {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		wUtils.MaximizeTheBrowser(driver);
		wUtils.implicitWait(driver);
		System.out.println("The browser has been launched");
		String url = fUtils.fetchDataFromPropertyFile("url");
		driver.get(url);
		System.out.println("The URL has been navigated");
		sDriver = driver;
	}
	@BeforeMethod
	public void bmConfig() throws IOException {
		String username = fUtils.fetchDataFromPropertyFile("username");
		String password = fUtils.fetchDataFromPropertyFile("password");
		
		LoginPage login=new LoginPage(driver);
		login.loginAction(username, password);
		System.out.println("Logged in to the application");
	}
	@AfterMethod
	public void amConfig() {
		HomePage home=new HomePage(driver);
		home.logoutAction();
		System.out.println("Logged out from the application");
	}

	@AfterClass
	public void acConfig() {
		driver.quit();
		System.out.println("The browser has been closed");
	}
	@AfterSuite
	public void asConfig() throws SQLException {
		connection.close();
		System.out.println("The Data base connection has been closed");
	}
	
	
	
	
	
}
