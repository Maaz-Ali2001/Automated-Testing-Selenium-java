package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//write elemets xpath
public class login extends utils.pageFactory{
    WebDriver driver= launchdriver();
    //WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions);


    public WebElement Username(){
        //WebElement element= driver.findElement(By.xpath("(//div[@class='oxd-form-row']/descendant::input)[1]"));
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        By element_by = (By.xpath("(//div[@class='oxd-form-row']/descendant::input)[1]"));
        WebElement element= wait.until(ExpectedConditions.presenceOfElementLocated(element_by));
        return element;
    }

    public WebElement Password(){
        //WebElement element= driver.findElement(By.xpath("(//div[@class='oxd-form-row']/descendant::input)[2]"));
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        By element_by = (By.xpath("(//div[@class='oxd-form-row']/descendant::input)[2]"));
        WebElement element= wait.until(ExpectedConditions.presenceOfElementLocated(element_by));
        return element;
    }

    public WebElement login_button(){
        //WebElement element= driver.findElement(By.className("orangehrm-login-button"));
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        By element_by = (By.className("orangehrm-login-button"));
        WebElement element= wait.until(ExpectedConditions.presenceOfElementLocated(element_by));
        return element;
    }

    public WebElement check_login(){
        //WebElement element= driver.findElement(By.className("oxd-topbar-header-breadcrumb-module"));
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        By element_by = (By.className("oxd-topbar-header-breadcrumb-module"));
        WebElement element= wait.until(ExpectedConditions.presenceOfElementLocated(element_by));
        return element;
    }
}

