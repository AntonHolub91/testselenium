import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class JavaScriptExecution {

    static WebDriver driver;

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "E:\\QA\\Projects\\testselenium\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("http://en.wikipedia.org");

//        JavascriptExecutor jse = (JavascriptExecutor)driver; //создали экзекьютор скрипта. С помощью этой перееннй будем это делать
//        jse.executeScript("window.scroll(0, 1000)", ""); //js скроллит страницу на 100 пикселей вниз
//        jse.executeScript("window.scroll(0, -1000)", ""); //js скроллит страницу на 100 пикселей вверх


        JavascriptExecutor jse = (JavascriptExecutor)driver; //создали экзекьютор скрипта. С помощью этой перееннй будем это делать
        jse.executeScript("alert('Hello world!');");

        try {
            Thread.sleep(2000); //устанавливает задержку
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.switchTo().alert().accept(); //переключаемся на алерт и аксептим его, если нужно нажать no, юзае dismiss

        driver.get("http://google.com");
        JavascriptExecutor js = (JavascriptExecutor)driver; //создали экзекьютор скрипта. С помощью этой перееннй будем это делать
        jse.executeScript("confirm('Are you sure?');");

        try {
            Thread.sleep(2000); //устанавливает задержку
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.switchTo().alert().dismiss();









//        driver.quit();
    }

}

