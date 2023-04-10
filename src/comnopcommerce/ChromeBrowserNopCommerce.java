package comnopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserNopCommerce {
    public static void main(String[] args) {
        //String Variable called baseUrl
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";
        //Creating instance of the Class and assigns to driver variable to launch chrome browser
        WebDriver driver = new ChromeDriver();
        // Open URL using get method
        driver.get(baseUrl);
        // When browser opens it will be to fit the screen maximise
        driver.manage().window().maximize();
        // Get the Title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //Giving command to driver to wait till page is loaded
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //To open current URL
        driver.getCurrentUrl();
        System.out.println(" Current URL :" + driver.getCurrentUrl());
        System.out.println(" Page Source :" + driver.getPageSource());
        // WebElement mentioned below it will find Login link element on page and return
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        //login method below will click on login link element
        loginLink.click();

        //Locating Email field and placing email id in field
         WebElement emailField = driver.findElement(By.id("Email"));
         emailField.sendKeys("Abc@gmail.com");

        //driver.findElement(By.name("Email")).sendKeys("Abc@Gmail.com");
        //Method above is same as one below we can use one method to do two jobs in one step
        //Instead of two method above, done in one finding Password element and placing password in the field
        driver.findElement(By.name("Password")).sendKeys("A1B2c3");
        //closing browser
        //driver.close();
    }
}
