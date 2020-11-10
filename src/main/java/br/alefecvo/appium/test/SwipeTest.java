package br.alefecvo.appium.test;

import br.alefecvo.appium.core.BaseTest;
import br.alefecvo.appium.page.MenuPage;
import br.alefecvo.appium.page.SwipePage;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SwipeTest extends BaseTest {

    private MenuPage menuPage = new MenuPage();
    private SwipePage swipePage = new SwipePage();

    @Before
    public void acessarTela(){
        menuPage.aguardarMenu();
        menuPage.scrollDown();
        menuPage.acessarOpcaoMenu("Swipe");
    }

    @Test
    public void deveRealizarSwipe(){
        //Verificar texto Swipe 1 ""
        Assertions.assertTrue(swipePage.obterTextoSwipe("Mova a tela para"));
        Assertions.assertTrue(swipePage.obterTextoSwipe("a esquerda"));

        //Swipe para direita
        swipePage.fazerDireita();

        //Verificar texto Swipe 2 "E veja se você consegue
        Assertions.assertTrue(swipePage.obterTextoSwipe("E veja se"));
        Assertions.assertTrue(swipePage.obterTextoSwipe("você consegue"));

        //Swipe para direita
        swipePage.fazerDireita();

        //Verificar texto Swipe 3 "Chegar até o fim!""
        Assertions.assertTrue(swipePage.obterTextoSwipe("Chegar até o fim!"));

        //Swipe para esquerda
        swipePage.fazerEsquerda();

        //Verificar texto Swipe 2 "E veja se você consegue
        Assertions.assertTrue(swipePage.obterTextoSwipe("E veja se"));
        Assertions.assertTrue(swipePage.obterTextoSwipe("você consegue"));

        //Swipe para esquerda
        swipePage.fazerEsquerda();

        //Verificar texto Swipe 1 ""
        Assertions.assertTrue(swipePage.obterTextoSwipe("Mova a tela para"));
        Assertions.assertTrue(swipePage.obterTextoSwipe("a esquerda"));
    }
}
