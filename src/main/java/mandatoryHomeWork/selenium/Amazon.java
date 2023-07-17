//
//package mandatoryHomeWork.selenium;
//
//
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import java.io.File;
//import java.io.IOException;
//import java.time.Duration;
//import java.util.Set;
//
//public class Amazon {
//	@Test
//	public void test() throws InterruptedException, IOException {
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.xpath("(//div[text()='oneplus 9 pro'])[1]")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//		String price = driver.findElement(By.xpath("(//span[@class='a-price'])[1]")).getText();
//		/*
//		 * int price1 = Integer.parseInt(price); System.out.println("price : "+price1);
//		 */
//
//		System.out.println("price : "+price);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		WebElement rating = driver.findElement(By.xpath("(//div[@class='a-row a-size-small'])[1]/span[2]"));
//		// String ratings = driver.findElement(By.xpath("(//div[@class='a-row
//		// a-size-small'])[1]/span[2]")).getText();
//		String ratings = rating.getText();
//		System.out.println(ratings);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.xpath("(//div[@class='a-row a-size-small'])[1]/span[2]/preceding::span[text()='(Renewed) OnePlus 9 Pro 5G (Pine Green, 12GB RAM, 256GB Storage)'][1]")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		String parentWindow = driver.getWindowHandle();
//		Set<String> handles = driver.getWindowHandles();
//		for (String windowHandle : handles) {
//			if (!windowHandle.equals(parentWindow)) {
//				driver.switchTo().window(windowHandle);
//				File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//				FileUtils.copyFile(scrFile, new File("./image.png"));
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//				driver.findElement(By.xpath("//input[@value='Add to Cart']")).click();
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//				String CartSubTotal = driver.findElement(By.xpath("(//b[text()='Cart subtotal']/following::span)[2]")).getText();
//				System.out.println("CartSubTotal : "+CartSubTotal);
//				//int cartsub = Integer.parseInt(CartSubTotal.replace(".00", ""));
//				//String cart =  String.valueOf(cartsub);
//				System.out.println("CartSubTotal : "+CartSubTotal);
//				String cartSubStr = CartSubTotal.substring(0, 7);
//				System.out.println(cartSubStr);
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//				if(price.equals(cartSubStr)) {
//					System.out.println("Both Price and CartSub total of the product are equal. price: "+price + "Cart Subtotal :"+CartSubTotal);
//				}
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//				Assert.assertEquals(price, cartSubStr);
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//				driver.quit();
//			}
//		}
//	}
//}
