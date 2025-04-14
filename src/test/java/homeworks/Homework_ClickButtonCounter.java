package homeworks;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Homework_ClickButtonCounter {
    private WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void test01() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        WebElement addButton = driver.findElement(By.xpath("//button[text()='Add Element']"));

        // Add Element butonuna 100 kez basınız
        for (int i = 0; i < 100; i++) {
            addButton.click();
        }

        List<WebElement> deleteButtons = driver.findElements(By.cssSelector("button.added-manually"));
        Assertions.assertEquals(100, deleteButtons.size(), "100 Delete butonu eklenmeli");

        //Delete butonuna 90 kez basınız
        for (int i = 0; i < 90; i++) {
            deleteButtons.get(i).click();
        }

        //Kalan toplam delete butonu sayisi
        List<WebElement> remainingButtons = driver.findElements(By.cssSelector("button.added-manually"));
        Assertions.assertEquals(10, remainingButtons.size(), "Geriye 10 Delete butonu kalmalı");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
        }

    }







