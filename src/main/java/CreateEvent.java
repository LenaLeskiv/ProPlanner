import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

public class CreateEvent {
    public static void main (String[] args){
        WebDriver driver=initChromeDriver();
        driver.get("http://frontend.proplanner.formula1.cloud.provectus-it.com/login");

        String HomePage = driver.getWindowHandle();
//        System.out.println(HomePage);
        WebElement sign_up = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/button"));
        sign_up.click();

        String PopUp;
//                = driver.getWindowHandle();
//        System.out.println(PopUp);
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> iterator = windows.iterator();
//Switch to Google pop-up window
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
        waitetime();
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
        MinutesClick2.doubleClick(Minutes2).build().perform();
//Goals
        WebElement GoalField = driver.findElement(By.xpath("//*[@id=\"react-select-2-input\"]"));
        waitetime();
        GoalField.sendKeys("finish");
        waitetime();
        driver.findElement(By.className("css-15k3avv")).click();
// Description
        WebElement Description = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/form/div[1]/ul/li[4]/div/div/div/div/textarea"));
        Description.sendKeys("Test of Automation");
        waitetime();
// Tasks
/*    WebElement signup_email = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("email")));
signup_email = (WebElement)((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility = 'visible'; return arguments[0];", signup_email);

WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement Tasks = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/form/div[1]/ul/li[5]/div/div[2]/div/div/div/div/input")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].value = 'step'", Tasks);
        waitetime();*/
        WebElement Tasks = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/form/div[1]/ul/li[5]/div/div[2]/div/div/div/div/input"));
        Tasks.click();
//        Tasks = (WebElement)((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility = 'visible'; return arguments[0];", Tasks);
        waitetime();
//        ((JavascriptExecutor)driver).executeScript("arguments[0].value = 'step'", Tasks);
//        Tasks.sendKeys("Step");
//Priority
        WebElement Priority = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/form/div[2]/div/ul/li[1]/div/div"));
        Priority.click();
        waitetime();
        WebElement High = driver.findElement(By.xpath("//*[@id=\"lock-menu\"]/div[2]/ul/li[1]"));
        High.click();
        waitetime();
//Type
        WebElement Type = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/form/div[2]/div/ul/li[2]/div/div\n"));
        Type.click();
        waitetime();
        WebElement Work = driver.findElement(By.xpath("//*[@id=\"type-menu\"]/div[2]/ul/li[1]"));
        Work.click();
        waitetime();
//Save
        WebElement Save = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/form/div[2]/div/button[1]/span[1]"));
        Save.click();

//        Tasks.sendKeys(Keys.ENTER);
//        waitetime();

//        GoalField.submit();
        //WebElement Goal = driver.findElement(By.xpath("//*[@id=\"react-select-2-input\"]"));
        //Goal.click();
        //waitetime();
    }

    private static WebDriver initChromeDriver(){
        System.setProperty("webdriver.chrome.driver",CreateEvent.class.getResource("chromedriver.exe").getPath());
        return new ChromeDriver();
    }
    private static void waitetime() {   //создание метода время ожидания загрузки
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
