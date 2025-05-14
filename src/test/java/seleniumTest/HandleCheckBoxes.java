package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class HandleCheckBoxes {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //1) Select Specific CheckBox :

        //driver.findElement(By.xpath("//input[@id='sunday']")).click();

        //2) Select All checkboxes(Days)

        List<WebElement> checkboxes = (List<WebElement>) driver.findElement(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
            /*for(int i=0; i<checkboxes.size(); i++){
                checkboxes.get(i).click();

            }*/

        /*for(WebElement checkbox:checkboxes){
            WebElement checkbox1 = checkbox;
            checkbox1.click();
        }*/

            /*for(int i=4;i<checkboxes.size();i++){

                checkboxes.get(i).click();

            }*/

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
