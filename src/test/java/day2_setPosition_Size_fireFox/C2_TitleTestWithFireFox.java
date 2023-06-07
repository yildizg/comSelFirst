package day2_setPosition_Size_fireFox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C2_TitleTestWithFireFox {
    /*
             Invoke FireFox Driver
         Go to https://www.youtube.com/
             Verify the page title contains the word video.
             Close the driver.

 */
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","resources/driver/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();

        // Go to https://www.youtube.com/
        driver.get("https://www.youtube.com/");
        String pageTitle=driver.getTitle();
        System.out.println("pageTitle = " + pageTitle);
        //pageTitle = YouTube
      // Verify the page title contains the word video.
        if (pageTitle.contains("video")){
            System.out.println("Passed");
        }else System.out.println("Failed");
        //Failed
        //Close the driver.
        driver.close();





    }
}
