import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ComplexActions {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\QA\\Projects\\testselenium\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.ebay.com/");

        WebElement link = driver.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']//a[text()='Электроника']")); //находим нужный элемент и сохраняем его в переменную
        WebElement element = driver.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']//a[text()='Электроника']")); //находим нужный элемент и сохраняем его в переменную

        Actions actions = new Actions(driver); //создаем переменную класса Actions и ниже вызывем необходимые методы

        actions.moveToElement(link).build().perform(); //2 строки чтобы навести мышку на элемент

        actions.dragAndDrop(element, link).build().perform(); //перетянет один эдемент в другой

        actions.doubleClick(element); //даблклик

        actions.contextClick(element); //имитирует клик правой кнопкой мыши

        actions.clickAndHold(element).moveToElement(link).release().build().perform(); //первым методом зажмет лкм на элементе, затем потянет, затем отпустит

        Action action = actions.clickAndHold(element).moveToElement(link).release().build(); //соберет все действия в короткий код

        action.perform(); //соберет все действия в короткий код



//        driver.quit();
    }

}
