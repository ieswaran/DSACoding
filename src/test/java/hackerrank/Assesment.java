package hackerrank;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assesment {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        String Url = "";
        driver.get(Url);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();


    }

}
