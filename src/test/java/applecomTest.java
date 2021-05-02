import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class applecomTest {

    @Test
    public void apple() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.apple.com/");
        Thread.sleep(3000);
        WebElement dropdown = driver.findElement(By.className("ac-ls-dropdown"));
        dropdown.click();
        WebElement otherRegion = driver.findElement(By.id("ac-ls-dropdown-option-country-region"));
        otherRegion.click();
        WebElement cont = driver.findElement(By.id("ac-ls-continue"));
        cont.click();
        Thread.sleep(1000);
        List<WebElement> countires = driver.findElements(By.xpath("//a[@property=\"schema:url\"]"));
        for (WebElement country : countires) {
            if (country.getText().equals("Россия")) {
                country.click();
                break;
            }
        }
    }

}


