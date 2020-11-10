package br.alefecvo.appium.test;

import br.alefecvo.appium.core.BaseTest;
import br.alefecvo.appium.page.CliquePage;
import br.alefecvo.appium.page.MenuPage;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CliqueTest extends BaseTest {

    private MenuPage menuPage = new MenuPage();
    private CliquePage cliquePage = new CliquePage();

    @Before
    public void acessarTela(){
        //Acessar menu Cliques
        menuPage.acessarOpcaoMenu("Cliques");
    }

    @Test
    public void deveRealizarCliqueLongo(){
        //Clique longo
        cliquePage.cliqueLongo("Clique Longo");

        Assertions.assertEquals("Clique Longo", cliquePage.obterTextoCampo());
    }

    @Test
    public void deveRealizarCliqueDuplo(){
        cliquePage.cliqueDuplo("Clique duplo");

        Assertions.assertEquals("Duplo Clique", cliquePage.obterTextoCampo());
    }
}
