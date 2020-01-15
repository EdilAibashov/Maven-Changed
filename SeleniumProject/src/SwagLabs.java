import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class SwagLabs {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        /*

         */
        WebElement element = driver.findElement(By.className("main-body")); // Getting the list of usernames.
        WebElement searchBox = driver.findElement(By.id("user-name"));

        System.setProperty("webdriver.chrome.driver", "/Users/edilaibashov/IdeaProjects/Libraries/Drivers/chromedriver");
        driver.manage().window().maximize();
        driver.get(("https://www.saucedemo.com/"));  //Getting the web page
//        System.out.println("============= Print out main text =============");
        System.out.println("Title: "+ driver.getTitle());
//        System.out.println("=========== Print out all Accepted usernames list =======");

        System.out.println(element.getText()); // Printing the list of usernames.

        searchBox.click();
        searchBox.sendKeys("standard_user"); // Loging in.
        WebElement searchBox1 = driver.findElement(By.id("password"));
        searchBox1.click();
        searchBox1.sendKeys("secret_sauce");
        WebElement searchBox2 = driver.findElement(By.className("btn_action"));// Click Login Button
        searchBox2.click();
        System.out.println("=============== List of Purchases ===================");
        WebElement element02 = driver.findElement(By.className("inventory_container"));
        System.out.println(element02.getText());
       //                 "=============== first item to open ==================");
        WebElement ChooseItem = driver.findElement(By.className("inventory_item_img"));
        ChooseItem.click();
        System.out.println("=============== Chosen Item's Information ==================");
        WebElement element4 = driver.findElement(By.className("inventory_details_name"));
        System.out.println(element4.getText());
        WebElement element5 = driver.findElement(By.className("inventory_details_desc"));
        System.out.println(element5.getText());
        WebElement element6 = driver.findElement(By.className("inventory_details_price"));
        System.out.println(element6.getText());
        driver.close();


        }






    }
