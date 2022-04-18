import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MainClass {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\QA\\Projects\\testselenium\\drivers\\chromedriver.exe"); //подключает драйвер

        WebDriver driver = new ChromeDriver(); //инициализирует драйвер

//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //old version
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //устанавливает таймер ожидания элемента на странице

        driver.manage().window().maximize(); //устанавливает максимальный размер окна
        driver.manage().window().setSize(new Dimension(900, 500)); //устанавливает размеры окна

        driver.get("https://www.google.com/"); //перейти на нужную страницу
        driver.navigate().to("https://www.onliner.by/"); //другой способ перейти на нужную станицу
        driver.navigate().forward(); //вернуться на предыдущую страницу
        driver.navigate().refresh(); //обновить страницу

        System.out.println(driver.getTitle()); //выводит в консоль тайтл страницы
        System.out.println(driver.getCurrentUrl()); //выводит в консоль адрес страницы

        driver.quit(); //закрывает окно браузера
    }

}