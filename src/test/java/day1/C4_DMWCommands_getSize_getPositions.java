package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C4_DMWCommands_getSize_getPositions {
            /*
        Invoke Chrome Browser
        Open URL: https://www.google.com/
        Maximize the window.
        Print the position and size of the page.
        Minimize the page.
        Wait 5 seconds in the icon state and maximize the page.
        Print the position and dimensions of the page in maximized state.
        Make the page fullscreen.
        Close the Browser.
        */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Open URL: https://www.google.com/
        driver.get("https://www.google.com/");

        //Maximize the window.
        driver.manage().window().maximize();

       // Print the position and size of the page.
        driver.manage().window().getPosition();
        System.out.println("Sayfanin pozisyonu:"+driver.manage().window().getPosition()+"Sayfanin olculeri:"+driver.manage().window().getSize());
        //Sayfanin pozisyonu:(-8, -8)Sayfanin olculeri:(1936, 1048)
        //  Minimize the page.
        driver.manage().window().minimize();

        //Wait 5 seconds in the icon state and maximize the page.
        Thread.sleep(5000);
        driver.manage().window().maximize();

        // Print the position and dimensions of the page in maximized state.
        System.out.println("Sayfanin pozisyonu:"+driver.manage().window().getPosition()+"Sayfanin olculeri:"+driver.manage().window().getSize());
        //Sayfanin pozisyonu:(-8, -8)Sayfanin olculeri:(1936, 1048)


        // Make the page fullscreen.
        driver.manage().window().fullscreen();

        //Close the Browser.
       driver.close();
        //islemleri görmke icin araya sleep atip bekletebiliriz
    }
}
