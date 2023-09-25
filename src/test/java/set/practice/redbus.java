package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class redbus {

    public static void main(rrt[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.redbus.com/");
        driver.findElement(By.xpath("//button[@class='sc-jTzLTM bfMZDh']")).click();

        WebElement src= driver.findElement(By.id("src"));
        src.sendKeys("Hyderabad, Telangana, India");

        WebElement dest= driver.findElement(By.id("dest"));
        dest.sendKeys("Goa, India");


        driver.findElement(By.xpath("//div[@class='input-area']//input[@id='onward_cal']")).click();

        List<WebElement> cal=driver.findElements(By.xpath("//div[@class='DatePicker__MainBlock-sc-1x9sb82-1 gTgSRP'][2]//div[@class='DayNameTitle__CalendarDays-g8nsno-0 gpLgXd']]"));

        for(WebElement date:cal){
            if(date.getText().equals("24")){
                date.click();
                break;

            }

        }
        driver.findElement(By.xpath("//button[@id='search_butn']")).click();




    }
}
