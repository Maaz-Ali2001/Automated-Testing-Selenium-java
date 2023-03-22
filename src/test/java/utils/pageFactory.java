package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class pageFactory extends propertyReader{
    String url= getConfigValue("url");
    //WebDriver driver;

    public WebDriver launchdriver(){
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.drive","google_chrome/chromedriver.exe");
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver= new ChromeDriver(options);
        driver.navigate().to(url);
        driver.manage().window().maximize();
        return driver;
    }
}


