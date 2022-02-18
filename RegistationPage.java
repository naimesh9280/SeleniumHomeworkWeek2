package HomeworkWeek2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.*;

public class RegistationPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup(); // using bonigracia
        WebDriver driver = new ChromeDriver(); // instance
        driver.get("https://demo.nopcommerce.com/"); // navigate to website
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("naimesh9280@yahoo.co.in");
        driver.findElement(By.name("LastName")).sendKeys("naim1234");
        Thread.sleep(3000);
        WebElement day =driver.findElement(By.name("DateOfBirthDay"));
        WebElement month =driver.findElement(By.name("DateOfBirthMonth"));
        WebElement Year =driver.findElement(By.name("DateOfBirthYear"));
        Select select = new Select(day);
        select.selectByIndex(29);
        Select select1 = new Select(month);
        select1.selectByValue("8");
        Select select2 = new Select(Year);
        select2.selectByValue("1982");
        driver.findElement(By.id("Email")).sendKeys("naimesh9280@yahoo.co.in");
        driver.findElement(By.name("Company")).sendKeys("Testing Software");
        driver.findElement(By.id("Password")).sendKeys("naim1234");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("naim1234");
        driver.findElement(By.className("register-next-step-button")).click();

        driver.close();





    }

}
