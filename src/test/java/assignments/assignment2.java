package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.drive","chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        //Radio button
        driver.findElement(By.xpath("/html/body/div/div/fieldset/label[2]/input")).click();
        driver.findElement(By.xpath("/html/body/div/div/fieldset/label[1]/input")).click();
        //Suggestion class example
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/fieldset/input")).sendKeys("Maaz is my name");
        //dropdown
        driver.findElement(By.xpath("/html/body/div/div[3]/fieldset/select/option[2]")).click();
        //checkbox
        driver.findElement(By.xpath("/html/body/div/div[4]/fieldset/label[1]/input")).click();
        driver.findElement(By.xpath("/html/body/div/div[4]/fieldset/label[2]/input")).click();
        //element displayed example
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/fieldset[1]/input[1]")).click();


        //Now using relative xpath
        Thread.sleep(500);
        driver.navigate().refresh();
        //Radio button
        driver.findElement(By.xpath("//input[@value=\"radio3\" and @name=\"radioButton\"]")).click();
        driver.findElement(By.xpath("//label[2]/input[@class=\"radioButton\"]")).click();
        //Suggestion class example
        driver.findElement(By.xpath("//input[@id=\"autocomplete\"]")).sendKeys(". Hi");
        //dropdown
        driver.findElement(By.xpath("//fieldset/*/option[@value=\"option1\"]")).click();
        //checkbox
        driver.findElement(By.xpath("//fieldset/*/input[@id=\"checkBoxOption1\"]")).click();
        driver.findElement(By.xpath("//fieldset/*/input[@id=\"checkBoxOption2\"]")).click();
        //mouse hover
        driver.findElement(By.xpath("//fieldset/input[@id=\"hide-textbox\"]")).click();

        Thread.sleep(500);
        driver.quit();


    }
}
