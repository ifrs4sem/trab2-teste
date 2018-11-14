package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class EditarProduto {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testEditarProduto() throws Exception {
    driver.get("https://tscanoas2018.000webhostapp.com/index.php/mapos/login");
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("ts11@admin.com");
    driver.findElement(By.name("senha")).clear();
    driver.findElement(By.name("senha")).sendKeys("123456");
    driver.findElement(By.id("formLogin")).submit();
    driver.findElement(By.linkText("Produtos")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='qwe'])[1]/following::i[2]")).click();
    driver.findElement(By.id("unidade")).click();
    driver.findElement(By.id("unidade")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=unidade | ]]
    driver.findElement(By.id("unidade")).clear();
    driver.findElement(By.id("unidade")).sendKeys("a");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Estoque Mínimo'])[1]/following::button[1]")).click();
    driver.findElement(By.id("unidade")).click();
    driver.findElement(By.id("unidade")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=unidade | ]]
    driver.findElement(By.id("unidade")).clear();
    driver.findElement(By.id("unidade")).sendKeys("[");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Estoque Mínimo'])[1]/following::button[1]")).click();
    driver.findElement(By.id("unidade")).click();
    driver.findElement(By.id("unidade")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=unidade | ]]
    driver.findElement(By.id("unidade")).clear();
    driver.findElement(By.id("unidade")).sendKeys("Barra");
    driver.findElement(By.id("descricao")).click();
    driver.findElement(By.id("descricao")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=descricao | ]]
    driver.findElement(By.id("descricao")).clear();
    driver.findElement(By.id("descricao")).sendKeys("haste");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Estoque Mínimo'])[1]/following::button[1]")).click();
    driver.findElement(By.id("precoVenda")).click();
    driver.findElement(By.id("precoVenda")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=precoVenda | ]]
    driver.findElement(By.id("precoVenda")).click();
    driver.findElement(By.id("precoVenda")).clear();
    driver.findElement(By.id("precoVenda")).sendKeys("");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Estoque Mínimo'])[1]/following::button[1]")).click();
    driver.findElement(By.id("precoVenda")).clear();
    driver.findElement(By.id("precoVenda")).sendKeys("10.00");
    driver.findElement(By.id("estoque")).click();
    driver.findElement(By.id("estoque")).clear();
    driver.findElement(By.id("estoque")).sendKeys("-1");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Estoque Mínimo'])[1]/following::button[1]")).click();
    driver.findElement(By.id("estoqueMinimo")).click();
    driver.findElement(By.id("estoqueMinimo")).clear();
    driver.findElement(By.id("estoqueMinimo")).sendKeys("-1");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Estoque Mínimo'])[1]/following::button[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[1]/following::div[1]")).click();
    driver.findElement(By.id("descricao")).click();
    driver.findElement(By.id("descricao")).click();
    driver.findElement(By.id("descricao")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=descricao | ]]
    driver.findElement(By.id("descricao")).clear();
    driver.findElement(By.id("descricao")).sendKeys("");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Estoque Mínimo'])[1]/following::button[1]")).click();
    driver.findElement(By.id("descricao")).clear();
    driver.findElement(By.id("descricao")).sendKeys("haste");
    driver.findElement(By.id("precoCompra")).click();
    driver.findElement(By.id("precoCompra")).clear();
    driver.findElement(By.id("precoCompra")).sendKeys("0.00");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Estoque Mínimo'])[1]/following::button[1]")).click();
    driver.findElement(By.id("precoCompra")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Estoque Mínimo'])[1]/following::button[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Voltar'])[1]/i[1]")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
