package day2_setPosition_Size_fireFox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C3_GetPageSourceTest {
    //    à Go to the Amazon URL: https://www.amazon.com/
    //    à Verify that it writes "Performance Metrics" and "Gateway" from the Source code.
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com./");

        String pageSourceCode= driver.getPageSource();
        //System.out.println("pageGetSource = " + pageSourceCode);

        String word1="Performance Metrics";
        String word2="Gateway";

        if (pageSourceCode.contains(word1) || pageSourceCode.contains(word2)){
            System.out.println("Source code test Passed");
        }else System.out.println("Source code test Failed because "+ word1+" not exist");//Source code test Failed because Performance Metrics not exist
              System.out.println("Source code test Failed because "+ word2+" not exist");// Source code test Failed because MEOW not exist
    }
}
