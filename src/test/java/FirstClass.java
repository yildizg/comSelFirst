import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.de");


    }
}
