package mandatoryHomeWork.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Set;

public class Nykaa {
	@Test
	public void test() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement brands = driver.findElement(By.xpath("(//a[@class='css-1mavm7h'])[2]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Instantiating Actions class
		Actions actions = new Actions(driver);

		// Hovering on main menu
		actions.moveToElement(brands).clickAndHold().perform();
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// driver.findElement(By.xpath("//*[@id='list_topbrands']/following-sibling::div/a")).click();

		driver.findElement(By.xpath("//a[contains(text(),\"L'Oreal Paris\")]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String title = driver.getTitle();
		driver.getTitle().contains("L'Oreal Paris");
		// Assert.assertEquals(title, "L'Oreal Paris");
		System.out.println(title);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//span[text()='Sort By : popularity']")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		actions.sendKeys(Keys.PAGE_UP).build().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//div[@id='product-list-wrap']/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]")).click();
		System.out.println(driver.getTitle());
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Thread.sleep(2000);
		String parentWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String windowHandle : handles) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				Thread.sleep(5000);
				driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
				// actions.sendKeys(Keys.PAGE_DOWN).build().perform();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.findElement(By.xpath("//span[@class='cart-count']")).click();
				Thread.sleep(2000);
				WebElement iframe = driver.findElement(By.xpath("//*[@id='portal-root']/div/div[1]/iframe"));
				driver.switchTo().frame(iframe);
				String grandTotal = driver.findElement(By.xpath("//span[text()='Grand Total']/preceding::span[1]"))
						.getText();
				System.out.println(grandTotal);

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.findElement(By.xpath("//span[text()='Proceed']")).click();
				driver.switchTo().window(windowHandle);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.findElement(By.xpath("//*[@id='app']")).click();
				// driver.switchTo().window(windowHandle);
				String grtTtot = driver.findElement(By.xpath("(//p[text()='1 Items']/following::p)[2]")).getText();
				System.out.println(grtTtot);
				if (grandTotal.equalsIgnoreCase(grtTtot)) {
					System.out.println("Both the total are equal");
				}

			}
		}
		driver.quit();
	}
}
