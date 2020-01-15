package PHPTRAVELS;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
public class PHP {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/edilaibashov/IdeaProjects/Libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(("https://www.phptravels.net"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions builder = new Actions(driver);
        List<WebElement> city = driver.findElements(By.xpath("//p[@class='location go-text-right']"));
        List<WebElement> tour = driver.findElements(By.xpath("//h5[@class='mb-0 RTL']"));
        List<WebElement> days = driver.findElements(By.xpath("//span[@class='item-expire']"));
        List<WebElement> prices = driver.findElements(By.xpath("//figcaption[@class='content']//span//span"));
        String mainWindow = driver.getWindowHandle();
        for (int i = 0; i < days.size(); i++) {
            System.out.println(city.get(i).getText() + " | " + tour.get(i).getText() + " | " + days.get(i).getText() + " | " + prices.get(i).getText());
        }
        WebElement youtube = driver.findElement(By.xpath("//i[@class='fab fa-youtube']"));
        builder.moveToElement(youtube).click(youtube).perform();
        Set<String> allGUI = driver.getWindowHandles();
        for (String gui : allGUI) {
            if (!gui.equals(mainWindow))
                driver.switchTo().window(gui);
        }
        System.out.println("============ youtube titles ============");
        System.out.println(driver.getTitle());
        driver.switchTo().window(mainWindow);
        driver.findElement(By.xpath("//i[@class='fab fa-whatsapp']")).click();
        Set<String> allGUI1 = driver.getWindowHandles();
        for (String gui1 : allGUI1) {
            if (!gui1.equals(mainWindow))
                driver.switchTo().window(gui1);
        }
        System.out.println("============ whatsapp titles ============");
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.switchTo().window(mainWindow);
        driver.findElement(By.xpath("//i[@class='fab fa-instagram']")).click();
        Set<String> allGUI2 = driver.getWindowHandles();
        for (String gui2 : allGUI2) {
            if (!gui2.equals(mainWindow))
                driver.switchTo().window(gui2);
        }
        System.out.println("==========instagram title ==========");
        System.out.println(driver.getTitle());
        System.out.println("========== followers ===========");
        System.out.println();
        List<WebElement> follow = driver.findElements(By.xpath("//a[@class='-nal3 ']"));
        for (WebElement f : follow) {
            System.out.println(f.getText());
        }
        driver.close();
        driver.switchTo().window(mainWindow);
        Thread.sleep(5000);
//        driver.switchTo().frame(driver.findElement(By.id("chat-widget")));
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("(//div[@class='lc-eoed9h'])[2]")).click();
//        driver.switchTo().defaultContent();
//        WebElement chat = driver.findElement(By.xpath("//div[@id='livechat-eye-catcher-img']"));
//        builder.moveToElement(chat).perform();
//        driver.findElement(By.xpath("//div[text()='×']")).click();
        WebElement fly = driver.findElement(By.xpath("//a[@data-name='flights']"));
        builder.moveToElement(fly).click(fly).perform();
        driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]")).click();
        driver.findElement(By.xpath("//div[@class='form-icon-left flightclass']")).click();
        driver.findElement(By.xpath("//li[text()='First']")).click();
        driver.findElement(By.xpath("(//span[@class='select2-chosen'])[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='form-icon-left typeahead__container'])[2]/div/a")).sendKeys("wash");
        driver.findElement(By.xpath("(//div[@class='select2-result-label'])[2]")).click();
        driver.findElement(By.xpath("(//div[@class='form-icon-left typeahead__container'])[3]")).click();
        WebElement las = driver.findElement(By.xpath("(//div[@class='form-icon-left typeahead__container'])[3]"));
        builder.moveToElement(las).sendKeys("las").perform();
        driver.findElement(By.xpath("//button[@onclick='cookyGotItBtn()']")).click();
        driver.findElement(By.xpath("(//div[@class='select2-result-label'])[1]")).click();
        driver.findElement(By.xpath("//input[@id='FlightsDateStart']")).click();
        driver.findElement(By.xpath("(//div[@data-action='next'])[7]")).click();
        driver.findElement(By.xpath("//div[@class='datepicker--cell datepicker--cell-day'][@data-date='1'][@data-month='0']")).click();
        driver.findElement(By.xpath("(//div[@class='datepicker--cell datepicker--cell-day'][@data-date='9'][@data-month='0'][@data-year='2020'])[2]")).click();
        WebElement plus = driver.findElement(By.xpath("(//button[text()='+'])[3]"));
        for (int i = 1; i <= 19; i++) {
            plus.click();
        }
        driver.findElement(By.xpath("//div[@class='col-xs-12 col-md-1']//button")).click();
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='theme-search-results-item-preview']"));
        System.out.println("=================================================");
        System.out.println("There is : " + list.size() + " available flights");
        for(WebElement e: list){
            //System.out.println(e.getText());
        }
        Map<String, Integer> stopList = new HashMap<>();
        Map<String, Integer> durationList = new HashMap<>();
        Map<String, Integer> priceList = new HashMap<>();
        int i = 0;
        for (WebElement element : list) {
            String airLine = element.findElement(By.xpath(".//h5[@class='theme-search-results-item-flight-section-airline-title'][@style]")).getText();
            String price = element.findElement(By.xpath(".//p[@class='theme-search-results-item-price-tag']//strong")).getText();
            String duration = element.findElement(By.xpath(".//div[@class='theme-search-results-item-flight-section-path-fly-time'][text()]")).getText();
            String stops = " Two stops";
            try {
                stops = element.findElement(By.xpath(".//div[@class='theme-search-results-item-flight-section-path-line-title']//strong[text()]")).getText();
            }catch (Exception e){ }
            int actualStops = convertStops(stops);
            int actualPrice = convertPrice(price);
            int actualDuration = convertDuration(duration);
            if (actualPrice <= 500)
                priceList.put(airLine + " " + i, actualPrice);
            if (actualDuration <= 15)
                durationList.put(airLine + " " + i, actualDuration);
            i++;
        }
//        System.out.println("============================================================");
//        stopList.forEach((K, V) -> System.out.println("Airline name: " + K + " | Stops : " + V));
//        priceList.forEach((k,v) -> System.out.println("Airline name: " + k + " | Price: $" + v));
//        durationList.forEach((k,v) -> System.out.println("Airline name: " + k + " | Duration: " + v));
        System.out.println("=============== Requirements ==================");
        for(String airlineName: durationList.keySet()){
            if (durationList.get(airlineName) < 9){
                if(priceList.containsKey(airlineName) && priceList.get(airlineName) <= 500)
                    System.out.println( airlineName + " | Price: " + priceList.get(airlineName) + " | Duration: " + durationList.get(airlineName));
            }
        }
        driver.close();
    }
    static int convertStops(String stops){
        return Integer.parseInt(stops.substring(stops.indexOf(" ") + 1).trim());
    }
    static int convertPrice(String price){
        return Integer.parseInt(price.substring(4));
    }
    static int convertDuration(String duration){
        return Integer.parseInt(duration.substring(14, duration.indexOf("h")));
    }
}
