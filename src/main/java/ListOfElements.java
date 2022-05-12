import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.List;


public class ListOfElements {
    static WebDriver driver;
    private static Object List;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\QA\\Projects\\testselenium\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://7745.by/");
        driver.findElement(By.xpath("//div[@class='header-categories__links header-categories__links--7745']//a[text()='Бытовая техника']")).click();
        driver.findElement(By.xpath("//div[@class='subcategories mb--2em']//a[@title='Крупная бытовая техника']")).click();
        driver.findElement(By.xpath("//div[@class='subcategories mb--2em']//a[@title='Духовые шкафы']")).click();
        driver.findElement(By.xpath("//div[@class='catalog-filter-control catalog-filter-control_more js-show-features-block']//label[@for='isSpoiled-3']")).click();




        List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@class='catalog-filter-popover__inner']//div[@class='catalog-filter-popover__columns catalog-filter-popover__columns_2']//span[@class='i-checkbox__faux']")); //определяет список чекбоксов
//        checkboxes.get(7).click();
        System.out.println(checkboxes.size());

        if(checkboxes.size() == 25) System.out.println("Passed");
        else System.out.println("Failed");

        for (WebElement checkbox : checkboxes){  //цикл для того чтобы прокликать все чекбоксы из нужного списка, не создавая много строк
            checkbox.click();
        }



//        List<WebElement> checkboxes2 = driver.findElements(By.xpath("//*[@id='catalog-filter-form']/div[4]//label[@class='catalog-filter__checkbox-item']"));
//        if(checkboxes2.size() == 3) System.out.println("Passed");
//        else System.out.println("Failed");



//        driver.quit();
    }






}