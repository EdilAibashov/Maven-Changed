package dec19;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/edilaibashov/IdeaProjects/Libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        my_libs.Wait(2000);
        driver.findElement(By.xpath("//button[@id='alertBox']")).click();
        driver.switchTo().alert();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        my_libs.Wait(2000);
        alert.accept();
        driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
        driver.switchTo().alert();
        System.out.println(alert.getText());
        my_libs.Wait(2000);
        alert.accept();
        driver.findElement(By.xpath("//button[@id='promptBox']")).click();
        driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("Testing!!!!!!");
        my_libs.Wait(2000);



    }
}
