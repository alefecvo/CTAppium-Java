package br.alefecvo.appium.test;

import br.alefecvo.appium.core.BaseTest;
import br.alefecvo.appium.page.MenuPage;
import br.alefecvo.appium.page.SwipeListPage;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SwipeListTest extends BaseTest {

    private MenuPage menuPage = new MenuPage();
    private SwipeListPage swipeListPage = new SwipeListPage();

    @Before
    public void acessarTela(){
        menuPage.aguardarMenu();
        menuPage.scrollDown();
        menuPage.acessarOpcaoMenu("Swipe List");
    }

    @Test
    public void deveResolverDesafioSwipeList(){
        //Op 1 para direita
        swipeListPage.swipeElementRight("Opção 1");

        //Op 1 -
        swipeListPage.clicarPorTexto("(-)");

        //Verificar op1 -
        Assertions.assertTrue(swipeListPage.existeElementoPorTexto("Opção 1 (-)"));

        //Op 4 para direita
        swipeListPage.swipeElementRight("Opção 4");

        //Op 4 -
        swipeListPage.clicarPorTexto("(-)");

        //Verificar op4 -
        Assertions.assertTrue(swipeListPage.existeElementoPorTexto("Opção 4 (-)"));

        //Op 5 para esquerda
        swipeListPage.swipeElementLeft("Opção 5 (-)");

        //Verificar op 5
        Assertions.assertTrue(swipeListPage.existeElementoPorTexto("Opção 5"));

    }

}
