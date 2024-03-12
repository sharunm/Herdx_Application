package Herdx_SourcePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Herxd_Multitag_create extends Herdx_Base {
    // gangappan@pro17analytics.com
    //      Otis@2023
    @Test()
    public void delete_undo() throws InterruptedException {
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
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[@index='4']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[@index='4']"))).sendKeys("Otis@2023");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@index='5']"))).click();
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Update Later'] "))).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@index='1']"))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[@content-desc='As Testt']"))).click();
        //<------------------Total animals------------->
        Thread.sleep(200);
        WebElement total_animals = driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'Total Animals')]"));
        Thread.sleep(200);
        wait.until(ExpectedConditions.visibilityOf(total_animals)).click();
        Thread.sleep(2000);

        WebElement   pens = driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'All Pens')]"));
        pens.click();
        WebElement search= driver.findElement(By.xpath("//android.widget.ImageView[contains(@hint,'Search by')]"));
        search.click();
        search.sendKeys("0609");
Thread.sleep(200);
                WebElement pens_item1_dot= driver.findElement(By.xpath("(//android.widget.ImageView[@index='1'])[3]"));
        pens_item1_dot.click();

        WebElement delete_inven= driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Delete From Inventory']"));
        delete_inven.click();

        WebElement sold= driver.findElement(By.xpath("//android.view.View[@content-desc='Sold']"));
        sold.click();
Thread.sleep(500);
        WebElement next= driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']"));
        next.click();
       // Thread.sleep(2000);
        WebElement red_delete= driver.findElement(By.xpath("//android.widget.Button[@content-desc='Delete']"));
        red_delete.click();
        Thread.sleep(30000);
                WebElement back_arrow= driver.findElement(By.xpath("(//android.widget.ImageView[@index='0'])[1]"));
        wait.until(ExpectedConditions.visibilityOf(back_arrow)).click();


        WebElement delete_tag= driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'Deleted Tags')]"));
        wait.until(ExpectedConditions.visibilityOf(delete_tag)).click();
        WebElement delete_tag_count= driver.findElement(By.xpath("(//android.view.View[contains(@content-desc,'Deleted Tags')])[3]"));
        delete_tag_count.click();

        WebElement search1= driver.findElement(By.xpath("//android.widget.ImageView[contains(@hint,'Search by')]"));
        search1.click();
        Thread.sleep(200);
        search1.sendKeys("0609");


                WebElement three_dot= driver.findElement(By.xpath("(//android.widget.ImageView[@index='1'])[3]"));
        three_dot.click();

        WebElement undo_delete= driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Undo Delete']"));
        undo_delete.click();

        WebElement undo_delete_red= driver.findElement(By.xpath("//android.widget.Button[@content-desc='Undo Delete']"));
        undo_delete_red.click();
        WebElement back_arrow1= driver.findElement(By.xpath("(//android.widget.ImageView[@index='0'])[1]"));
        back_arrow1.click();


    }
    @Test(priority = 1 , enabled = false)
    public void Add_Multi_animals() throws InterruptedException {
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
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[@index='4']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[@index='4']"))).sendKeys("Otis@2023");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@index='5']"))).click();
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Update Later'] "))).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@index='1']"))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[@content-desc='As Testt']"))).click();
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

        WebElement Treatment_Chk = driver.findElement(By.xpath("//android.view.View[@content-desc='Treatments']"));
        wait.until(ExpectedConditions.visibilityOf(Treatment_Chk)).click();
//        Thread.sleep(800);
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
        WebElement Save_Btn_Medicine = driver.findElement(By.xpath("//android.widget.Button[@index='2']"));
        wait.until(ExpectedConditions.visibilityOf(Save_Btn_Medicine)).click();
        Thread.sleep(2000);
//        WebElement  Next_Btn_Treatmentpage = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']"));
//        wait.until(ExpectedConditions.visibilityOf( Next_Btn_Treatmentpage)).click();
//        Thread.sleep(2000);
        WebElement Next_Btn_Treatmentpage1 = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']"));
        wait.until(ExpectedConditions.visibilityOf(Next_Btn_Treatmentpage1)).click();// medicine page
        // Thread.sleep(4000);
        WebElement Next_Btn_Treatmentpage2 = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']"));
        wait.until(ExpectedConditions.visibilityOf(Next_Btn_Treatmentpage2)).click();//dose next
        // Thread.sleep(500);
        WebElement Next_Btn_Treatmentpage3 = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']"));
        wait.until(ExpectedConditions.visibilityOf(Next_Btn_Treatmentpage3)).click();//reminder

        // Thread.sleep(6000);
        WebElement Next_Btn_ReviewNext = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']"));
        wait.until(ExpectedConditions.visibilityOf(Next_Btn_ReviewNext)).click();
        //Thread.sleep(7000);
        WebElement Next_Btn_popup = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']"));
        wait.until(ExpectedConditions.visibilityOf(Next_Btn_popup)).click();
        Thread.sleep(400);
        WebElement Forward_arrow_common = driver.findElement(By.xpath("//android.widget.ImageView[@index='3']"));

        wait.until(ExpectedConditions.visibilityOf(Forward_arrow_common)).click();
        Thread.sleep(100);
        WebElement pen_pastures = driver.findElement(By.xpath("//android.view.View[@content-desc='Pen / Pasture']"));

        wait.until(ExpectedConditions.visibilityOf(pen_pastures)).click();
        WebElement Forward_arrow_common1 = driver.findElement(By.xpath("//android.widget.ImageView[@index='3']"));

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

        WebElement select_multi = driver.findElement(By.xpath("//android.widget.Switch[@index='3']"));
        select_multi.click();


        WebElement From_multi = driver.findElement(By.xpath("//android.widget.EditText[@index='0']"));
        wait.until(ExpectedConditions.visibilityOf(From_multi)).click();
        From_multi.sendKeys("3630");
Thread.sleep(7000);
//        WebElement to_multi = driver.findElement(By.xpath("(//android.view.View[@index='1'])[3]"));
//
//        wait.until(ExpectedConditions.visibilityOf(to_multi)).click();
//

//        to_multi.sendKeys("3635");
//


    }
    @Test(priority = 2, enabled = false)
    public void more_multi_tag() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
        WebElement plus_multi_tag = driver.findElement(By.xpath("//android.widget.ImageView[@index='2']"));
        plus_multi_tag.click();
        WebElement From_multi = driver.findElement(By.xpath("(//android.widget.EditText[@index='0'])[2]"));
        wait.until(ExpectedConditions.visibilityOf(From_multi)).click();
        From_multi.sendKeys("3636");
        Thread.sleep(7000);
     //   WebElement to_multi = driver.findElement(By.xpath("(//android.view.View[@index='1'])[3]"));
//
//        wait.until(ExpectedConditions.visibilityOf(to_multi)).click();
//

//        to_multi.sendKeys("3639");
        WebElement view_summary = driver.findElement(By.xpath("//android.widget.Button[@content-desc='View Summary']"));
        view_summary.click();
        WebElement   Add_animals_to_Inventory = driver.findElement(By.xpath(" //android.widget.Button[@content-desc='Add Animals to Inventory']"));
        Add_animals_to_Inventory.click();
        WebElement   Yes_popup = driver.findElement(By.xpath(" //android.widget.Button[@content-desc='Yes']"));

        Yes_popup.click();
        Thread.sleep(4000);


    }
    @Test(priority = 3, enabled = false )
    public void check_multianimal_added() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
        WebElement unassigned = driver.findElement(By.xpath("(//android.view.View[contains(@content-desc,'Unassigned')])[2]"));

        wait.until(ExpectedConditions.visibilityOf( unassigned)).click();

        WebElement unassigned_count = driver.findElement(By.xpath("(//android.widget.ImageView[@index='0'])[4]"));
        wait.until(ExpectedConditions.visibilityOf(unassigned_count)).click();
        Thread.sleep(2000);
    }
    @Test(priority = 4, enabled = false )
    public void delete_multi_animal() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
        WebElement threedot = driver.findElement(By.xpath("//android.widget.ImageView[@index='3']"));
        wait.until(ExpectedConditions.visibilityOf(threedot)).click();
        Thread.sleep(1000);

        WebElement Select_manual = driver.findElement(By.xpath(" //android.widget.ImageView[@content-desc='Select Animals - Manual']"));
        Select_manual.click();

        WebElement Selectall = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Select All']"));
        wait.until(ExpectedConditions.visibilityOf(Selectall)).click();
        WebElement quick = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Quick Actions']"));
        quick.click();

        WebElement move_to_pen = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Move to Pen / Pasture']"));
        move_to_pen.click();
        Thread.sleep(1000);

        WebElement confirm_move_to_pen = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Confirm']"));
        confirm_move_to_pen.click();

        WebElement select_pen = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Select']"));
        select_pen.click();

                WebElement radio_select = driver.findElement(By.xpath("(//android.widget.ImageView[@index='0'])[3]"));
        radio_select.click();

        WebElement done = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Done']"));
        done.click();
        WebElement move = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Move']"));
        move.click();
//<--------------------To delete multi tag---------------->
//        WebElement deleteall = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Delete From Inventory']"));
//        deleteall.click();
//
//        WebElement accidental = driver.findElement(By.xpath("//android.view.View[@content-desc='Accidental Scan']"));
//        accidental.click();
//        WebElement next = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']"));
//        next.click();
//        WebElement red_delete = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Delete']"));
//        red_delete.click();
//        Thread.sleep(2000);
//        WebElement confirm_delete = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Delete']"));
//        confirm_delete.click();
    }


}