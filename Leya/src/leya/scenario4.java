package leya;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario4 {
	public static void main (String[] args) throws InterruptedException {
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leyaonline.com/pt/");
		
		Thread.sleep(2000);
		
		//search for 1984 and add at the basket
		driver.findElement(By.id("searchbar-large")).sendKeys("1984");
		driver.findElement(By.xpath("//*[text()='1984']")).click();
		driver.findElement(By.xpath("//a[@class='more buy-button']")).click();
		
		//Verify if the items added at the basket are equal to 1
		String numberOfitems = driver.findElement(By.xpath("//a[@data-tag]")).getText();
		Assertions.assertEquals(numberOfitems, 1);
		System.out.println("We have 1 Item at our basket.");
		
		
	}
}
