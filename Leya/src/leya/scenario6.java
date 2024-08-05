package leya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario6 {
	public static void main (String[] args) throws InterruptedException {
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leyaonline.com/pt/");
		
		Thread.sleep(2000);
		
		//click on more options and select "Livros Escolares"
		driver.findElement(By.xpath("//a[@class='icon-hamburguer']")).click();
		driver.findElement(By.xpath("//*[text()='Livros Escolares']")).click();
		
		
		
	}
}
