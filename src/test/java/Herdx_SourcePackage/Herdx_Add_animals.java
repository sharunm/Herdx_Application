package Herdx_SourcePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Herdx_Add_animals extends Herdx_Base{
    // gangappan@pro17analytics.com
    //      Otis@2023
    @Test
    public void Add_animals_Function() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@index='0']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(" //android.widget.Button[@index='0']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(" //android.widget.Button[@index='0']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[@index='2']"))).click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[@index='2']"))).sendKeys(" gangappan@pro17analytics.com");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath( "//android.widget.EditText[@index='4']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath( "//android.widget.EditText[@index='4']"))).sendKeys("Otis@2023");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@index='5']"))).click();
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Update Later'] "))).click();
       Thread.sleep(200);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@index='1']"))).click();
        Thread.sleep(200);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath( "//android.view.View[@content-desc='As Testt']"))).click();
        //<------------------Total animals------------->
        Thread.sleep(200);
        WebElement total_animals = driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'Total Animals')]"));
        Thread.sleep(200);
        wait.until(ExpectedConditions.visibilityOf(total_animals)).click();
        Thread.sleep(2000);
        WebElement plus_icon = driver.findElement(By.xpath("(//android.widget.ImageView[@index='1'])[1]"));
        wait.until(ExpectedConditions.visibilityOf(plus_icon)).click();
Thread.sleep(1000);
        WebElement add_animals = driver.findElement(By.xpath("//android.widget.ImageView[@index='0']"));
        wait.until(ExpectedConditions.visibilityOf(add_animals)).click();
        Thread.sleep(100);
        WebElement Manual_entry = driver.findElement(By.xpath("//android.widget.ImageView[@index='7']"));
        wait.until(ExpectedConditions.visibilityOf(Manual_entry)).click();
Thread.sleep(800);
        WebElement Treatment_Chk = driver.findElement(By.xpath("//android.view.View[@content-desc='Treatments']"));
        wait.until(ExpectedConditions.visibilityOf(Treatment_Chk)).click();
        Thread.sleep(800);
        WebElement Treatment_forwardarrow = driver.findElement(By.xpath("//android.widget.ImageView[@index='3']"));
        wait.until(ExpectedConditions.visibilityOf(Treatment_forwardarrow)).click();

        WebElement add_Treatment = driver.findElement(By.xpath("(//android.widget.ImageView[@index='0'])[2]"));
        wait.until(ExpectedConditions.visibilityOf(add_Treatment)).click();
        WebElement Treatment_Type = driver.findElement(By.xpath("(//android.widget.ImageView[@index='1'])[3]"));
        wait.until(ExpectedConditions.visibilityOf(Treatment_Type)).click();

        WebElement antibiotic = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Antibiotics']"));
        wait.until(ExpectedConditions.visibilityOf(antibiotic)).click();
        WebElement Treatment_Back = driver.findElement(By.xpath("//android.widget.ImageView[@index='0']"));
        wait.until(ExpectedConditions.visibilityOf(Treatment_Back)).click();
        WebElement Treatment_Next = driver.findElement(By.xpath("//android.widget.Button[@index='1']"));
        wait.until(ExpectedConditions.visibilityOf(Treatment_Next)).click();
        WebElement add_icon_Medicine = driver.findElement(By.xpath("(//android.widget.ImageView[@index='2'])[2]"));
        wait.until(ExpectedConditions.visibilityOf(add_icon_Medicine)).click();
        Thread.sleep(500);
        WebElement select_Medicine = driver.findElement(By.xpath("//android.widget.ImageView[@index='3']"));
        wait.until(ExpectedConditions.visibilityOf(select_Medicine)).click();
        WebElement abc_chk_Clk = driver.findElement(By.xpath("//android.widget.ImageView[@index='4']"));
        wait.until(ExpectedConditions.visibilityOf(abc_chk_Clk)).click();
        WebElement medicine_Back = driver.findElement(By.xpath("(//android.widget.ImageView[@index='0'])[1]"));
        wait.until(ExpectedConditions.visibilityOf(medicine_Back)).click();
        Thread.sleep(10000);
//        WebElement  Amount_Dosage = driver.findElement(By.xpath("//android.widget.EditText[@index='6']"));
//        wait.until(ExpectedConditions.visibilityOf( Amount_Dosage)).click();
//        WebElement  Duration = driver.findElement(By.xpath("//android.widget.EditText[@index='8'"));
//        wait.until(ExpectedConditions.visibilityOf( Duration)).click();
//        wait.until(ExpectedConditions.visibilityOf( Duration)).sendKeys("2");
       driver.hideKeyboard();
        WebElement  Save_Btn_Medicine = driver.findElement(By.xpath("//android.widget.Button[@index='2']"));
        wait.until(ExpectedConditions.visibilityOf(Save_Btn_Medicine)).click();
Thread.sleep(2000);
//        WebElement  Next_Btn_Treatmentpage = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']"));
//        wait.until(ExpectedConditions.visibilityOf( Next_Btn_Treatmentpage)).click();
//        Thread.sleep(2000);
        WebElement  Next_Btn_Treatmentpage1 = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']"));
        wait.until(ExpectedConditions.visibilityOf( Next_Btn_Treatmentpage1)).click();// medicine page
       // Thread.sleep(4000);
        WebElement  Next_Btn_Treatmentpage2 = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']"));
        wait.until(ExpectedConditions.visibilityOf( Next_Btn_Treatmentpage2)).click();//dose next
       // Thread.sleep(500);
        WebElement  Next_Btn_Treatmentpage3 = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']"));
        wait.until(ExpectedConditions.visibilityOf( Next_Btn_Treatmentpage3)).click();//reminder

       // Thread.sleep(6000);
        WebElement  Next_Btn_ReviewNext = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']"));
        wait.until(ExpectedConditions.visibilityOf(Next_Btn_ReviewNext)).click();
       //Thread.sleep(7000);
        WebElement  Next_Btn_popup = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']"));
        wait.until(ExpectedConditions.visibilityOf(Next_Btn_popup)).click();
Thread.sleep(400);
        WebElement  Forward_arrow_common = driver.findElement(By.xpath("//android.widget.ImageView[@index='3']"));

        wait.until(ExpectedConditions.visibilityOf(Forward_arrow_common)).click();
Thread.sleep(100);
        WebElement  pen_pastures = driver.findElement(By.xpath("//android.view.View[@content-desc='Pen / Pasture']"));

        wait.until(ExpectedConditions.visibilityOf(pen_pastures)).click();
        WebElement  Forward_arrow_common1 = driver.findElement(By.xpath("//android.widget.ImageView[@index='3']"));

        wait.until(ExpectedConditions.visibilityOf(Forward_arrow_common1)).click();

        Thread.sleep(1000);
        WebElement  EPC_Prefix = driver.findElement(By.xpath("//android.widget.Button[@index='1']"));
        wait.until(ExpectedConditions.visibilityOf( EPC_Prefix)).click();
Thread.sleep(100);
        WebElement  EPC_option_2 = driver.findElement(By.xpath("(//android.view.View[@index='1'])[1]"));
        wait.until(ExpectedConditions.visibilityOf( EPC_option_2)).click();
        WebElement  select_drop_EPC = driver.findElement(By.xpath("(//android.widget.Button[@index='0'])[2]"));
        wait.until(ExpectedConditions.visibilityOf( select_drop_EPC)).click();
        WebElement  option4_drop_EPC = driver.findElement(By.xpath("//android.view.View[@content-desc='99977149481']"));
        wait.until(ExpectedConditions.visibilityOf( option4_drop_EPC)).click();

        WebElement  EPC_4digit = driver.findElement(By.xpath(" //android.widget.EditText[@index='1']"));
        wait.until(ExpectedConditions.visibilityOf( EPC_4digit)).click();
        wait.until(ExpectedConditions.visibilityOf( EPC_4digit)).sendKeys("4556");
        driver.hideKeyboard();

        WebElement  select_pen = driver.findElement(By.xpath(" //android.widget.ImageView[@content-desc='Select']"));
        wait.until(ExpectedConditions.visibilityOf(select_pen)).click();


        WebElement  new_test = driver.findElement(By.xpath(" //android.widget.ImageView[contains(@content-desc,'new test')]"));
        wait.until(ExpectedConditions.visibilityOf(new_test)).click();

        WebElement  select_enclo_done = driver.findElement(By.xpath(" //android.widget.Button[@content-desc='Done']"));
        wait.until(ExpectedConditions.visibilityOf(select_enclo_done)).click();
        WebElement  save = driver.findElement(By.xpath(" //android.widget.Button[@content-desc='Save']"));
        wait.until(ExpectedConditions.visibilityOf(save)).click();

        WebElement  tap_add_animal= driver.findElement(By.xpath("//*[contains(@content-desc,'Tap to scan Animals')]"));
        wait.until(ExpectedConditions.visibilityOf(tap_add_animal)).click();
        WebElement  EPC_Prefix1 = driver.findElement(By.xpath("//android.widget.Button[@index='1']"));
        wait.until(ExpectedConditions.visibilityOf( EPC_Prefix1)).click();
        Thread.sleep(200);
        WebElement  EPC_option_21 = driver.findElement(By.xpath("(//android.view.View[@index='1'])[1]"));
        wait.until(ExpectedConditions.visibilityOf( EPC_option_21)).click();
        Thread.sleep(200);
        WebElement  select_drop_EPC1 = driver.findElement(By.xpath("(//android.widget.Button[@index='0'])[2]"));
        wait.until(ExpectedConditions.visibilityOf( select_drop_EPC1)).click();
        Thread.sleep(200);
        WebElement  option4_drop_EPC1 = driver.findElement(By.xpath("//android.view.View[@content-desc='99977149481']"));
        wait.until(ExpectedConditions.visibilityOf( option4_drop_EPC1)).click();

        WebElement  EPC_4digit1 = driver.findElement(By.xpath(" //android.widget.EditText[@index='1']"));
        wait.until(ExpectedConditions.visibilityOf( EPC_4digit1)).click();
        wait.until(ExpectedConditions.visibilityOf( EPC_4digit1)).sendKeys("4509");
        driver.hideKeyboard();
        WebElement  select_pen1 = driver.findElement(By.xpath(" //android.widget.ImageView[@content-desc='Select']"));
        wait.until(ExpectedConditions.visibilityOf(select_pen1)).click();


        WebElement  new_test1 = driver.findElement(By.xpath(" //android.widget.ImageView[contains(@content-desc,'new test')]"));
        wait.until(ExpectedConditions.visibilityOf(new_test1)).click();
        WebElement  select_enclo_done2 = driver.findElement(By.xpath(" //android.widget.Button[@content-desc='Done']"));
        wait.until(ExpectedConditions.visibilityOf(select_enclo_done2)).click();
        WebElement  save1 = driver.findElement(By.xpath(" //android.widget.Button[@content-desc='Save']"));
        wait.until(ExpectedConditions.visibilityOf(save1)).click();
        WebElement  View_summary = driver.findElement(By.xpath(" //android.widget.Button[@content-desc='View Summary']"));
        wait.until(ExpectedConditions.visibilityOf(View_summary)).click();
Thread.sleep(2000);
        WebElement   Add_animals_to_Inventory = driver.findElement(By.xpath(" //android.widget.Button[@content-desc='Add Animals to Inventory']"));
        wait.until(ExpectedConditions.visibilityOf( Add_animals_to_Inventory)).click();
        WebElement   popup_yes = driver.findElement(By.xpath(" //android.widget.Button[@content-desc='Yes']"));
        wait.until(ExpectedConditions.visibilityOf( popup_yes)).click();




    }
}
