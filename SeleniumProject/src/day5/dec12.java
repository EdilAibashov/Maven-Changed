package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class dec12 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/edilaibashov/IdeaProjects/Libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com");

        WebElement info = driver.findElement(By.xpath("//section[@id='block_contact_infos']"));
        System.out.println("Information : "+info.getText());
        System.out.println("=========================================");
        WebElement info1 = driver.findElement(By.xpath("//ul[@class='toggle-footer']"));
        System.out.println("Information : "+info1.getText());

    }
}
