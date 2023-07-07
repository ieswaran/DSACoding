package mandatoryHomeWork.selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;


public class EditLead {
	@Test
	public void test() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//*[@id='label']/a")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@class='shortcuts']/li[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Jackcon");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mike");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Joseph");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("ricardo");
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		driver.findElement(By.name("description")).sendKeys("Create Lead");
		driver.findElement(By.name("primaryEmail")).sendKeys("absoluteVal@gmail.com");
		Select s = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		s.selectByVisibleText("New York");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@name='submitButton']")).click();
		driver.findElement(By.xpath("//*[text()='Edit']")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("Edit Import Note");
		driver.findElement(By.xpath("//*[@value='Update']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "View Lead | opentaps CRM");	
	}
}
