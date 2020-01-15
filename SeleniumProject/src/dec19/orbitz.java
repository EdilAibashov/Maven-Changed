package dec19;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class orbitz {
    private static WebDriver Threaddriver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/edilaibashov/IdeaProjects/Libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get(("https://www.orbitz.com"));
        driver.findElement(By.xpath("//a[@id='primary-header-travel_blog']")).click();
        String mainWindow = driver.getWindowHandle();
        String blogGUID = driver.getWindowHandle();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='https://www.orbitz.com/app/?mcicid=blog.orbitz.article']")).click();
        Thread.sleep(3000);
        Set<String> allGUI = driver.getWindowHandles();
        for(String gui: allGUI){
            if(!gui.equals(mainWindow))
                driver.switchTo().window(gui);
        }
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
//        driver.close();
        //driver.switchTo().window(mainWindow);
        driver.findElement(By.xpath("//div[@id='partner-add-hotel-container']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='joinUsButtonMasthead']")).click();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Set<String> all = driver.getWindowHandles();
        for(String e: all){
            if (!e.equals(blogGUID))
                driver.switchTo().window(e);
        }




    }
}
