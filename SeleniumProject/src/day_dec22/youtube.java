package day_dec22;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
public class youtube {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/edilaibashov/IdeaProjects/Libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(("https://weather.com"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.getWindowHandle();
        String window = driver.getWindowHandle();
        System.out.println(driver.findElement(By.xpath("//p[@class='styles__mainParagraph__RcoJR']")).getText());
        driver.findElement(By.xpath("//span[@class='icon icon-font iconset-ui icon-close']")).click();
        WebElement facebook = driver.findElement(By.xpath("//span[@classname='icon icon-font iconset-social icon-facebook1']"));
        facebook.click();
        WebElement twitter = driver.findElement(By.xpath("//span[@classname='icon icon-font iconset-social icon-twitter']"));
        twitter.click();
        WebElement google = driver.findElement(By.xpath("//span[@class='icon icon-font iconset-social icon-google-plus']"));
        google.click();
        Set<String> allGUI11 = driver.getWindowHandles();
        for (String gui1 : allGUI11) {
            if (!gui1.equals(window)) {
                driver.switchTo().window(gui1);
                System.out.println(driver.getTitle());
                System.out.println(driver.getCurrentUrl());
                driver.close();
            }
        }
        driver.switchTo().window(window);
        driver.findElement(By.xpath("//a[@data-from-string='localsuiteNav_4_10 Day']")).click();
        List<WebElement> Day = driver.findElements(By.xpath("//td[@class='twc-sticky-col']"));
        List<WebElement> desc = driver.findElements(By.xpath("//td[@class='description']"));
        List<WebElement> temp = driver.findElements(By.xpath("//td[@class='temp']"));
        List<WebElement> precip = driver.findElements(By.xpath("//td[@class='precip']"));
        List<WebElement> wind = driver.findElements(By.xpath("//td[@class='wind']"));
        List<WebElement> humidity = driver.findElements(By.xpath("//td[@class='humidity']"));
        System.out.println("============ weather for 10 days ============");
        for (int i = 0; i < desc.size(); i++) {
            System.out.println(Day.get(i).getText()+" | "+desc.get(i).getText()+" | "+temp.get(i).getText()+" | "+precip.get(i).getText()+" | "+wind.get(i).getText()+" | "+humidity.get(i).getText());
        }
    }
}
