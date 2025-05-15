package AlertHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Normal_OkAlert {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
        Thread.sleep(3000);
        //driver.switchTo().alert().accept();
        Alert myalert = driver.switchTo().alert();
        System.out.println(myalert.getText());
        myalert.accept();

    }
}
