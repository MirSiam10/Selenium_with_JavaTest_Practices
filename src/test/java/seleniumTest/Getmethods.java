package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Getmethods {

public static void main(String args[]){

    WebDriver driver = new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());
    System.out.println(driver.getPageSource());
    String Window = driver.getWindowHandle();
    System.out.println("Window ID : "+Window);

    //

    Set<String> WindowIDs =  driver.getWindowHandles();
    System.out.println(WindowIDs);
}


}
