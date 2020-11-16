package br.alefecvo.appium.test;

import br.alefecvo.appium.core.BaseTest;
import br.alefecvo.appium.page.DragDropPage;
import br.alefecvo.appium.page.MenuPage;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class DragDropTest extends BaseTest {

    private MenuPage menuPage = new MenuPage();
    private DragDropPage dragDropPage = new DragDropPage();

    private String[] estadoInicial = new String[]{"Esta", "é uma lista", "Drag em Drop!", "Faça um clique longo,", "e arraste para", "qualquer local desejado."};
    private String[] estadoIntermediario = new String[]{"é uma lista", "Drag em Drop!", "Faça um clique longo,", "e arraste para", "Esta", "qualquer local desejado."};
    private String[] estadoFinal = new String[]{"Faça um clique longo,","é uma lista", "Drag em Drop!",  "e arraste para", "Esta", "qualquer local desejado."};



    @Before
    public void acessarTela(){
        menuPage.aguardarMenu();
        menuPage.scrollDown();
        //Acessar menu Drag and Drop
        menuPage.acessarOpcaoMenu("Drag and drop");
    }

    @Test
    public void deveEfetuarDragDrop(){
        menuPage.esperar(1000);
        //Verificar estado inicial
        Assertions.assertArrayEquals(estadoInicial, dragDropPage.obterLista());

        //Arrastar "Esta" para "Arraste para"
        dragDropPage.arrastar("Esta","e arraste para");

        //Verificar estado intermediário
        Assertions.assertArrayEquals(estadoIntermediario, dragDropPage.obterLista());

        //arrastar "Faça um clique longo" para "é uma lista"
        dragDropPage.arrastar("Faça um clique longo,","é uma lista");

        //Verificar estado final
        Assertions.assertArrayEquals(estadoFinal, dragDropPage.obterLista());

    }
}
