import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/edilaibashov/IdeaProjects/Libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(("http:/automationpractice.com"));
        //WebElement Dresses = driver.findElement(By.className("sf-with-ul"));
        //Dresses.click();

        //WebElement a = driver.findElement(By.className("replace-2x"));
        //System.out.println(a.getAttribute("http://automationpractice.com/index.php?id_category=4&amp;controller=category"));
        //a.click();

        //driver.findElement(By.className("sf-with-ul")).click();
        //driver.findElement(By.className("subcategory-image")).click();
        List<WebElement> list = driver.findElements(By.className("sf-with-ul"));
        System.out.println("Size is "+ list.size());
        list.get(3).click();
        List<WebElement> list2 = driver.findElements(By.className("subcategory-image"));
        //System.out.println(list2.size());
        list2.get(1).click();
//        for(WebElement e : list2){
//            System.out.println("Elements amount" +e.getText());
//        }


    }
}