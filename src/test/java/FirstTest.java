import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public static void test1(){
        System.setProperty("webdriver.chrome.driver","tools\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.saucedemo.com/");

        WebElement username_input = driver.findElement(By.xpath("//input[@id='user-name']"));
        WebElement password_input = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        username_input.sendKeys("standard_user");
        password_input.sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.cssSelector("#shopping_cart_container > a")).click();
        driver.findElement(By.cssSelector("#checkout")).click();

        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("test");

        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
    }
}
