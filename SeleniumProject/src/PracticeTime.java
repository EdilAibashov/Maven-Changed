import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PracticeTime {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/edilaibashov/IdeaProjects/Libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
        driver.manage().window().maximize();
        List<WebElement> list = driver.findElements(By.cssSelector("#index .tab-content"));
        for (WebElement el : list) {
            System.out.println("=============================================");
            System.out.println("Product: " + el.getText());
        }
        List<WebElement> list1 = driver.findElements(By.cssSelector("span.price product-price"));
        for (WebElement el1 : list1) {
            System.out.println("Price: " + el1.getText());
        }
        WebElement element = driver.findElement(By.cssSelector("ul.product_list.grid > li .product-container"));
        element.click();
        WebElement element1 = driver.findElement(By.cssSelector("#quantity_wanted_p input"));
        element1.clear();
        element1.sendKeys("5");
        driver.findElement(By.cssSelector(".box-info-product .exclusive span")).click();
        System.out.println();
        WebElement element3 = driver.findElement(By.cssSelector(".layer_cart_cart"));
        try {
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("===================================");
        System.out.println(element3.getText());
        WebElement element6 = driver.findElement(By.cssSelector(".button.button-medium"));
        element6.click();
        System.out.println("====================================");
        WebElement element7 = driver.findElement(By.cssSelector("td.cart_description"));
        System.out.println(element7.getText());
        System.out.println("====================================");
        WebElement element9 = driver.findElement(By.cssSelector("#cart_summary tfoot"));
        System.out.println(element9.getText());






    }
}
