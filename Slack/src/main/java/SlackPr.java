import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SlackPr {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/edilaibashov/IdeaProjects/Libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        driver.manage().window().maximize();
        driver.get(("https://slack.com/signin"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("domain")).click();
        driver.findElement(By.id("domain")).sendKeys("tla-antares-workspace");
        driver.findElement(By.xpath("//span[.='Continue']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("edilaibashov@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("aikaEDIL1988");
        Thread.sleep(3000);
        driver.findElement(By.id("signin_btn")).click();
        for (int i = 0; i <= 5;i++) {
            driver.findElement(By.xpath("(//span[.='Selvin Asencio'])[2]")).click();
            WebElement msg = driver.findElement(By.tagName("br"));
            msg.sendKeys("Slack Testing, Don't worry");
            //Thread.sleep(5000);
            driver.findElement(By.className("ql-editor")).sendKeys(Keys.ENTER);

        }
    }
}
