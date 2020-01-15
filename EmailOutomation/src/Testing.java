import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Testing {
    public static ArrayList<String> list = new ArrayList<>();
    public static String pageTitle = "";
    public static String compose = "";
    public static String email = "";
    public static String subject = "";
    public static String content = "";

    void TestingEmail() throws FileNotFoundException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/edilaibashov/IdeaProjects/Libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        //Actions action = new Actions(driver);
        driver.manage().window().maximize();
        driver.get(("https://hotmail.com"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@class='internal sign-in-link'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='i0116']")).sendKeys("pendejo6690@outlook.com");
        driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
        driver.findElement(By.xpath("//input[@id='i0118']")).sendKeys("aika1988");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
        Thread.sleep(2000);
        WebElement pageTitleP = driver.findElement(By.xpath("//div[@id='owaBranding_container']"));
        System.out.println(pageTitleP.getText());
        pageTitle = pageTitleP.getText();
        WebElement composeP = driver.findElement(By.xpath("//span[@id='id__3']"));
        System.out.println(composeP.getText());
        compose = composeP.getText();
        Scanner sc = new Scanner(new File("/Users/edilaibashov/Desktop/ProjectDay.txt"));
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            int split = str.indexOf("|");
            list.add(str.substring(0, split));
            str = str.substring(split + 1);
            split = str.indexOf("|");
            list.add(str.substring(0, split));
            list.add(str.substring(split + 1));
            list.add(sc.nextLine());
        }
        int m = 0;
        for (int i = 1; i < list.size(); i++) {
            email = list.get(0);
            subject = list.get(1);
            content = list.get(2);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[@id='id__3']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@class='ms-BasePicker-input pickerInput_ecad0f63']")).sendKeys(email);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//div[@id='sug-0']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id='subjectLine" + m + "']")).sendKeys(subject);
            m++;
            driver.findElement(By.xpath("//div[@role='textbox']")).click();
            driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys(content);
            driver.findElement(By.xpath("//button[@title='Send (⌘+Enter)']")).click();
            driver.findElement(By.xpath("(//i[@data-icon-name='Send'])[2]")).click();
            driver.findElement(By.xpath("(//i[@data-icon-name='Send'])[2]")).click();
        }
    }
}