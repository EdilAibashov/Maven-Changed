package Day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeG {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/edilaibashov/IdeaProjects/Libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        Thread.sleep(200);
        WebElement earth = driver.findElement(By.xpath("//input[@name='q']"));

        earth.sendKeys("Chat Room");
        Thread.sleep(500);

        WebElement search = driver.findElement(By.xpath("//div[@class='tfB0Bf']//input[@class='gNO89b']"));
        search.click();

        WebElement wiki = driver.findElement(By.xpath("//div[@id='search']"));
        System.out.println(wiki.getText());
    }
}
