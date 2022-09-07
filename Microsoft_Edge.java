package Selenium_Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Microsoft_Edge {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","C:\\Software\\SoftwareDrivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.co.uk/");
        System.out.println(driver.getTitle());



    }
}
