package Checkboxes_Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Selected_Boxes {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        List<WebElement> checkboxes = (List<WebElement>) driver.findElement(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));




        for(int i=0; i<3; i++){
            checkboxes.get(i).click();
        }
        Thread.sleep(5000);

        for(int i=0; i<checkboxes.size(); i++){

            if(checkboxes.get(i).isSelected()){
                checkboxes.get(i).click();
            }

        }


    }
}