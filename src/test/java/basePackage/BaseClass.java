package basePackage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	
	public static Properties prop = new Properties();
	public static WebDriver driver;
	
	public BaseClass() 
	{

		try {
			
		
  FileInputStream file = new FileInputStream("C:\\Users\\Main\\eclipse-workspace\\management\\src\\test\\java\\environmentvariables\\Config.properties");
  prop.load(file);
 
		
	}
		
		catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
catch (IOException a) {
	a.printStackTrace();
}}
	
		public static void initiation () {
		String browsername =	prop.getProperty("browser");		
		if (browsername.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver=new FirefoxDriver();}
			else if (browsername.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "chrome.exe");
				driver=new ChromeDriver ();
				}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
			}
			
		}
			
			
		
	
