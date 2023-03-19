import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SecondTest {

    @Test
    public void test2(){
        System.setProperty("webdriver.chrome.driver","H:\\Programming\\Java\\newProject_1\\Tools\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.saucedemo.com/");

        WebElement username_input = driver.findElement(By.xpath("//input[@id='user-name']"));
        WebElement password_input = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        WebElement login_button = driver.findElement(By.xpath("//input[@id='login-button']"));

        username_input.sendKeys("test");
        password_input.sendKeys("test");
        login_button.click();
    }
}
