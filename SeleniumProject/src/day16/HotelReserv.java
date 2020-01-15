package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class HotelReserv {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/edilaibashov/IdeaProjects/Libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://orbitz.com");
        // first tap or click to a diferent page in the same webpage
        WebElement hotel = driver.findElement(By.id("tab-hotel-tab-hp"));
        hotel.click();
        WebElement hotels = driver.findElement(By.id("hotel-destination-hp-hotel"));
        hotels.click();
        // entering the words to las vegas
        hotels.sendKeys("Las Vegas, Nevada");
        Thread.sleep(1000);
        hotel.click();
        //Check-in date
        driver.findElement(By.id("hotel-checkin-hp-hotel")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='datepicker-cal-date']")).click();
        //Check-out date
        driver.findElement(By.id("hotel-checkout-hp-hotel")).click();
        driver.findElement(By.xpath("//*[@data-month='0' and @data-day='12']")).click();
        //Selecting rooms and people by Selector methods
        Select room = new Select(driver.findElement(By.id("hotel-rooms-hp-hotel")));
        room.selectByValue("2");
        Select adults1 = new Select(driver.findElement(By.id("hotel-1-adults-hp-hotel")));
        adults1.selectByValue("2");
        new Select(driver.findElement(By.id("hotel-1-children-hp-hotel"))).selectByValue("2");
        new Select(driver.findElement(By.id("hotel-1-age-select-1-hp-hotel"))).selectByValue("2");
        new Select(driver.findElement(By.id("hotel-1-age-select-2-hp-hotel"))).selectByValue("4");
        new Select(driver.findElement(By.id("hotel-2-adults-hp-hotel"))).selectByValue("4");
        driver.findElement(By.xpath("//section[@id='section-hotel-tab-hp']//button[.='Search']")).click();
        Thread.sleep(2000);
        //To get 50 hotels in List
        WebElement starButton = driver.findElement(By.cssSelector("span.uitk-button-toggle-content"));
        starButton.click();
        Thread.sleep(3000);
        List<WebElement> hotelList = driver.findElements(By.xpath("(//div[@class='link-container uitk-grid']/div)"));
        System.out.println(hotelList.size());
        Thread.sleep(2000);
        for(WebElement e: hotelList){
            System.out.println(e.getText());
        }
        Map<String, Integer> discountsMap = new HashMap<>();
        Map<String, Integer> pricesMap = new HashMap<>();
        Map<String, Double> starsMap = new HashMap<>();
        for(WebElement element: hotelList) {
            Thread.sleep(3000);
            String hotelName = element.findElement(By.xpath(".//h3[@data-stid='content-hotel-title']")).getText();
            String price = element.findElement(By.xpath(".//span[@data-stid='content-hotel-lead-price']")).getText();
            String star = element.findElement(By.xpath(".//span[@data-stid='content-hotel-reviews-rating']")).getText();
            String discount = "No discount";
            try {
                // by element we are narrowing the target so we are using span badgeText
                discount = element.findElement(By.xpath(".//span[@class='uitk-badge-text']")).getText();
            }catch (Exception e){ }
            int actualDiscount = convertDiscount(discount);
            int actualPrice = convertPrice(price);// method to convert a price
            double actualStars = convertStars(star);
            if (actualDiscount > 20)// if discount is greater than 20 percent print it
                discountsMap.put(hotelName, actualDiscount);
            if (actualPrice > 200) //
                pricesMap.put(hotelName, actualPrice);
            if (actualStars >= 4.5)
                starsMap.put(hotelName, actualStars);
        }
        System.out.println("=====================  Discounts  ===================");
        discountsMap.forEach((K, V) -> System.out.println("Hotel name: " + K + " | Discount amount: " + V + "%"));
        System.out.println("=======================  Prices  =====================");
        pricesMap.forEach((k,v) -> System.out.println("Hotel name: " + k + " | Price: $" + v));
        System.out.println("=======================  Ratings  =====================");
        starsMap.forEach((k,v) -> System.out.println("Hotel name: " + k + " | Stars: " + v));// lambda method  to call at once
        System.out.println("===============     FINAL   ===============");
        for(String hotelName: pricesMap.keySet()){
            if(pricesMap.containsKey(hotelName)){
                if (pricesMap.get(hotelName) > 200)// getting 20 elements or getting prices over 200
                   System.out.println( " | Price: " + pricesMap.get(hotelName));
            }
        }
        driver.quit();
        Thread.sleep(3000);
    }
    static int convertDiscount(String discount){
        int actualDiscount=0;
        if (discount.contains("%")){
            if (discount.length() < 8){
                actualDiscount = Integer.parseInt(discount.substring(0,discount.indexOf("%")));
            }else {
                actualDiscount = Integer.parseInt(discount.substring(discount.indexOf("%") - 2, discount.indexOf("%")).trim());
            }
        }
        return actualDiscount;
    }
    static int convertPrice(String price){

        return Integer.parseInt(price.substring(1));
    }
    static double convertStars(String star){

        return Double.parseDouble(star.substring(0, star.indexOf("/")));
    }
}




