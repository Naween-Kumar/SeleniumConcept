package BasicOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "J:\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		WebElement wb = driver.findElement(By.xpath("//*[@id=\"highlight-addons\"]"));
		Actions ac = new Actions(driver);
		
		ac.moveToElement(wb).build().perform();
		Thread.sleep(10000);
		driver.quit();

	}

}
