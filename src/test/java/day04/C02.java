package day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C02 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://testcenter.techproeducation.com/index.php");

        WebElement backToButton = driver.findElement(By.partialLinkText("Back to TechProEducation.com"));
        System.out.println(backToButton);

        WebElement applicationsLists =  driver.findElement(By.tagName("h1"));

        if (applicationsLists.isDisplayed()){
            System.out.println("TEST PASSED");
        } else {
            System.out.println("Test Failed");}

        Thread.sleep(3000);

        driver.close();


    }
}
