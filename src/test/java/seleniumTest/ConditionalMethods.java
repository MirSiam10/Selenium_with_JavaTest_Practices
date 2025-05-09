package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
            //
//isDisplayed....isEnabled.....isSelected//
            //
public class ConditionalMethods {

    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

        driver.manage().window().maximize();

        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        System.out.println(logo.isDisplayed());

        //boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        //System.out.println("Logo status is : "+status);


        boolean status2 = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
        System.out.println("First Name Field is selected : "+status2);

        WebElement Male_Radio = driver.findElement(By.xpath("//input[@id='gender-male']"));
        Male_Radio.click();
        WebElement Female_Radio = driver.findElement(By.xpath("//input[@id='gender-female']"));
        System.out.println("Female Radio button is : "+Female_Radio.isSelected());
        System.out.println("Male Radio button is: "+Male_Radio.isSelected());






    }

}
