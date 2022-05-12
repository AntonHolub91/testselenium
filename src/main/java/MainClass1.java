import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MainClass1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\QA\\Projects\\testselenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://en.wikipedia.org/wiki/Main_Page");

        //для хранения элементов мы используем класс WebElement. Инициализируем (создаем, определяем) переменные данного класса чтобы хранить в них элементы

        WebElement link = driver.findElement(By.linkText("Log in")); //находит ссылку по всему тексту в ней
        WebElement link2 = driver.findElement(By.partialLinkText("Recent")); //находит ссылку по части текста в ней
        WebElement searchfield = driver.findElement(By.name("search")); //находит элемент по атрибуту name
        WebElement searchButton = driver.findElement(By.className("searchButton")); //находит элемент по атрибуту class
        WebElement li = driver.findElement(By.id("ca-viewsource")); //находит элемент по id
        WebElement input = driver.findElement(By.tagName("input")); //не рекомендуется использовать,т.к. теги часто повторяются
        WebElement element = driver.findElement(By.cssSelector("div#simpleSearch input#searchButton")); //находит элемент по css селектору
        WebElement logo = driver.findElement(By.xpath("//div[@id='mw-panel']//div[@id='p-logo']//a")); //находит элемент по xPath

//        System.out.println(element.getText()); //выводит в консоль текс элемента




        driver.quit();
    }

}
