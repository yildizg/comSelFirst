package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C2_BrowserCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();//driver i tüm sayfaya kaplatiyoruz
        driver.manage().window().fullscreen();//driver i tam ekran yapar.f11 gibi islevi gibi adres cubugu görünmüyor.
        driver.get("https://www.amazon.com./");

        String amazonTitle=driver.getTitle();
        System.out.println("amazonTitle = " + amazonTitle);//amazonTitle = Amazon.com. Spend less. Smile more.
        //gecerli sekmenin title ini verir.Bize String deger return eder.

        String amazonUrl=driver.getCurrentUrl();
        System.out.println("amazonUrl = " + amazonUrl);//amazonUrl = https://www.amazon.com./
        //gecerli sekmedeki sitenin Url ini verir .Bize String döndürür.
        driver.close();

    }
}
