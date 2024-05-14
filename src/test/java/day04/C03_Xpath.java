package day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C03_Xpath {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com/");

        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@type='text']"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);

        WebElement aramaSonuc =driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        System.out.println(aramaSonuc.getText());

        String [] sonucSayisi =aramaSonuc.getText().split(" ");
        System.out.println("sonucSayisi = " + sonucSayisi[2]);

        //Sonra karşınıza çıkan ilk sonucun metnine tıklayın.
        driver.findElement(By.xpath("//img[@class='s-image'][1]")).click();

        Thread.sleep(3000);

        //sayfayi kapatınız
        driver.close();


    }
}
