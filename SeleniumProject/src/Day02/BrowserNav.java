package Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNav {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/edilaibashov/IdeaProjects/Libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(("http:/automationpractice.com"));
        //String text =  driver.findElement(By.id("layer_cart")).getText();
        //System.out.println(text);
       // String str = driver.findElement(By.className("submenu-container clearfix first-in-line-xs")).getClass();
        //System.out.println(str);
        //WebElement element = driver.findElement(By.className("login"));
        //element.click();
       // element.clear();
        //System.out.println(element.getAttribute("title"));
 //      WebElement searchBox = driver.findElement(By.id("search_query_top"));
//        searchBox.click();
//        searchBox.sendKeys("shirts");
//        Thread.sleep(2000);
//        WebElement searchButton = driver.findElement(By.name("submit_search"));
//        searchButton.click();

        WebElement Dresses = driver.findElement(By.className("sf-with-ul"));
        Dresses.click();

        WebElement a = driver.findElement(By.className("replace-2x"));
        System.out.println(a.getAttribute("http://automationpractice.com/index.php?id_category=4&amp;controller=category"));

        a.click();
//        String text = driver.findElement(By.id("homefeatured")).getText();
//        System.out.println(text);
//
//        WebElement next = driver.findElement(By.className("bx-next"));
//        element.click();
//        WebElement getsaving = driver.findElement(By.className("img-responsive"));
//        getsaving.click();












//        driver.get("https:/techleadacademy.io");
//        driver.get("https:/google.com");
//        driver.navigate().back();


//        driver.manage().window().fullscreen();
//        driver.manage().window().maximize();
//        driver.navigate().to("https:/techleadacademy.io");


    }
}
