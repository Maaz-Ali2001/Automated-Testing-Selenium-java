package assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class assign4_driver extends assign4_functions{

    WebDriver driver;
    assign4_functions obj=  new assign4_functions();


    @BeforeClass
    public WebDriver launchdriver(){
        driver= obj.launchdriver();
        return driver;
    }


    boolean flag_sign;
    @Test (priority = 1)
    public void input_login() throws InterruptedException {
        flag_sign= obj.input_login(driver);

    }


    @Test(priority = 2)
    public void input_register() throws InterruptedException {
        obj.input_register(driver,flag_sign);
    }

    @Test(priority = 3)
    public void register() throws InterruptedException {
        obj.register(driver,flag_sign);
    }

    @AfterClass
    public void quit() throws InterruptedException {
        obj.quit(driver);

    }
}
