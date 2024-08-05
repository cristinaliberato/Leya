package leya;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario5 {
	public static void main (String[] args) throws InterruptedException {
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leyaonline.com/pt/");
		
		Thread.sleep(2000);
		
		Class<? extends WebElement> classnamebeforechange = driver.findElement(By.xpath("//*[contains(class(),'nav-icon')]")).getClass();

		//change the background of the website page
		driver.findElement(By.id("darkmode")).click();
		
		Class<? extends WebElement> classnameafterchange = driver.findElement(By.xpath("//*[contains(class(),'nav-icon')]")).getClass();
		
	
		Assertions.assertEquals(classnameafterchange, classnamebeforechange);
		System.out.println("The mode is not chaged.");
		

		
	}

}
