import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TextFields {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\QA\\Projects\\testselenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Selenium WebDriver"); //sendKeys метод ввдодит текст в ранее найденный текст филд
        driver.findElement(By.xpath("//input[@id='searchButton']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@id='searchText']//input")).getAttribute("value")); //метод getAttribute выведет в консоли текст, находящийся в текст филде
        driver.findElement(By.xpath("//div[@id='searchText']//input")).clear(); //метод clear очищает текстовое поле


//        driver.get("https://github.com/");
//        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div[2]/a")).click();
//        driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys("username");
//        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("userpswrd");
//        driver.findElement(By.xpath("//*[@id='login']/div[4]/form/div/input[12]")).submit();
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[7]/details/summary")).click();
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[7]/details/details-menu/form/button")).click();

//        WebElement button = driver.findElement(By.xpath("//form[@class='mx-auto mx-md-0 col-5-max js-signup-form position-relative z-2']//button"));
//        button.submit();
//        driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/a")).click();
//
//        driver.get("https://www.facebook.com/");
//        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testemail");
//        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("testepswrd");
//        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).submit();
//        System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value"));


//        driver.quit();
    }


}
