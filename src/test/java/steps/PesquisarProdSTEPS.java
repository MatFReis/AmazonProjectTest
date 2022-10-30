package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.ProcurarProdutoPAGE;
import runners.RunCucumber;

public class PesquisarProdSTEPS extends RunCucumber {

    ProcurarProdutoPAGE procurar_prod = new ProcurarProdutoPAGE(driver); // UTILIZANDO OS CONCEITOS DE PAGE OBJECTS, EU BASICAMENTE INSTANCIEI O PRODUTOPAGE DA PASTA PAGES PARA TER ACESSO AO DRIVER

    @Dado("^Que eu vou até o site da Amazon.com")
    public void acessar_site_amazon() {
        procurar_prod.acessarAplicacao();

        // Assert.assertEquals("Não encontrou o texto na DashBoard",true, driver.findElement(By.linkText("Ofertas do Dia")).isDisplayed());
    }

    @Quando("Clico na Search Bar E pesquiso por \"XBOX SERIES S\"")
    public void pesquisar_por_produto_Xbox() {
        procurar_prod.digitar_na_search_bar();

    }

    @Entao("Será me retornado produtos XBOX SERIES S")
    public void devo_ver_produtos_Xbox() {
        procurar_prod.encontrar_produto_xbox();
    }

    @Dado("^que eu entro num produto xbox")
    public void produtos_Xbox(){
        procurar_prod.acessarAplicacao();
        procurar_prod.digitar_na_search_bar();
        procurar_prod.encontrar_produto_xbox();


    }
    @Quando("^ clicar no carrinho")
    public void colocar_no_carrinho(){

    }
    @Então("^ele aparecera no carrinho de compras")
    public void produto_esta_no_carrinho(){


    }


}




