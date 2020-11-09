package br.alefecvo.appium.test;

import br.alefecvo.appium.core.BaseTest;
import br.alefecvo.appium.page.FormularioPage;
import br.alefecvo.appium.page.MenuPage;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FormularioTest extends BaseTest{

    //Declarando classe de menu page
    private MenuPage menuPage = new MenuPage();
    private FormularioPage formularioPage = new FormularioPage();

    @Test
    public void deveRealizarCadastro() {
        //Acessar menu de formulário
        menuPage.acessarOpacaoMenu("Formulário");

        //Preencher campos do formulário
        formularioPage.escreverNome("Alefe");
        formularioPage.selecionarCombo("Nintendo Switch");
        formularioPage.selecionarCheckBox();
        formularioPage.selecionarSwitch();

        //Acionar botão salvar
        formularioPage.clicarBotaoPorTexto("SALVAR");

        //Verificações
        Assertions.assertEquals("Nome: Alefe", formularioPage.obterNome("Nome: Alefe"));
        Assertions.assertEquals("Console: switch", formularioPage.obterConsole("Console:"));
        Assertions.assertTrue(formularioPage.obterValorCheckBox("Marcado"));
        Assertions.assertTrue(formularioPage.obterValorSwitch("Off"));
    }

    @Test
    public void deveRealizarCadastroDemorado() {
        //Acessar menu de formulário
        menuPage.acessarOpacaoMenu("Formulário");

        //Preencher campos do formulário
        formularioPage.escreverNome("Alefe");

        //Acionar botão salvar demorado
        formularioPage.clicarBotaoPorTexto("SALVAR DEMORADO");

        //Espera para identificar se elemento está na tela
        formularioPage.aguardarElementoTela("Nome: Alefe");

        //Verificações
        Assertions.assertEquals("Nome: Alefe", formularioPage.obterNome("Nome: Alefe"));
    }
}
