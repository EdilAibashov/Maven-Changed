import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Day3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/edilaibashov/IdeaProjects/Libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/maps");

        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Osh, Kyrgyzstan");

        driver.findElement(By.id("searchbox-searchbutton")).click();

        driver.findElement(By.xpath("(//div[@class='b7bAA58T9bH__shade'])[1]")).click();




            //driver.findElement(By.className("b7bAA58T9bH__shade")).click();
            WebElement element11 = driver.findElement(By.className("section-facts-description-link"));
            System.out.println(element.getText());
//        driver.findElement(By.className("section-facts-description"));


//        driver.findElements(By.className("S3Uucc"));
//
//        List<WebElement> list = driver.findElements(By.className("S3Uucc"));
//        System.out.println(list.size());
//
//        System.out.println(list);
//        for(WebElement e : list){
//            System.out.println(e.getText());
//        }
//        list.get(6).click();

        }
    }

