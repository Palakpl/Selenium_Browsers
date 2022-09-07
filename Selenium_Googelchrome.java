package Selenium_Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Googelchrome {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Software\\SoftwareDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/");

        System.out.println(driver.getTitle());
    }
}
