package Implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//write methods like click or send keys from page object
public class login_imp extends PageObject.login {

    public void enter_username( String username){
        WebElement username_element= Username();
        username_element.sendKeys(username);
    }

    public void enter_password( String password){
        WebElement password_element= Password();
        password_element.sendKeys(password);
    }

    public void click_login(){
        WebElement login_element= login_button();
        login_element.click();
    }

    public boolean check_login_imp(){
        boolean flag= false;
        try{
            WebElement element= check_login();
            flag= true;
        }
        catch (Exception e){
            ;
        }
        return flag;
    }


}
