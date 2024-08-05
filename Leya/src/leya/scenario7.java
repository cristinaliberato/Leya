package leya;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario7 {
	public static void main (String[] args) throws InterruptedException {
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leyaonline.com/pt/");
		
		Thread.sleep(2000);
		
		//Login into the webpage
		String email = "cristinaliberato87@hotmail.com";
		String password = "123456_cristina";
	
		driver.findElement(By.xpath("//a[@class='icon-login']")).click();
		driver.findElement(By.id("searchbar-large")).sendKeys(email);
		driver.findElement(By.id("searchbar-large")).sendKeys(password);
		
		Assertions.assertEquals(email, "cristinaliberato87@hotmail.com");
		System.out.println("The emails are the same");
		Assertions.assertEquals(password, "123456_cristina");
		System.out.println("The passwords are the same");
		
		driver.findElement(By.xpath("//a[@class='login-btn']")).click();
	
		
	}
}
