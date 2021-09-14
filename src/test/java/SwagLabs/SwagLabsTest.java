package SwagLabs;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SwagLabsTest extends SwagSettings {

    @Test
    public void Test1() {
        WebElement body = driver.findElement(By.tagName("body"));
        body.findElement(By.id("login-button")).click();
        body.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
        body.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[3]")).click();

        String sortingBy = body.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/span")).getText();
        String cartCount = body.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText();

        Assert.assertEquals("PRICE (LOW TO HIGH)", sortingBy);
        Assert.assertEquals("1", cartCount);
    }
}





