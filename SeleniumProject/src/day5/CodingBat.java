package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CodingBat {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/edilaibashov/IdeaProjects/Libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://codingbat.com/java/String-1?message=Failed+to+login+--+bad+username+or+password");

        WebElement el = driver.findElement(By.name("uname"));

        //el.click();
        Thread.sleep(2000);
        el.sendKeys("edieaibashov@gmail.com");
        WebElement pw = driver.findElement(By.name("pw"));
        pw.sendKeys("aikaAMAN1988");
        WebElement lock = driver.findElement(By.name("dologin"));
        lock.click();
        List<WebElement> cl = driver.findElements(By.cssSelector("a[href*='/doc/java']"));
        for(WebElement c : cl){
            System.out.println(c.getText());

        }
    }
}
