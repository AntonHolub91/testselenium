import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\AQA\\Projects\\testselenium\\drivers\\chromedrivernew.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.onliner.by/");
    }

}
