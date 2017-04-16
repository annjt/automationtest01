import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver", "E:\\Settings\\Selenium\\geckodriver-v0.15.0-win64\\geckodriver.exe");
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://accounts.chotot.com/login?service=menu&continue=https://www.chotot.com/");
        WebElement elementphone =driver.findElement(By.xpath("//input[@class='form-control']"));
        elementphone.sendKeys("0974308743");
        WebElement elementpass =driver.findElement(By.xpath("//input[@class='_3KENatdNs745x__l9Yj6cS form-control']"));
        elementpass.sendKeys("123456");

        /**
         * '//' La thao tac search text.
         *
         * Phan "//button" hay "//input" la no dang search toi the button or input
         */
        WebElement button=driver.findElement(By.xpath("//button[@class='btn _2eyhSZKQv1uz_RH2pfHrg3']"));
        button.click();
    }
}