package comnopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserNopCommerceFireFox {
    //declaring global variable
    static String browser = "Firefox";
    static String baseUrl ="https://demo.nopcommerce.com/login?returnUrl=%2";
    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong Browser name");
        }
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println(driver.getTitle());

        driver.getCurrentUrl();
        System.out.println(" Current URL :" + driver.getCurrentUrl());
        //Finding Get page source
        System.out.println("Page source :" + driver.getPageSource());
        //Find the element Login link element data type is return type hence WebElement
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        //Click on login link element
        loginLink.click();

        //Find eEmail field Element
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("prime123@gmail.com");

        //Enter the Password Field Element and Type the password
        driver.findElement(By.name("Password")).sendKeys("Prime123");

        driver.close();
    }

}
