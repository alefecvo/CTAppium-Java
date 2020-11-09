package br.alefecvo.appium.test;

import br.alefecvo.appium.core.BaseTest;
import br.alefecvo.appium.page.CliqueLongoPage;
import br.alefecvo.appium.page.MenuPage;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CliqueLongoTest extends BaseTest {

    private MenuPage menuPage = new MenuPage();
    private CliqueLongoPage cliqueLongoPage = new CliqueLongoPage();

    @Test
    public void deveRealizarCliqueLongo(){
        //Acessar menu abas
        menuPage.acessarOpacaoMenu("Cliques");

        cliqueLongoPage.cliqueLongo("Clique Longo");

        Assertions.assertEquals("Clique Longo", cliqueLongoPage.obterTextoCampo());
    }
}
