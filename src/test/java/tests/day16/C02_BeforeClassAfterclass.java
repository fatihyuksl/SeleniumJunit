package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBase;


public class C02_BeforeClassAfterclass extends TestBase {
    @Test
    public void amazonTest() {
        driver.get("https://amazon.com");

    }
    @Test
    public void bestBuyTesti() {
        driver.get("https://www.bestbuy.com");
    }
    @Test
    public void dtechproeducationTesti() {
        driver.get("https://www.techproeducation.com");
    }
}
