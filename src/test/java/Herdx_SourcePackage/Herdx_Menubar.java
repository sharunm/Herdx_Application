package Herdx_SourcePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Herdx_Menubar extends Herdx_Base{

    @Test
    public void Menubar_Function() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@index='0']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(" //android.widget.Button[@index='0']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(" //android.widget.Button[@index='0']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[@index='2']"))).click();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[@index='2']"))).sendKeys(" gangappan@pro17analytics.com");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath( "//android.widget.EditText[@index='4']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath( "//android.widget.EditText[@index='4']"))).sendKeys("Otis@2023");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@index='5']"))).click();
       // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Update Later'] "))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@index='1']"))).click();
        Thread.sleep(200);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath( "//android.view.View[@content-desc='As Testt']"))).click();
//<-------------------------------Menu option--------------------------------->

        WebElement menu_icon = driver.findElement(By.xpath("(//android.widget.ImageView[@index='0'])[1]"));
        wait.until(ExpectedConditions.visibilityOf(menu_icon)).click();
//        WebElement dashboard = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Dashboard']"));
//        wait.until(ExpectedConditions.visibilityOf(dashboard)).click();
//
//        WebElement inventory = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Inventory']"));
//        wait.until(ExpectedConditions.visibilityOf(inventory)).click();
        WebElement tasks = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Tasks']"));
        wait.until(ExpectedConditions.visibilityOf(tasks)).click();
        Thread.sleep(2000);
        WebElement back_arrow = driver.findElement(By.xpath("(//android.widget.ImageView[@index='0'])[1]"));
        wait.until(ExpectedConditions.visibilityOf(back_arrow)).click();
        Thread.sleep(200);
        WebElement Area_Monitoring = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Area Monitoring']"));
        wait.until(ExpectedConditions.visibilityOf(Area_Monitoring)).click();
        Thread.sleep(2000);
        WebElement back_arrow1 = driver.findElement(By.xpath("(//android.widget.ImageView[@index='0'])[1]"));
        wait.until(ExpectedConditions.visibilityOf(back_arrow1)).click();
        WebElement Counting_Sessions = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Counting Sessions']"));
        wait.until(ExpectedConditions.visibilityOf(Counting_Sessions)).click();
        Thread.sleep(2000);
        WebElement back_arrow2 = driver.findElement(By.xpath("(//android.widget.ImageView[@index='0'])[1]"));
        wait.until(ExpectedConditions.visibilityOf(back_arrow2)).click();
        WebElement Transfers = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Transfers']"));
        wait.until(ExpectedConditions.visibilityOf(Transfers)).click();
        Thread.sleep(2000);
        WebElement back_arrow3 = driver.findElement(By.xpath("(//android.widget.ImageView[@index='0'])[1]"));
        wait.until(ExpectedConditions.visibilityOf(back_arrow3)).click();
        WebElement Notifications = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Notifications']"));
        wait.until(ExpectedConditions.visibilityOf(Notifications)).click();
        Thread.sleep(2000);
        WebElement back_arrow4 = driver.findElement(By.xpath("(//android.widget.ImageView[@index='0'])[1]"));
        wait.until(ExpectedConditions.visibilityOf(back_arrow4)).click();
        WebElement Settings = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Settings']"));
        wait.until(ExpectedConditions.visibilityOf(Settings)).click();
        Thread.sleep(2000);
        WebElement back_arrow5 = driver.findElement(By.xpath("(//android.widget.ImageView[@index='0'])[1]"));
        wait.until(ExpectedConditions.visibilityOf(back_arrow5)).click();




    }

}
