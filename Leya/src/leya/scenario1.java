package leya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;



public class scenario1 {
	
	public static void main (String[] args) throws InterruptedException {
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leyaonline.com/pt/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("searchbar-large")).sendKeys("George");
		
	    driver.findElement(By.xpath("//*[text()='O Triunfo dos Porcos']")).click();
		
		driver.findElement(By.xpath("//*[text()='Quinta Manor']"));
		
	}

}
