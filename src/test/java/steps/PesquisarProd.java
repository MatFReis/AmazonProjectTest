package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PesquisarProd {

    WebDriver driver = new ChromeDriver();

    @Dado("^Que eu vou até o site da Amazon\\.com$")
    public void que_eu_vou_até_o_site_da_Amazon_com() throws Throwable {
        driver.get("https://www.amazon.com.br/");
        throw new PendingException();
    }

    @Quando("^Clico na Search Bar$")
    public void clico_na_Search_Bar() throws Throwable {
        driver.findElement(By.id("#twotabsearchtextbox"))
                .sendKeys("Xbox Series S");
        throw new PendingException();
    }

    @Quando("^pesquiso por \"([^\"]*)\"$")
    public void pesquiso_por(String arg1) throws Throwable {
        driver.findElement(By.id("#twotabsearchtextbox"))
                .sendKeys("Xbox Series S");
        throw new PendingException();
    }

    @Entao("^Será me retornado produtos XBOX SERIES S$")
    public void será_me_retornado_produtos_XBOX_SERIES_S() throws Throwable {
        String valor_pesquisa = "Console Xbos Series S";
        driver.findElement(By.id("#search > div.s-desktop-width-max.s-desktop-content.s-opposite-dir.sg-row > div.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(6) > div > div > div > div > div.a-section.a-spacing-small.puis-padding-left-small.puis-padding-right-small > div.a-section.a-spacing-none.a-spacing-top-small.s-title-instructions-style > h2 > a > span")).getText();
        Assert.assertEquals("Text",valor_pesquisa);

        throw new PendingException();
    }


}




