package AlertHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Prompt_Alert_Test {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
        Thread.sleep(3000);
        Alert myAlert = driver.switchTo().alert();
        myAlert.sendKeys("Mir Siam");
        Thread.sleep(3000);
        myAlert.accept();


    }
}
