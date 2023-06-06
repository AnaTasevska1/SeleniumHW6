package HWclass6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static Utils.CommonMethods2.driver;
import static Utils.CommonMethods2.openBrowserAndLaunchApplication;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement btn=driver.findElement(By.xpath("//button[@type='button']"));
        btn.click();

        WebElement text=driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        System.out.println(text.getText());

        Thread.sleep(3000);
        driver.close();

    }
}

/*
goto http://practice.syntaxtechs.net/dynamic-data-loading-demo.php
click on get new user
print the firstname of user
 */
