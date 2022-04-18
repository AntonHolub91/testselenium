import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Links {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\QA\\Projects\\testselenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        WebElement link = driver.findElement(By.xpath("//li[@id='n-aboutsite']//a"));
//        System.out.println(link.getText()); //выведет в консоли текс ссылки

        link.click();
        WebElement text = driver.findElement(By.xpath("//*[@id='firstHeading']"));
//        System.out.println(text.getText());
        if (text.getText().equals("Wikipedia:About")) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

//        driver.get("https://github.com/");
//        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul/li[2]/a")).click();
//
//        driver.get("https://www.facebook.com/");
//        driver.findElement(By.xpath("//div[@class='_6ltj']//a")).click();



        driver.quit();
    }

}
