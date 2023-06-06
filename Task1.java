package HWclass6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utils.CommonMethods2.driver;
import static Utils.CommonMethods2.openBrowserAndLaunchApplication;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement btn= driver.findElement(By.xpath("//button[@id='startButton']"));
        btn.click();

        WebElement text=driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBePresentInElement(text, "Welcome Syntax Technologies"));

        System.out.println(text.getText());

        Thread.sleep(3000);
        driver.close();

    }
}

/*
HW1:
goto  http://practice.syntaxtechs.net/dynamic-elements-loading.php
click on start
print the text  "welcome syntax technologies "on console
 */
