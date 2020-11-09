package br.alefecvo.appium.core;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;

import static br.alefecvo.appium.core.DriverFactory.getDriver;

public class BasePage {

    public void escrever(By by, String valor){
        //Preencher campos do formulário
        getDriver().findElement(by).sendKeys(valor);
    }

    public void clicarPorTexto(String valor){
        getDriver().findElement(By.xpath("//*[@text='"+valor+"']")).click();
    }

    public void selecionarCombo(By by, String valor){
        //Preencher campos do formulário
        getDriver().findElement(by).click();
        clicarPorTexto(valor);
    }

    public void clicarCheckBox(By by){
        getDriver().findElement(by).click();
    }

    public void clicarSwitch(By by){
        getDriver().findElement(by).click();
    }

    public String obterTexto(By by){
        return getDriver().findElement(by).getText();
    }

    public boolean existeElementoPorText(String valor){
        List<MobileElement> elementos = getDriver().findElements(By.xpath("//*[@text='"+valor+"']"));
        return  elementos.size() > 0;
    }
}
