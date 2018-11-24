import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class CreateEvent {
    public static void main (String[] args){
        WebDriver driver=initChromeDriver();
        driver.get("http://frontend.proplanner.formula1.cloud.provectus-it.com/login");

        String HomePage = driver.getWindowHandle();
        System.out.println(HomePage);
        WebElement sign_up = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/button"));
        sign_up.click();

        String PopUp = driver.getWindowHandle();
        System.out.println(PopUp);
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> iterator = windows.iterator();

        while(iterator.hasNext()) {
            PopUp = iterator.next();

            if (!PopUp.equals(HomePage)) {
                driver.switchTo().window(PopUp);
                waitetime();
                WebElement email = driver.findElement(By.cssSelector("#identifierId"));
                email.sendKeys("qaprop2018@gmail.com");
                waitetime();
                WebElement next = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span"));
                next.click();
                waitetime();
                WebElement password = driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input"));
                waitetime();
                password.sendKeys("$test2018");
                waitetime();
                WebElement next1 = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span"));
                next1.click();
                waitetime();
            }
        }

        driver.switchTo().window(HomePage);
        driver.manage().window().maximize();
        waitetime();
        WebElement calendar_button = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[2]/a[2]"));
        waitetime();
        calendar_button.click();
        waitetime();
        WebElement AddEvent = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/header/a"));
        AddEvent.click();
        WebElement Title = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/form/div[1]/ul/li[1]/div/div/div/div/input"));
        waitetime();
        Title.sendKeys("Automation Of Create Event");
        waitetime();
//Start Date
        WebElement StartDate = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/form/div[1]/ul/li[2]/div/span[1]/div/div/input"));
        StartDate.click();
        waitetime();

        WebElement Year = driver.findElement(By.xpath("//*[@id=\"picker-popover\"]/div[2]/div[1]/div[1]/h3"));
        Year.click();
        waitetime();
        WebElement Year2018 = driver.findElement(By.xpath("//*[@id=\"picker-popover\"]/div[2]/div[3]/div/div/div[119]"));
        Year2018.click();
        waitetime();

        WebElement Month = driver.findElement(By.xpath("//*[@id=\"picker-popover\"]/div[2]/div[3]/div/div[2]/div/div[4]/div[7]/button/span[1]"));
        Month.click();
        waitetime();
        WebElement Hour = driver.findElement(By.xpath("//*[@id=\"picker-popover\"]/div[2]/div[3]/div/div/div/div[1]"));
        Hour.click();
        waitetime();
        WebElement Minutes = driver.findElement(By.xpath("//*[@id=\"picker-popover\"]/div[2]/div[3]/div/div/div/div[1]"));
        Actions MinutesClick = new Actions(driver);
        MinutesClick.doubleClick(Minutes).build().perform();
        waitetime();
// End Date
        WebElement EndDate = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/form/div[1]/ul/li[2]/div/span[3]/div/div/input"));
        EndDate.click();
        waitetime();

        WebElement Year2 = driver.findElement(By.xpath("//*[@id=\"picker-popover\"]/div[2]/div[1]/div[1]/h3"));
        Year2.click();
        waitetime();
        WebElement Year2019 = driver.findElement(By.xpath("//*[@id=\"picker-popover\"]/div[2]/div[3]/div/div/div[120]"));
        Year2019.click();
        waitetime();

        WebElement Month2 = driver.findElement(By.xpath("//*[@id=\"picker-popover\"]/div[2]/div[3]/div/div[2]/div/div[5]/div[2]/button/span[1]"));
        Month2.click();
        waitetime();
        WebElement Hour2 = driver.findElement(By.xpath("//*[@id=\"picker-popover\"]/div[2]/div[3]/div/div/div/div[1]"));
        Hour2.click();
        waitetime();
        WebElement Minutes2 = driver.findElement(By.xpath("//*[@id=\"picker-popover\"]/div[2]/div[3]/div/div/div/div[3]"));
        Actions MinutesClick2 = new Actions(driver);
        MinutesClick.doubleClick(Minutes2).build().perform();

    }

    public static WebDriver initChromeDriver(){
        System.setProperty("webdriver.chrome.driver",SignUp.class.getResource("chromedriver.exe").getPath());
        return new ChromeDriver();
    }
    public static void waitetime() {   //создание метода время ожидания загрузки
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
