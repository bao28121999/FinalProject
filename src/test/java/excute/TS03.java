package excute;
import common.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
 

public final class TS03 extends CommonBase { 
	@BeforeMethod 
	public void beforeMethod() { 
		openBrowser("Chrome","https://bookbuy.vn/");
		waitForPageLoaded(driver);}
	@AfterMethod
	public void afterMethod() {
		quitDriver(driver);}
	@Test
	public void TC_01() {
		waitForPageLoaded(driver);
		setText(By.id("Term"),"Dac Nhan Tam");
		click(By.xpath("//input[@id='Term']//following-sibling::div[@class='input-group-btn']/button[@class='search button-search']"));
		click(By.id("Term"));
		waitForPageLoaded(driver);}
	@Test
	public void TC_02() {
		click(By.xpath("//button/*[text()='Lập hóa đơn']"));
		waitForPageLoaded(driver);
		setText(By.id("id"),"Dac Nhan Tam");
		setText(By.xpath("//input[contains(@formcontrolname,'buyerName')]"),"Ha Noi");
		setText(By.xpath("//input[contains(@formcontrolname,'buyerName')]"),"Viettel");
		setText(By.xpath("//input[contains(@formcontrolname,'buyerName')]"),"Viettel");
		setText(By.xpath("//input[contains(@formcontrolname,'buyerName')]"),"Ha Noi");
		setText(By.xpath("//input[contains(@formcontrolname,'buyerName')]"),"Viettel");
		setText(By.xpath("//input[contains(@formcontrolname,'buyerName')]"),"Viettel");
		setText(By.id("id"),"Dac Nhan Tam");
		setText(By.xpath("//input[contains(@formcontrolname,'buyerName')]"),"Ha Noi");
		setText(By.xpath("//input[contains(@formcontrolname,'buyerName')]"),"Viettel");
		setText(By.xpath("//input[contains(@formcontrolname,'buyerName')]"),"Viettel");
		setText(By.id("id"),"Dac Nhan Tam");
		setText(By.xpath("//input[contains(@formcontrolname,'buyerName')]"),"Ha Noi");
		setText(By.xpath("//input[contains(@formcontrolname,'buyerName')]"),"Viettel");
		setText(By.xpath("//input[contains(@formcontrolname,'buyerName')]"),"Viettel");
}
}