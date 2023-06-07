package day2_setPosition_Size_fireFox;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1_SEtPosition_SetSize {
    /* Go to the Amazon URL : https://www.amazon.com/
        à Print the position and size of the page.
                à Adjust the position and size of the page as desired.
        à Test that the page is in the position and size you want.
                à Close the page.*/
    public static void main(String[] args) throws InterruptedException {
   // Go to the Amazon URL : https://www.amazon.com/
    System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.com/");

    // Print the position and size of the page.
        System.out.println("windows olculeri: "+driver.manage().window().getSize());//windows olculeri: (945, 1012)
        System.out.println("windows konumu: "+driver.manage().window().getPosition());//windows konumu: (10, 10)

    // Adjust the position and size of the page as desired.
        driver.manage().window().setPosition(new Point(200,50));
        System.out.println("new Position: "+driver.manage().window().getPosition());

        driver.manage().window().setSize(new Dimension(20,50));
        System.out.println("new size: "+driver.manage().window().getSize());

        // Test that the page is in the position and size you want.
    int xCoordinate=driver.manage().window().getPosition().getX();
    int yCoordinate=driver.manage().window().getPosition().getY();

    int width=driver.manage().window().getSize().getWidth();
    int heigth=driver.manage().window().getSize().getHeight();
    Thread.sleep(3000);

    if (xCoordinate==200 && yCoordinate==50 && width==20 && heigth==50){
        System.out.println("passed");
    }else System.out.println("failed");

    // Close the page.



















    }
}
