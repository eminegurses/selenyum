package day03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03 {
    public static void main(String[] args) {

       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Go to TechProEducation page
        driver.get("https://techproeducation.com");

        //test that the page title contains" TechPro Education"
        System.out.println("Title = " + driver.getTitle());
        if (driver.getTitle().contains(" TechPro Education")){
            System.out.println("passed");

        }else {
            System.out.println("failed");

        }
        //go to facebook page,
        driver.get("https://facebook.com");

        //test that the page url contains facebook
        System.out.println("driver.getTitle() = " + driver.getTitle());
        if (driver.getTitle().contains("Facebook")){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }

        //go back to techpro page
        driver.navigate().back();
        //Test that you are back
        String currentUrl= driver.getCurrentUrl();
        if (currentUrl.equals("https://www.techproeducation.com/")){
        System.out.println("p");

        }else{
        System.out.println("f");

        }
        //close the page
        driver.quit();

    }
}
