package Selenium_Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox_selenium {
    public static void main(String[] args) {
        //System.setProperty("webdriver.fireFox.driver","C:\\Software\\SoftwareDrivers\\geckodriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\Software\\SoftwareDrivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.infosys.com/");
        System.out.println(driver.getTitle());




    }
}
