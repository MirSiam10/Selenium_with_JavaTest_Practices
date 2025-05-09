package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2_XPATH {

    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.xpath("//input[@placeholder='Search store']")).sendKeys("Ip");

        driver.findElement(By.xpath("//input[@placeholder='Search store' and @name = 'q']")).sendKeys("Ip");
        driver.findElement(By.xpath("//a[text()='Apple MacBook Pro']")).click();

    }


}
