import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Buttons {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\QA\\Projects\\testselenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.findElement(By.xpath("//input[@id='searchButton']")).click(); //используем метод findElement чтобы найти необходимую кнопку
                                                                             //используем By.xpath чтобы найти неужную кнопку
                                                                             //используем  метод click чтобы нажать на найденную кнопку
        driver.get("https://github.com/");
        WebElement button = driver.findElement(By.xpath("//form[@class='mx-auto mx-md-0 col-5-max js-signup-form position-relative z-2']//button"));
        if (button.getText().equals("Sign up for GitHub")) { //проверяет что текст кнопки совпадает с заданным
//            System.out.println("Success!"); //выводит сообщение Success в консоль
        } else System.out.println("Failed!"); //если текст кнопки не совпадает с заданным, выведет в консоль сообщение Failed

//        System.out.println("Button text is: "+ button.getText()); //проверяем текст кнопки и выводим его в консоль перед нажатием

//        button.submit(); //если button type = "submit", то лучше использовать метод submit a не click

        driver.findElement(By.xpath("//a[@class='HeaderMenu-link flex-shrink-0 no-underline']")).click();

        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).submit();
        System.out.println("Success!");


//        driver.quit();
    }
}
