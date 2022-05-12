import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicityWait {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\QA\\Projects\\testselenium\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://7745.by/");

        WebDriverWait wait = (new WebDriverWait(driver, 5)); //создаем-подключаем метод wait с ожидаением в 5 секунд
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='header-main__icon']")));

        driver.findElement(By.xpath("//div[@class='header-categories__links header-categories__links--7745']//a[text()='Бытовая техника']")).click();
        driver.findElement(By.xpath("//div[@class='subcategories mb--2em']//a[@title='Крупная бытовая техника']")).click();
        driver.findElement(By.xpath("//div[@class='subcategories mb--2em']//a[@title='Духовые шкафы']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='catalog-filter__fieldset catalog-filter__fieldset--gray']"))); //ждет пока элемент станет видимым (появится)
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='catalog-filter__fieldset catalog-filter__fieldset--gray']"))); //ждет пока элемент станет невидимым (исчезнет)

        if(!driver.findElement(By.xpath("//*[@id='catalog-filter-form']//div//div//div/label//input[@value='electrolux' and @data-param-id='brand']")).isSelected())
            driver.findElement(By.xpath("//*[@id='catalog-filter-form']//div//div//div/label//input[@value='electrolux' and @data-param-id='brand']/../..")).click(); //кликает чтобы выделить чекбокс

        System.out.println(driver.findElement(By.xpath("//*[@id='catalog-filter-form']//div//div//div/label//input[@value='electrolux' and @data-param-id='brand']")).isSelected()); //проверяет выбран ли чекбокс
        driver.findElement(By.xpath("//*[@id='catalog-filter-form']//div//div//div/label//input[@value='bosch' and @data-param-id='brand']/../..")).click();
        driver.findElement(By.xpath("//*[@id='catalog-filter-form']//div//div//div/label//input[@value='beko' and @data-param-id='brand']/../..")).click();



//        driver.quit();


    }

}
