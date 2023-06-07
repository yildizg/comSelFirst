package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1_FirstClass {
        public static void main(String[] args) {
            //Seleniumla calismaya basladigimizda once hangi driver ile calsacagimizi belirtmemiz gerek
            //Driver araciligi ile browser ile iletisim kuracagiz
            //System.setProperty methodu : driver i tanitir..2 parametere ister, ,
            // ilki kullancagimiz browsera ait driverdir,
            // ikincisi de selenium sitesinden indirip projemize ekledigimiz chrome driver in pathi
            //windows kullanicilari sonunda .exe varken , apple kullananlarda yoktur..

            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe"); //windows driver tanitilir
            //System.setProperty("webdriver.chrome.driver","drivers/chromedriver"); //mac

            //Driver pathi belirtildiktean sonra, driver objemizi olusturmaliyiz..

            WebDriver driver = new ChromeDriver();
            //chrome driver in implement ettigi methodlari kullaniriz

            driver.get("https://www.google.com/");

            //get() methodu: driver ile bir siteyi acmak istersekdriver objemizin get() methodunu kullaniriz
            //driver imiza  get komutu ile google.com a gitmasinzi soyledik

            //hicbir adrese yonlendirmesek de;
            // ChromeDriver() constructorindan uretilen driver objesi bos bir WebDriver acar

            driver.get("https://www.amazon.com/");

            driver.quit(); //driver da acik olan bu sayfalari tamamen kapatir(cikis)

            driver.close(); //driver clasin en sonuna eklenmelidir,gecerli sekmeden cikar
            // cunku bu kod calisinca driver imiz kapanir

            // driver.get("https://www.google.com/"); //bu kod satiri hata verir..
            // bu koddan sonra yeni bir browser acmak istiyorsak driver a yeni deger atamaliyiz
            //driver objesi olusturmaliyiz

        }
    }












