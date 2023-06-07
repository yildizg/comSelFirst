package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_HomeWork {
   /* à Set Path
    à Create chrome driver
    à Open google home page: https://www.google.com
    à Get Title on page
    à Get Current URL on page
    à Close/Quit the browser*/
   public static void main(String[] args) throws InterruptedException {
       //Set Path
       System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
       Thread.sleep(5000);

       //Create chrome driver
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.google.com");
       Thread.sleep(5000);

       // Get Title on page
       String googleTitle=driver.getTitle();
       System.out.println("googleTitle = " + googleTitle);//googleTitle = Google
       Thread.sleep(5000);

       // Get Current URL on page
       String googleUrl=driver.getCurrentUrl();
       System.out.println("googleUrl = " + googleUrl);//googleUrl = https://www.google.com/
       Thread.sleep(5000);

       // Close/Quit the browser
       driver.close();
   }
}
