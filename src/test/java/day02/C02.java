package day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C02 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        String amazonURL = "https://www.amazon.com/";
        driver.get(amazonURL);

        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        if (actualTitle.contains("Amazon")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        Thread.sleep(3000);

        String actualURl = driver.getCurrentUrl();
        System.out.println(actualURl);

        if (actualURl.contains("amazon")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        String amazonWindowHandle = driver.getWindowHandle();
        System.out.println(amazonWindowHandle);

        String amazonHTML = driver.getPageSource();
        if (amazonHTML.contains("Gateway")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }
        driver.close();
    }
}
