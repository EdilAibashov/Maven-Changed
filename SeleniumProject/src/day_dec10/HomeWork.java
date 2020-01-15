package day_dec10;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import javax.swing.*;
//import java.util.List;
//
//public class HomeWork {
//    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "/Users/edilaibashov/IdeaProjects/Libraries/Drivers/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        //Actions action = new Actions(driver);
//        driver.manage().window().maximize();
//        driver.get(("http:/automationpractice.com"));
//        Thread.sleep(1000);
//        WebElement specials = driver.findElement(By.xpath("//section[@id='block_various_links_footer']//li[@class='item'][1]//a[@title='Specials']"));
//        specials.click();
//        System.out.println("========================================");
//        List<WebElement> product1 = driver.findElements(By.xpath("//div[@class='product-content']/descendant::a[@class='product-name']"));
//        List<WebElement> product2 = driver.findElements(By.xpath("//div[@id='best-sellers_block_right']//div[@class='price-box']"));
//        System.out.println(product1.size()+" "+product2.size());
//        for (int i = 0; i < product2.size(); i++) {
//            System.out.println(product1.get(i).getText()+" "+product2.get(i).getText());
//        }
//        WebElement best = driver.findElement(By.xpath("//div[@class='lnk']//a[@title='All best sellers']"));
//        Thread.sleep(500);
//        best.click();
//        System.out.println("================== Best Sellers ==================");
//        List<WebElement> name = driver.findElements(By.xpath("//div[@class='product-content']/descendant::a[@class='product-name']"));
//        List<WebElement> price = driver.findElements(By.xpath("//div[@id='best-sellers_block_right']//div[@class='price-box']"));
//        System.out.println(name.size()+" "+price.size());
//        Thread.sleep(1000);
//        for (int k = 0;k < price.size(); k++) {
//            System.out.println(name.get(k).getText()+" "+price.get(k).getText());
//        }
//        System.out.println("=====================================");
//        List<WebElement> container = driver.findElements(By.xpath("//span[starts-with(@class,'availability')]"));
//        int i = 1;
//        for (WebElement cl : container) {
//            cl.click();
//            Thread.sleep(1500);
//            driver.findElement(By.xpath("(//a[@class='button ajax_add_to_cart_button btn btn-default'])[" + i + "]")).click();
//            i++;
//            Thread.sleep(1500);
//            driver.findElement(By.xpath("//span[@class='continue btn btn-default button exclusive-medium']")).click();
//            Thread.sleep(1000);
//        }
//
//        driver.findElement(By.xpath("//div[@class='shopping_cart']//a[@title='View my shopping cart']")).click();
//        Thread.sleep(1000);
//        List<WebElement> list = driver.findElements(By.xpath("//td[@class='cart_description']"));
//        System.out.println("=============== Dress =============");
//        for (WebElement ls : list) {
//            if (ls.getText().contains("Dress")) {
//                System.out.println("Dress : " + ls.getText());
//            }
//
//        }
//        System.out.println("=============== Yellow ==============");
//        for (WebElement s : list) {
//            if (s.getText().contains("Yellow")) {
//                System.out.println("Yellows : " + s.getText());
//            }
//        }
//        driver.quit();
//    }
