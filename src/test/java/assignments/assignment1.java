package assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import java.net.URL;

public class assignment1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.drive","chromedriver.exe");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver() ;
        //driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.getTitle());
        //Click Login button
        driver.findElement(By.xpath("/html/body/header/div/button[2]")).click();
        //Click home button
        driver.findElement(By.xpath("/html/body/header/div/a/button")).click();
        Thread.sleep(1000);
        System.out.println(driver.getTitle());
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/fieldset/input[1]")).sendKeys("It is a random test message");
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/fieldset/input[3]")).click();
        Thread.sleep(1000);

        Alert alert = driver.switchTo().alert();
        //Store the alert in a variable for reuse
        String text = alert.getText();
        System.out.println("Message in alert : "+ text);
        if (text.equals("Hello It is a random test message, Are you sure you want to confirm?")){
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
        //Press the Cancel button
        alert.dismiss();

        driver.quit();

    }

}
