import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class SignUp {
    public static void main (String[] args){
    WebDriver driver=initChromeDriver();
//    driver.manage().window().maximize();
    driver.get("http://frontend.proplanner.formula1.cloud.provectus-it.com/login");

       // WebDriver driver=new ChromeDriver();
     //   WebDriver driver1= new FirefoxDriver();
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
//      WebElement calendar_button = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[2]/a[2]"));
//     waitetime();
//     calendar_button.click();
//      waitetime();
        String[] str = {"//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/div/nav/ul/li[1]/a",
                "//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/div/nav/ul/li[2]/a",
                "//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/div/nav/ul/li[3]/a",
                "//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/div/nav/ul/li[4]/a",
                "//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/div/nav/ul/li[5]/a",
                "//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/div/button"};
        for (int i=0; i<6; i++){
            WebElement sidebar = driver.findElement(By.xpath(str[i]));
            waitetime();
            sidebar.click();
        }
        waitetime();
        driver.quit();

    }

    private static WebDriver initChromeDriver(){
        System.setProperty("webdriver.chrome.driver",SignUp.class.getResource("chromedriver.exe").getPath());
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
