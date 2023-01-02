package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeView {

    public static Target TITLE_DIGITAL_BUTT = Target.the("Titulo de interfaz colilla").
            located(AppiumBy.id("co.com.pagatodo.core.dataphone.testrelease:id/tvTitleInput"));

}
