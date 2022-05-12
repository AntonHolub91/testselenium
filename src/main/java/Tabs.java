import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Tabs {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\QA\\Projects\\testselenium\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://javarush.ru/login");

        String mainWindow = driver.getWindowHandle(); //создает переменную с именем окна

        driver.findElement(By.xpath("//a[@id='button_menu_start_learning_unauthorized_user']")).click();

//        for (String windowHandle : driver.getWindowHandles()){
//            driver.switchTo().window(windowHandle);  //циклом переключается на последнее открытое окно
//        }

        for (String tab : driver.getWindowHandles()){
            driver.switchTo().window(tab);
        }

        driver.findElement(By.xpath("//button[text()='Начать']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.switchTo().window(mainWindow); //обратно вернемся к певому окну по имени табы
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bla bla bla");




    }
}
