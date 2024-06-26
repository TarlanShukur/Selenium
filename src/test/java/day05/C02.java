package day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C02 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //Add Element butonuna basin
        driver.findElement(By.cssSelector("button[onclick ='addElement()' ]")).click();
        Thread.sleep(3000);

        WebElement deleteButton = driver.findElement(By.cssSelector("button[class='added-manually']"));
        if(deleteButton.isDisplayed()){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        //Delete tusuna basin
        Thread.sleep(3000);
        deleteButton.click();

        Thread.sleep(2000);
        WebElement addRemoveText = driver.findElement(By.cssSelector("h3"));
        System.out.println(addRemoveText.isDisplayed() ? "TEST PASSED" : "TEST FAILED");

        //sayfayı kapatınız
        driver.close();
    }
}
