package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandleBrowserWindows {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

       Set<String> WindowsID=driver.getWindowHandles();
        System.out.println(WindowsID);
/*
        //Approach 1 :
        List<String> WindowsList = new ArrayList<>(WindowsID);
        String ParentID = WindowsList.get(0);
        String ChildID =  WindowsList.get(1);
        System.out.println("parentID is : "+ParentID);
        System.out.println("ChildID is : "+ChildID);

        driver.switchTo().window(ChildID);
        System.out.println(driver.getTitle());

        driver.switchTo().window(ParentID);
        System.out.println(driver.getTitle()); */

        // Approach 2  :

        for(String WinID:WindowsID){

            String Title = driver.switchTo().window(WinID).getTitle();

            if (Title.equals("OrangeHRM")){
                System.out.println(driver.getCurrentUrl());
            }

        }




    }
}
