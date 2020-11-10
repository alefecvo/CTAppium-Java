package br.alefecvo.appium.test;

import br.alefecvo.appium.page.AbaPage;
import br.alefecvo.appium.page.MenuPage;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AbaTest {

    private MenuPage menuPage = new MenuPage();
    private AbaPage abaPage = new AbaPage();

    @Before
    public void acessarTela(){
        //Acessar menu abas
        menuPage.acessarOpcaoMenu("Abas");
    }

    @Test
    public void deveInteragirComAbas(){
        //Verificar que está na aba 1
        Assertions.assertTrue(abaPage.obterMensagemAba("Este é o conteúdo da Aba 1"));

        //Acessar aba 2
        abaPage.clicarAbaPorTexto("ABA 2");

        //Verificar que está na aba 2
        Assertions.assertTrue(abaPage.obterMensagemAba("Este é o conteúdo da Aba 2"));
    }
}
