package Day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Class2 {
    public static void main(String[] args) throws Throwable {
        System.setProperty("webdriver.chrome.driver","/Users/edilaibashov/IdeaProjects/Libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https:/techleadacademy.io");
        Thread.sleep(2000);
        //driver.close();
        //driver.quit();
        driver.get("https:/mashable.com");
        System.out.println("Title: "+driver.getTitle());
        System.out.println("Url "+driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.get("https:/wikipedia.io");

        System.out.println("Title: "+driver.getTitle());
        System.out.println("Url "+driver.getPageSource());

        System.out.println("Page source "+driver.getPageSource());






























        //        System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
//        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"logs.txt");
//        System.setProperty("webdriver.gecko.driver","/Users/edilaibashov/IdeaProjects/Libraries/Drivers/geckodriver");
//        WebDriver driver = new FirefoxDriver();
//        driver.get("https:/google.com");
//        System.out.println("Title: "+ driver.getTitle());
//        System.out.println("URL "+ driver.getCurrentUrl());



    }
}
