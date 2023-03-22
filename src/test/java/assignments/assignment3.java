package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment3 {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.drive","");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://ultimateqa.com/automation");
        driver.findElement(By.linkText("Login automation")).click();
        driver.findElement(By.xpath("//div[@class='form__group']/child::input[@type='email']")).sendKeys("maazkid3@gmail.com");
        driver.findElement(By.xpath("//div[@class='form__group']/child::input[@type='password']")).sendKeys("maazali1234");
        driver.findElement(By.xpath("//div[@class='form__group']/following-sibling::div/child::button[@type='submit']")).click();
        Thread.sleep(2000);
        boolean flag_signin= false;
        try{
            driver.findElement(By.className("form-error__list"));
        }
        catch (Exception e){
            flag_signin= true;
        }
        if (flag_signin ==true) {
            ;
        }

        else {
            driver.findElement(By.linkText("Create a new account")).click();
            driver.findElement(By.xpath("//div[@class='input__group']/child::input[@id='user[last_name]']")).sendKeys("Maaz");
            driver.findElement(By.xpath("//div[@class='input__group']/child::input[@id='user[first_name]']")).sendKeys("Ali");
            driver.findElement(By.xpath("//div[@class='input__group']/parent::div/following-sibling::div/child::input")).sendKeys("maazkid3@gmail.com");
            driver.findElement(By.xpath("//div[@class='input__group']/parent::div/following-sibling::div[2]/child::input")).sendKeys("maazali1234");
            driver.findElement(By.xpath("//div[@class='input__group']/parent::div/following-sibling::div[3]/descendant::input[@type='checkbox']")).click();
            driver.findElement(By.xpath("//div[@class='form__group']/following-sibling::div/child::button")).click();
        }

        Thread.sleep(2000);
        boolean flag_signup= false;
        try{
            driver.findElement(By.className("form-error__list"));
        }
        catch (Exception e){
            flag_signup= true;
        }
        if (flag_signup==true){
            System.out.println("Succesfull login and registration");
            Thread.sleep(3000);


        }
        else {
            System.out.println("Failed to register due to invalid entries!");
            driver.quit();
        }

        driver.quit();
    }
}