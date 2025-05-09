package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
    public static void main(String args[]){
        System.out.println("CSS Selector Testing methods");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();

       driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("I-Phone");
       driver.findElement(By.linkText("Search")).click();

       driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("I-Phone");
        driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("iphone");
        driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("Iphone");
    }
}
