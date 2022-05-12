import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Dropdown {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\QA\\Projects\\testselenium\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://7745.by/");
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("XIAOMI Mi Robot Vacuum-Mop 2 STYTJ03ZHM");
        driver.findElement(By.xpath("//button[@class='btn btn-search']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-orange btn-buy']")).click();
        driver.findElement(By.xpath("//a[@id='cart-link']")).click();
        driver.findElement(By.xpath("//*[@id='panel']/div[2]/div[12]/div/div[1]/span[2]")).click();

        WebElement header = driver.findElement(By.xpath("//*[@id='svelte-page']/h1"));
        if (header.getText().contains("Оформление заказа")) {
            System.out.println("Success!");
        } else {
            System.out.println("Failed!");
        }

        WebElement dropdown1 = driver.findElement(By.xpath("//select[@class='select-code-country']"));
        dropdown1.click();
        dropdown1.findElement(By.xpath("//option[text()='+7']")).click();

        WebElement dropdown2 = driver.findElement(By.xpath("//*[@id='svelte-page']/div/div[1]/div[5]/div[1]"));
        dropdown2.click();
        dropdown2.findElement(By.xpath("//option[text()='Предварительная оплата']")).click();

        selectOption("select-code-country", "+375");
//        selectOption("svelte-page", "Предварительная оплата");

        driver.findElement(By.xpath("//*[@id='svelte-page']/div/div[1]/div[6]/div/textarea")).sendKeys("test comment");
    }

        public static void selectOption(String listName, String option){
            String listXpath = String.format("//select[@class='%s']", listName);
            String optionXpath = String.format("//option[text()='%s']", option);
            WebElement dropdown1 = driver.findElement(By.xpath(listXpath));
            dropdown1.click();
            dropdown1.findElement(By.xpath(optionXpath)).click();



//        driver.findElement(By.xpath("//select[@class='select-code-country']")).click();
//        driver.findElement(By.xpath("//option[.='+7']")).click();



//        driver.quit();

    }

}
