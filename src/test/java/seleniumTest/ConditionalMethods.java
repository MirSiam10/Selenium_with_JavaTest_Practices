package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();

        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        System.out.println(logo.isDisplayed());

        boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        System.out.println("Logo status is : "+status);

    }

}
