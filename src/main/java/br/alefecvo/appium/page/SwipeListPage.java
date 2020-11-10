package br.alefecvo.appium.page;

import br.alefecvo.appium.core.BasePage;
import br.alefecvo.appium.core.DriverFactory;
import org.openqa.selenium.By;

public class SwipeListPage extends BasePage {

    public void swipeElementLeft(String opcao){
        swipeElement(DriverFactory.getDriver().findElement(By.xpath("//*[@text='"+opcao+"']/..")),0.1,0.9);
    }

    public void swipeElementRight(String opcao){
        swipeElement(DriverFactory.getDriver().findElement(By.xpath("//*[@text='"+opcao+"']/..")),0.9,0.1);
    }
}
