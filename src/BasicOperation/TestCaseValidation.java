package BasicOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseValidation {
	
	static WebDriver driver;
	
	public void getTitle() {

		String s = driver.getTitle();
		System.out.println(s);

		if (s.equals("OrangeHRM")) {
			System.out.println("Correct title");
		} else {
			System.out.println("In-correct title");
		}

	}

	public void tearDown() {
		driver.quit();
	}

	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "J:\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

	}

}
