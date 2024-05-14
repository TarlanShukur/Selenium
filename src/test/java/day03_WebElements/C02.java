package day03_WebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class C02 {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.google.com/");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("selenium");

        searchBox.submit();

        String actualTitle = driver.getTitle();
        String expectedTitle = "selenium";

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        for (WebElement w : links) {
            if (!w.getText().isEmpty()) {
                System.out.println(w.getText());
            }
        }

    }
}
