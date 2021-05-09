package BasicOperation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class ReadPropertyFile {

	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {

		Properties p = new Properties();

		FileInputStream fis = new FileInputStream(
				"J:\\java-learning-workspace\\SeleniumConcept\\src\\BasicOperation\\config.properties");

		p.load(fis);

		if (p.getProperty("browser").equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "J:\\browserDrivers\\chromedriver.exe");
			//driver = new ChromeDriver();
			driver = new HtmlUnitDriver();

		}

		else if (p.getProperty("browser").equals("ff")) {

			System.setProperty("webdriver.gecko.driver", "J:\\browserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		
		else if (p.getProperty("browser").equals("edge")) {

			System.setProperty("webdriver.edge.driver", "J:\\browserDrivers\\msedgedriver.exe");
			driver = new EdgeDriver();

		}

		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
		Thread.sleep(10000);
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
