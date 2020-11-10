package br.alefecvo.appium.page;

import br.alefecvo.appium.core.BasePage;
import br.alefecvo.appium.core.DriverFactory;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;

public class CliquePage extends BasePage {

    public void cliqueLongo(String valor){
        AndroidTouchAction touch = new AndroidTouchAction(DriverFactory.getDriver());
        touch.longPress(LongPressOptions.longPressOptions().withElement(
                ElementOption.element(DriverFactory.getDriver().findElement(By.xpath("//*[@text='"+valor+"']")))))
        .perform();
    }

    public void cliqueDuplo(String valor){
        clicarPorTexto(valor);
        clicarPorTexto(valor);
    }

    public String obterTextoCampo(){
        return DriverFactory.getDriver().findElement(By.xpath("(//android.widget.TextView)[3]")).getText();
    }
}
