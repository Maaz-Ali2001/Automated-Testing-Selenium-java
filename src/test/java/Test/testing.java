package Test;
import Implementation.login_imp;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testing extends Implementation.login_imp{
    static login_imp actions= new login_imp();

    boolean sign_in_check;

    @Test (priority = 1)
    public void login_without_username(){
        actions.enter_password("admin123");
        actions.click_login();
        sign_in_check= actions.check_login_imp();
        System.out.println("without username");

    }

    @Test (priority = 2)
    public void login_without_password(){
        if (Boolean.FALSE.equals(sign_in_check)){
        actions.enter_username("Admin");
        actions.click_login();
        sign_in_check= actions.check_login_imp();
        System.out.println("without password");
        }
    }
    @Test (priority = 3)
    public void login_incorrect(){
        if (Boolean.FALSE.equals(sign_in_check)){
            actions.enter_username("Admin32");
            actions.enter_password("admin12322");
            actions.click_login();
            sign_in_check= actions.check_login_imp();
            System.out.println("login incorrect");
        }
    }

    @Test (priority = 4)
    public void login_correct(){
        if (Boolean.FALSE.equals(sign_in_check)){
            actions.enter_username("Admin");
            actions.enter_password("admin123");
            actions.click_login();
            sign_in_check= actions.check_login_imp();
            System.out.println("login correct"+ sign_in_check);
        }
    }
}
