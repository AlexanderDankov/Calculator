package Tests;

import Pages.SearchPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class IntegerDivision {

    private static WebDriver driver;
    private static SearchPage searchPage;

    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        searchPage = new SearchPage(driver);
    }
    @Test
    public void test1() {

        driver.get("https://www.google.com/");
        searchPage.search("Калькулятор");

    }

    @AfterAll
    public static void teardown() {
        driver.quit();
    }
}

