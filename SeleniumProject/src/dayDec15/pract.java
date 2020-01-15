package dayDec15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class pract {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/edilaibashov/IdeaProjects/Libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(("https://orangehrm-demo-6x.orangehrmlive.com/client/#/dashboard"));
        driver.findElement(By.xpath("//button[@class='btn btn-primary dropdown-toggle']")).click();
        driver.findElement(By.xpath("//li/a[@data-username='kevin']")).click();
        driver.findElement(By.xpath("//a[@class='collapsible-header waves-effect waves-orange']")).click();
       System.out.println("=============== Vacation List ================");
       Thread.sleep(3000);
        driver.findElement(By.xpath("//li//a[@id='dropDownLeaveTrigger']")).click();
        Thread.sleep(5000);
        List<WebElement> employees = driver.findElements(By.xpath("//a//p[@class='pending-timesheet-title truncate']"));
        int i = 1;
        for(WebElement e : employees){
            System.out.println(i+" : "+e.getText());
            i++;
        }
        driver.findElement(By.xpath("//a//p[@class='pending-timesheet-title truncate']")).click();
        Thread.sleep(6000);
        System.out.println("=================================================================");
        System.out.println("Employee name: "+driver.findElement(By.xpath("//span[@style='padding-left: 5px']")).getText()+" | "+"Date: "+driver.findElement(By.xpath("//ng-include[@src='template']//span[text()='2019-11-11'][1]")).getText()+" | "+"Leave type: "+driver.findElement(By.xpath("//span[text()='Vacation Leave - US']")).getText());
        System.out.println("Employee name: "+driver.findElement(By.xpath("//span[@style='padding-left: 5px']")).getText()+" | "+"Date: "+driver.findElement(By.xpath("//span[text()='2019-12-11'][1]")).getText()+" | "+"Leave type: "+driver.findElement(By.xpath("//span[text()='Vacation Leave - US']")).getText());
        Thread.sleep(1000);
        driver.navigate().back();
        driver.findElement(By.xpath("//li//a[@id='dropDownLeaveTrigger']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//p[text()='Brody Alan'][1]")).click();
        Thread.sleep(5000);
        System.out.println("======================================================================");
        System.out.println("Employee name: "+driver.findElement(By.xpath("//span[text()='Brody Alan']")).getText()+" | "+"Date: "+driver.findElement(By.xpath("//span[text()='2019-14-11'][1]")).getText()+" | "+"Leave type: "+driver.findElement(By.xpath("//span[text()='Work From Home - US'][1]")).getText());
        driver.navigate().back();
        driver.findElement(By.xpath("//li//a[@id='dropDownLeaveTrigger']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[text()='Kevin Mathews'][1]")).click();
        Thread.sleep(2000);
        System.out.println("======================================================================");
        System.out.println("Employee name: "+driver.findElement(By.xpath("//h4//span[text()='Kevin Mathews']")).getText()+" | "+"Date: "+driver.findElement(By.xpath("//td//span[text()='2019-19-11'][1]")).getText()+" | "+"Leave type: "+driver.findElement(By.xpath("//tr//td//span[text()='Vacation Leave - US'][1]")).getText());
        System.out.println(driver.findElement(By.xpath("//tr[@ng-repeat='obj in objs track by list.itemTracker(obj, listData.idGetter)'][2]")).getText());
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.xpath("//li//a[@id='dropDownLeaveTrigger']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@class='collection-item avatar'][4]//a//img")).click();
        Thread.sleep(2000);
        System.out.println("======================================================================");
        System.out.println("Employee name: "+driver.findElement(By.xpath("//h4//span[text()='Kevin Mathews']")).getText());
        System.out.println(driver.findElement(By.xpath("//tr[@ng-repeat='obj in objs track by list.itemTracker(obj, listData.idGetter)'][1]")).getText());
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.xpath("//li//a[@id='dropDownLeaveTrigger']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@class='collection-item avatar'][5]")).click();
        Thread.sleep(2000);
        System.out.println("=======================================================================");
        System.out.println("Employee name: "+driver.findElement(By.xpath("//div[@id='searchLeaveEntitlementDiv']")).getText());
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.xpath("//li//a[@id='dropDownLeaveTrigger']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@class='collection-item avatar'][6]")).click();
        System.out.println("======================================================================");
        Thread.sleep(2000);
        System.out.println("Employee name: "+driver.findElement(By.xpath("//span[@class='valign']")).getText());
        System.out.println(driver.findElement(By.xpath("//div[@ng-if='listData.permission.read']")).getText());
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.xpath("//li//a[@id='dropDownLeaveTrigger']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"pending-leave-collection\"]/li[7]/a/p[1]")).click();
        Thread.sleep(2000);
        System.out.println("========================================================================");
        System.out.println("Employee name: "+driver.findElement(By.xpath("//span[@style='padding-left: 5px']")).getText());
        System.out.println(driver.findElement(By.xpath("//list//table[@class='highlight bordered']")).getText());
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.xpath("//li//a[@id='dropDownLeaveTrigger']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"pending-leave-collection\"]/li[8]/a/p[1]")).click();
        Thread.sleep(2000);
        System.out.println("Employee name: "+driver.findElement(By.xpath("//span[@style='padding-left: 5px']")).getText());
        System.out.println(driver.findElement(By.xpath("//div[@ng-if='listData.permission.read']")).getText());
        Thread.sleep(2000);
        driver.navigate().back();
        driver.quit();
    }
           }


