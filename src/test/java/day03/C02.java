package day03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02 {

    //Go to TechPro page. https://www.techproeducation.com/
    //Print the page position and size
    //Minimize the page
    //Wait 3 seconds in minimized mode and maximize the page
    //Print the page position and size in maximized mode
    //Make the page fullscreen
    //Print the page position and size in fullscreen mode
    //Close the page


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
       // driver.manage() metodu, tarayıcı yönetimiyle ilgili işlemleri gerçekleştirmek için kullanılır.

        //Go to TechPro page. https://www.techproeducation.com/
        driver.get("https://www.techproeducation.com/");

        //Print the page position and size
        System.out.println("sayfanın konumu = " + driver.manage().window().getPosition());
        System.out.println("sayfanın olculeri = " + driver.manage().window().getSize());
        //Minimize the page
        driver.manage().window().minimize();

        //Wait 3 seconds in minimized mode and maximize the page
       Thread.sleep(3000);
       driver.manage().window().maximize();
        //Print the page position and size in maximized mode
        System.out.println("sayfanın konumu = " + driver.manage().window().getPosition());
        driver.manage().window().getSize();
        //Make the page fullscreen
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        //Print the page position and size in fullscreen mode
        System.out.println("sayfanın konumu = " + driver.manage().window().getPosition());
        System.out.println("sayfanın olculeri = " + driver.manage().window().getSize());
        //Close the page
        Thread.sleep(3000);
        driver.quit();

    }
}
