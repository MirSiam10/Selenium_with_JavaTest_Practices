package AlertHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Authenticated_POPUP_alert {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        //driver.get("https://the-internet.herokuapp.com/basic_auth");

        //Syntax
        //driver.get("https://username:password@the-internet.herokuapp.com/basic_auth");

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        driver.manage().window().maximize();


    }

}
