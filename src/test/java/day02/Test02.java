package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test02 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");//google sayfasına git

        String actualGoogleTitle = driver.getTitle();//bu kodla string sepetine koyduk.sayfa baslıgını konsola yazdıralım
        System.out.println("actualGoogleTitle =" + actualGoogleTitle);

        //google sayfasına gidelim
        String googleUrl = "https://google.com";
        driver.get(googleUrl);

        //sayfa baslıgını yazdıralım
        String actualGoogleTitle1 = driver.getTitle();//bu kodla string sepetine koyduk.sayfa baslıgını konsola yazdıralım
        System.out.println("actualGoogleTitle =" + actualGoogleTitle1);

        //sayfanın url ni yazdır
        String actualGoogleUrl=driver.getCurrentUrl();
        System.out.println("actualGoogleUrl"+actualGoogleUrl);

        //techpro sayfasına gidelim
        driver.get("https://techproeducation.com");

        //sayfa baslıgını konsola yazdıralım
       String actualTechproTitle =driver.getTitle();

       //sayfanın url ni konsola yazdır
        String actualTehcproTitle = driver.getCurrentUrl();
        System.out.println("actualTehcproTitle =" +actualTehcproTitle);









    }
}
