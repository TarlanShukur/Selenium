package day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C04 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("https://lms.techproeducation.com/");
        Thread.sleep(3000);

        driver.manage().window().minimize();

        Thread.sleep(3000);
        driver.manage().window().maximize();

        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        driver.close();
    }
}
