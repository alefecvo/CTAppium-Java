package br.alefecvo.appium.test;

import br.alefecvo.appium.core.BaseTest;
import br.alefecvo.appium.page.AccordionPage;
import br.alefecvo.appium.page.MenuPage;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AccordionTest extends BaseTest {

    private MenuPage menuPage = new MenuPage();
    private AccordionPage accordionPage = new AccordionPage();

    @Before
    public void acessarTela(){
        //Acessar menu Accordion
        menuPage.acessarOpcaoMenu("Accordion");
    }

    @Test
    public void deveInteragirComAccordion(){
        //Clique em opção 1
        accordionPage.clicarBotaoPorTexto("Opção 1");

        //Verificar texto opção 1
        Assertions.assertTrue(accordionPage.obterTextoOpcao("Esta é a descrição da opção 1"));
    }
}
