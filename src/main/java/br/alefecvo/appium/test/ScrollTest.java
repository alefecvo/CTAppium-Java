package br.alefecvo.appium.test;

import br.alefecvo.appium.core.BaseTest;
import br.alefecvo.appium.page.MenuPage;
import br.alefecvo.appium.page.ScrollPage;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ScrollTest extends BaseTest {

    private MenuPage menuPage = new MenuPage();
    private ScrollPage scrollPage = new ScrollPage();

    @Test
    public void deveEncontrarOpcaoEscondidaPorScrollDown(){
        //Scroll para baixo
        menuPage.scrollDown();

        //Acessando opção do menu
        menuPage.acessarOpcaoMenu("Opção bem escondida");

        //Verificar alerta
        Assertions.assertEquals("Sucesso", scrollPage.obterTituloAlerta());
        Assertions.assertEquals("Você achou essa opção", scrollPage.obterMensagemAlerta());
    }

    @Test
    public void deveEncontrarOpcaoAboutPorScrollDown(){
        //Scroll para baixo
        menuPage.scrollDown();

        //Scroll para cima
        menuPage.scrollUp();

        //Acessando opção do menu
        menuPage.acessarOpcaoMenu("About...");

        //Verificar texto
        Assertions.assertTrue(scrollPage.existeMensagem("Testes funcionais de aplicações Android com Appium"));
    }

    @Test
    public void deveEncontrarOpcaoEscondidaScrollPorTexto(){
        //Scroll Down
        menuPage.scrollPorTexto("Opção bem escondida");

        //Acessar menu Opção bem escondida
        menuPage.acessarOpcaoMenu("Opção bem escondida");

        //Verificar alerta
        Assertions.assertEquals("Sucesso", scrollPage.obterTituloAlerta());
        Assertions.assertEquals("Você achou essa opção", scrollPage.obterMensagemAlerta());
    }
}
