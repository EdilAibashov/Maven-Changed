import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class day03 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/edilaibashov/IdeaProjects/Libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(("https://www.amazon.com"));

//        WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
//        element.sendKeys("Selenium Automation books");
//
//
//        WebElement element1 = driver.findElement(By.className("nav-input"));
 //       element1.click();
//
//        WebElement element3 = driver.findElement(By.cssSelector("span[class='a-size-medium a-color-base a-text-normal']"));
//
//        System.out.println(element3.getText());
//
//        WebElement element2 = driver.findElement(By.className("a-price"));
//
//        System.out.println(element2.getText());

        driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Selenium Automation books");
        driver.findElement(By.cssSelector("input.nav-input[type=submit]")).click();

        List<WebElement>list = driver.findElements(By.cssSelector("span[class='a-size-medium a-color-base a-text-normal']"));
        for(WebElement element : list){
            System.out.println(element.getText());


        }
        List<WebElement>list1 = driver.findElements(By.cssSelector("span.a-price-whole"));
        for(WebElement e : list1) {
            System.out.println(e.getText());



        }


    }
}
