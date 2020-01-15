package dayDec15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/edilaibashov/IdeaProjects/Libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(("http:/practiceselenium.com"));
        WebElement menu = driver.findElement(By.xpath("//div[@id='wsb-element-00000000-0000-0000-0000-000450914915']"));
        System.out.println(menu.getText());
        Thread.sleep(500);
        WebElement passion = driver.findElement(By.xpath("//ul[@class='wsb-navigation-rendered-top-level-menu ']//a[text()='Our Passion']"));
        passion.click();
        System.out.println("======================================");
        WebElement text = driver.findElement(By.xpath("//div[@id='wsb-element-00000000-0000-0000-0000-000450914902']"));
        System.out.println(text.getText());
        WebElement cli = driver.findElement(By.xpath("//li//a[@href='menu.html']"));
        cli.click();
        System.out.println("============ Green Tea ============");
        WebElement tea = driver.findElement(By.xpath("//div[@id='wsb-element-00000000-0000-0000-0000-000453230000']"));
        System.out.println(tea.getText());
        System.out.println("============ Red Tea ===============");
        WebElement tea1 = driver.findElement(By.xpath("//div[@id='wsb-element-00000000-0000-0000-0000-000453231072']"));
        System.out.println(tea1.getText());
        System.out.println("============= Oolong Tea ===========");
        WebElement tea2 = driver.findElement(By.xpath("//div[@id='wsb-element-00000000-0000-0000-0000-000453231735']"));
        System.out.println(tea2.getText());
        Thread.sleep(500);
        WebElement tea3 = driver.findElement(By.xpath("//div[@id='wsb-element-00000000-0000-0000-0000-000451955160']"));
        tea3.click();
        WebElement email = driver.findElement(By.xpath("//div[@class='controls']//input[@type='text']"));
        email.sendKeys("edieaibashov@gmail.com");
        WebElement name = driver.findElement(By.xpath("//div[@class='controls']//input[@id='name']"));
        name.sendKeys("Edil");
        WebElement text1 = driver.findElement(By.xpath("//div[@class='controls']//textarea[@id='address']"));
        text1.sendKeys("9010 main Avenue");
        WebElement card = driver.findElement(By.xpath("//div[@class='controls']//select[@id='card_type']"));
        card.click();
        WebElement visa = driver.findElement(By.xpath("//div[@class='controls']//select[@id='card_type']//option[text()='Visa']"));
        visa.click();
        WebElement number = driver.findElement(By.xpath("//div[@class='controls']//input[@id='card_number']"));
        number.sendKeys("1234567890987654");
        WebElement name1 = driver.findElement(By.xpath("//div[@class='controls']//input[@id='cardholder_name']"));
        name1.sendKeys("Edil Bashov");
        WebElement code = driver.findElement(By.xpath("//div[@class='controls']//input[@id='verification_code']"));
        code.sendKeys("998800446675");
        Thread.sleep(1000);
        WebElement code2 = driver.findElement(By.xpath("//div[@class='form-actions']//button[@class='btn btn-primary']"));
        code2.click();
    }
}
