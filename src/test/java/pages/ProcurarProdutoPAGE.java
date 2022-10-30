package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProcurarProdutoPAGE {

    WebDriver driver;

    public ProcurarProdutoPAGE(WebDriver driver) {

        this.driver = driver;

    }

    public void acessarAplicacao(){
        driver.get("https://www.amazon.com.br/");
        driver.manage().window().maximize();
        Assert.assertEquals("Não encontrou o texto na DashBoard",true, driver.findElement(By.linkText("Ofertas do Dia")).isDisplayed());

    }

    public void digitar_na_search_bar(){

        driver.findElement(By.id("twotabsearchtextbox"))
                .sendKeys("Xbox Series S");
        driver.findElement(By.id("nav-search-submit-button"))
                .click();
    }

    public void encontrar_produto_xbox(){

        String texto_produto_XboxS = driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.s-opposite-dir.sg-row > div.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(3) > div > div > div > div > div.a-section.a-spacing-micro.puis-padding-left-small.puis-padding-right-small > div.a-section.a-spacing-none.a-spacing-top-micro.s-title-instructions-style > h2 > a > span")).getText();

    }

}
