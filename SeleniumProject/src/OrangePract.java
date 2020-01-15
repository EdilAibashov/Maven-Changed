import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.List;

public class OrangePract {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "/Users/edilaibashov/IdeaProjects/Libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(("https://orangehrm-demo-6x.orangehrmlive.com/client/#/dashboard"));
        driver.findElement(By.xpath("//button[@class='btn btn-primary dropdown-toggle']")).click();
        driver.findElement(By.xpath("//li/a[@data-username='kevin']")).click();
        driver.findElement(By.xpath("//a[@class='collapsible-header waves-effect waves-orange']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li//a[@id='dropDownLeaveTrigger']")).click();
        Thread.sleep(5000);
        //driver.findElements(By.xpath("//a//p[@class='pending-timesheet-title truncate']"));
        driver.findElement(By.xpath("//a//p[@class='pending-timesheet-title truncate']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//div[@class='btn']")).click();
        String s = driver.getWindowHandle();
        Thread.sleep(2000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ESCAPE);
        driver.switchTo().window(s);
        Thread.sleep(5000);
        robot.keyPress(KeyEvent.VK_ESCAPE);
    }
}