package homeworks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class DragAndDrop_Test extends TestBase {

    @Test
    void dragAndDrop() {
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        Actions action = new Actions(driver);
        action.dragAndDrop(draggable, droppable).perform();

        WebElement dropped = driver.findElement(By.xpath("//p[text()=\"Dropped!\"]"));
        Assertions.assertTrue(dropped.isDisplayed());

    }
}