package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test01 {
    public static void main(String[] args) {

     WebDriver chromeDriver = new ChromeDriver();
     //Bos bir chrome browserı acar

     chromeDriver.get("https:/google.com");
     //gidilmek istendiği yere goturur

        chromeDriver.quit();
       // acık olan tuk sekme ve sayfaları kapatır

      //Edge Driver ve Edge Browser, Microsoft Edge tarayıcısını otomatikleştirmek için kullanılır.
       //Edge browser internette gezinmek için kullanılır Selenyum testlerini calıstırır
        // Edge Driver Edge Browsere kontrol eder
      //  Edge Browser normal bir tarayıcıdır, Edge Driver ise Selenium gibi araçların Edge'i kullanarak web otomasyonu yapmasını sağlar.

       WebDriver edgeDriver=new EdgeDriver();
       //bu kod bir edge browser acar
        edgeDriver.get("http:/google.com");
        edgeDriver.quit();

       //FirefoxDriver, Selenium test otomasyonu için kullanılan bir WebDriver bileşenidir.
        //Selenium framework'ü ile birlikte kullanılarak,
        // web sitelerinde testler çalıştırabilir, sayfa öğeleriyle etkileşim kurabilir ve kullanıcı davranışlarını simüle edebilir.

        /*
        Görevi Nedir?
       Web sitelerini test etmek: Bir web sitesini açıp, butonlara tıklamak, form doldurmak gibi testleri otomatikleştirir.

       Kullanıcı davranışlarını taklit etmek: Gerçek bir kullanıcı gibi sayfayı kaydırabilir, tıklamalar yapabilir, veri girebilir.

       Testleri Firefox tarayıcısında çalıştırmak: Google Chrome için ChromeDriver olduğu gibi, Firefox için de FirefoxDriver vardır.
         */

        WebDriver fireFoxdriver=new FirefoxDriver();
        fireFoxdriver.get("https:/google.com");
        fireFoxdriver.quit();


    }


    }

