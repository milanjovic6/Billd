import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.Zip;

import java.security.Key;

public class Enrollment {

    private static WebDriver driver;

    public Enrollment(WebDriver mainDriver) {
        driver=mainDriver;
    }
    //Legal Business Name
    private static WebElement LegalBusinessNameEnroll(){
        return driver.findElement(By.cssSelector("#legalBusinessName"));
    }
    //Street
    private static WebElement Street(){
        return driver.findElement(By.cssSelector("#street"));
    }
    //City
    private static WebElement City(){
        return driver.findElement(By.xpath("//*[@id=\"city\"]"));
    }
  /* State
   private static WebElement State(){
        return driver.findElement(By.xpath("//*[@id=\"mat-select-value-1\"]"));

    }*/
    //Zip
    private static WebElement Zip(){
        return driver.findElement(By.cssSelector("#zip"));
    }
    //Website
    private static WebElement Website(){
        return driver.findElement(By.cssSelector("#website"));
    }//Annual Revenue
    /*private static WebElement AnnualRevenue(){
        return driver.findElement(By.xpath("//*[@id=\"mat-select-value-3\"]/span"));
    }*/
    //Owner First Name
    private static WebElement Guarantor_Owner_FirstName(){
        return driver.findElement(By.cssSelector("#ownerFirstName"));
    }
    //Owner Last Name
    private static WebElement Guarantor_Owner_LastName(){
        return driver.findElement(By.cssSelector("#ownerLastName"));
    }
    //Date M
    /*private static WebElement DateOfBirth_Month(){
        return driver.findElement(By.cssSelector(""));
    }
    //Date D
    private static WebElement DateOfBirth_Day(){
        return driver.findElement(By.cssSelector(""));
    }
    //Date Y
    private static WebElement DateOfBirth_Year(){
        return driver.findElement(By.cssSelector(""));
    }*/
    //Owner Street
    private static WebElement Guarantor_Owner_Street(){
        return driver.findElement(By.cssSelector("#street"));
    }
    //Owner City
    private static WebElement Guarantor_Owner_City(){
        return driver.findElement(By.xpath("//*[@id=\"city\"]"));
    }

    private static WebElement Guarantor_Owner_Zip(){
        return driver.findElement(By.cssSelector("#zip"));
    }
    //State for Company
    public void GetState(String s){
        City().sendKeys(Keys.TAB, Keys.SPACE, s, Keys.SPACE, Keys.SPACE);
    }
    //Annual for Company
    public void GetAnnualRevenue(String s){
        Website().sendKeys(Keys.TAB, Keys.SPACE, s, Keys.SPACE, Keys.SPACE,Keys.SPACE);
    }
    //Date M
    public WebElement GetDateOfBirth_Month() {
        Guarantor_Owner_LastName().sendKeys(Keys.TAB, Keys.SPACE, Keys.SPACE,Keys.TAB, Keys.SPACE, Keys.SPACE, Keys.TAB, Keys.SPACE, Keys.SPACE, Keys.SPACE);
        return null;
    }
    //Date D
    public WebElement GetDateOfBirth_Day(){
        GetDateOfBirth_Month().sendKeys(Keys.TAB, Keys.SPACE, Keys.SPACE);
        return null;
    }
    //Date Y
    public WebElement GetDateOfBirth_Year(){
        GetDateOfBirth_Day().sendKeys(Keys.TAB, Keys.SPACE, Keys.SPACE);
        return null;
    }
    public void Owner_Street(){
        GetDateOfBirth_Year().sendKeys(Keys.TAB, Keys.SPACE, Keys.SPACE);
    }

    public void GetOwnerState(String s){
        City().sendKeys(Keys.TAB, Keys.SPACE, s, Keys.SPACE);
    }

    private static WebElement Nextbtn(){
        return driver.findElement(By.xpath("/html/body/app-root/body/div/app-create-enroll-contact/div/div/div[2]/button/span[1]"));
    }



    //Input methods
    public void InputStreet(String s){
        Street().sendKeys(s);
    }
    public void InputCity(String s){
        City().sendKeys(s);
    }
    public void InputWebsite(String s){
        Website().sendKeys(s);
    }
    public void InputZip(String s){
        Zip().sendKeys(s);
    }
    public void InputOwnerFirstName(String s){
        Guarantor_Owner_FirstName().sendKeys(s);
    }
    public void InputOwnerLastName(String s){
        Guarantor_Owner_LastName().sendKeys(s);
    }
    public void InputOwnerStreet(String s){
        Guarantor_Owner_Street().sendKeys(s);
    }
    public void InputOwnerCity(String s){
        Guarantor_Owner_City().sendKeys(s);
    }
    public void InputOwnerZip(String s){
       Guarantor_Owner_Zip().sendKeys(s);
    }
    public void ClickNext(){
        Nextbtn().click();
    }



}



