import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public static void test1(){
        System.setProperty("webdriver.chrome.driver","H:\\Programming\\Java\\newProject_1\\Tools\\chromedriver.exe"); //заменить путь с локального на глобальный
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.saucedemo.com/");
        WebElement username_input = driver.findElement(By.xpath("//input[@id='user-name']"));
        WebElement password_input = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        username_input.sendKeys("standard_user");
        password_input.sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        driver.findElement(By.xpath("//button[@id='checkout']")).click();

        WebElement F_name_input = driver.findElement(By.xpath("//input[@id='first-name']"));
        WebElement L_name_input = driver.findElement(By.xpath("//input[@id='last-name']"));
        WebElement Postal_code_input = driver.findElement(By.xpath("//input[@id='postal-code']"));

        F_name_input.sendKeys("test");
        L_name_input.sendKeys("test");
        Postal_code_input.sendKeys("test");

        driver.findElement(By.xpath("//input[@id='continue']")).click();
        driver.findElement(By.xpath("//button[@id='finish']")).click();
    }
}
