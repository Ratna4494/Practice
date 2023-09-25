package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Handling {

    public static void main(rrt[] args) throws InterruptedException {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);

        driver.get("https://canarabank.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='panel-link login active']")).click();

       // driver.quit();

    }
}
