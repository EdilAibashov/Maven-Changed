package day_dec22;

import dec19.my_libs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WarmUp {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "/Users/edilaibashov/IdeaProjects/Libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(("https://etsy.com"));
        WebElement click = driver.findElement(By.xpath("//nav[@aria-label='Main navigation']//span[@class='etsy-icon']"));
        WebElement tool = driver.findElement(By.xpath("//span[@id='ge-tooltip-label-cart']"));
        System.out.println("Pre: "+tool.getText());
        Actions action = new  Actions(driver);
        my_libs.Wait(2000);
        action.moveToElement(click).perform();
        my_libs.Wait(2000);
        System.out.println("After: "+tool.getText());


    }
}
