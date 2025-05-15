package AlertHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ConfirmationAlert_Ok_or_Cancel {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://testautomationpractice.blogspot.com/");
         //Confirmation Alert - Ok or Cancel
         driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
Thread.sleep(3000);
         driver.switchTo().alert().accept();
         //driver.switchTo().alert().dismiss();



    }
}
