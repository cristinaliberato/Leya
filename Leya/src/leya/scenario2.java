package leya;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario2 {
	public static void main (String[] args) throws InterruptedException {
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leyaonline.com/pt/");
		
		Thread.sleep(2000);
		
		//search for 1984
		driver.findElement(By.id("searchbar-large")).sendKeys("1984");
		driver.findElement(By.xpath("//*[text()='1984']")).click();
		
		//verify the name of the author
		String author = driver.findElement(By.xpath("//a[@class='nome_autor']")).getText();
		Assertions.assertEquals("George Orwell", author);
		System.out.println("The author is the correct one.");
		
		//verify the ISBN		
        String ISBN = driver.findElement(By.xpath("//*[contains(text(),'ISBN:')]")).getText();
        Assertions.assertEquals("9789722071550", ISBN);
		System.out.println("The ISBN is the correct one.");
		
		//Verify the number of pages		
		String Pages = driver.findElement(By.xpath("//*[contains(text(),'Páginas')]")).getText();
        Assertions.assertEquals("344", Pages);
		System.out.println("The number of pages are correct.");
		
		//verify the dimensions of the book		
		String BookDimensions = driver.findElement(By.xpath("//*[contains(text(),'Dimensões')]")).getText();
        Assertions.assertEquals("235 x 157 x 23 mm.", BookDimensions);
		System.out.println("The dimensions of the book are correct.");
		
	}


}
