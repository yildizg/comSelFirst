package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C3_NavigationCommands {
   /* Invoke Chrome Browser
    Navigate to URL: https://clarusway.com/
    Navigate to URL: http://amazon.com/
    Come back to the Clarusway using the back command.
    Again go back to the amazon website using forward command
    Refresh the Browser using refresh command.
    Close the Browser.*/
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // driver.get("https://clarusway.com/"); //clarusway sayfasina git

        //Navigate to URL: https://clarusway.com/
        driver.navigate().to("https://clarusway.com/"); //clarusway sayfasina git

        //to() - get() methodu ile tamamen ayni islevi yapar.

        //Navigate to URL: http://amazon.com/
        driver.navigate().to("https://www.amazon.com/");

        //Come back to the Clarusway using the back command.
        driver.navigate().back(); //once claruswaya sonra amazona gittikten sonra clarusway e geri donecek(geri)

        Thread.sleep(3000);
        //Again go back to the amazon website using forward command
        driver.navigate().forward(); //tekrar amazon sayfasina gider (ileri)

        Thread.sleep(3000);
        //Refresh the Browser using refresh command.
        driver.navigate().refresh(); //oldugu sayfayi yeniler

        Thread.sleep(3000);
        //Close the Browser.
        driver.close();





    }
}
