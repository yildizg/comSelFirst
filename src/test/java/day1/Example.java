package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
    public static void main(String[] args) {
     //Seleniumla calismaya basladigimizda önce hangi driver ile calisacagimizi belirtmemiz gerekiyor.
     //Driver araciligi ile Browser ile iletisim kuracagiz.
     //Ilki kullanacagimiz Browser a ait driverdir
      //ikincisi de selenium sitesinden indirip projemmize ekledigimiz chrome driver path i
     // windows kullanicilari sonunda exe. varken apple kullananlarda yoktur.
        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");

   // System.setProperty methodu driver i tanitir 2 parametre ister.
   //Driver pathi belirtildikten sonra driver objemizi olusturmaliyiz.
        WebDriver driver=new ChromeDriver();
        //chrome driver in implement ettigi methodlari kullaniriz.
       // driver.get("https://www.google.com/");

    driver.get("https://www.amazon.com/");
    driver.quit();//driver da acik olan sayfalari tamamen kapatir
    driver.close();//driver clasin en sonuna eklenmelidir,cünkü bu kod calisinca driver imiz kapanir.Objeyi etkisiz hale getirir.

       // driver.get("https://www.google.com/");//bu kod satiri hata verir. close ile kapatildi---> yeni browser acmak lazim--> yani  driver objesi create etmek gerekiyor.



    }
}
