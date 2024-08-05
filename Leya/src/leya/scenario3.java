package leya;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario3 {
	public static void main (String[] args) throws InterruptedException {
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leyaonline.com/pt/");
		
		Thread.sleep(2000);
		
		//search for 1984
		driver.findElement(By.id("searchbar-large")).sendKeys("1984");
		String author1984 = driver.findElement(By.xpath("//a[@class='nome_autor']")).getText();
		
		//search for A Quinta dos Animais
		driver.findElement(By.id("searchbar-large")).sendKeys("A Quinta dos Animais");
		String authorQuinta = driver.findElement(By.xpath("//a[@class='nome_autor']")).getText();
		
		
		//Verify if booth books have the same author
		Assertions.assertEquals(author1984, authorQuinta);
		System.out.println("The authors are the same");
		
		
	}
}
