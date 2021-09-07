package Tests;

import Pages.ControlPage;
import Pages.SearchPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class IntegerDivision {

    private static WebDriver driver;
    private static SearchPage searchPage;
    private static ControlPage controlPage;

    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        searchPage = new SearchPage(driver);
        controlPage = new ControlPage(driver);
    }
    @Test
    @DisplayName("Проверка операций с целыми числами")
    public void test1() {

        driver.get("https://www.google.com/");
        searchPage.search("Калькулятор");
        controlPage.openBracket.click();
        controlPage.one.click();
        controlPage.plus.click();
        controlPage.two.click();
        controlPage.closeBracket.click();
        controlPage.multiply.click();
        controlPage.three.click();
        controlPage.minus.click();
        controlPage.four.click();
        controlPage.zero.click();
        controlPage.divide.click();
        controlPage.five.click();
        controlPage.equals.click();


        assertEquals("1", controlPage.result.getText());


    }

   @AfterAll
    public static void teardown() throws InterruptedException {
       Thread.sleep(4000L);
        driver.quit();
    }
}

