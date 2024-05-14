package day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C01_DriverTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebDriverManager.edgedriver().setup();
        WebDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://www.amazon.com/");

        /*
        WebDriverManager sayesinde istedigimiz browseri rahatlikla setup yaparak otomasyonda kullanabiliriz
        Bu sayede gerekli olan browseri bilgisayirimiza indirmek, yapilandirmak .. zorunda kalmayiz
         */

    }
}