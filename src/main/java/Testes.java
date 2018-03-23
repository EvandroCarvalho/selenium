import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Timer;

public class Testes {
    public static void main(String[] args) {
        Timer time = new Timer();
        login("","");
    }

    public static void login(String user, String password){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver browser;
        browser = new ChromeDriver(options);
        browser.get("https://www.algartelecom.com.br/para-voce/");
        WebElement element = browser.findElement(By.xpath("//*[@id=\"activator_5\"]"));
        element.click();
        WebElement fieldUser = browser.findElement(By.xpath("//*[@id=\"idNome\"]"));
        WebElement fieldPassword = browser.findElement(By.xpath("//*[@id=\"idSenha\"]"));
        fieldUser.sendKeys(user);
        fieldPassword.sendKeys(password);
        browser.findElement(By.xpath("/html/body/header/div[3]/div/div[4]/div/div/div[1]/div/div/form/div[4]/button")).submit();
    }

}
