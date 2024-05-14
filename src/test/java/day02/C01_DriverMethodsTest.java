package day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C01_DriverMethodsTest {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

         String amazonURL = "https://www.amazon.com/";
         String techproURL ="https://lms.techproeducation.com/";
         driver.get(amazonURL);

         String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);

        driver.get(techproURL);

        String techProEduTitle = driver.getTitle();
        System.out.println(techProEduTitle);

        String techProEduURL = driver.getCurrentUrl();
        System.out.println(techProEduURL);
    }
}
