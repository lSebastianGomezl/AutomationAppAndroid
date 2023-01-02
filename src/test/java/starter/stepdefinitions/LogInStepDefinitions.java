package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.questions.LoginQuestion;
import starter.tasks.LoginTask;

import static org.hamcrest.Matchers.equalTo;

public class LogInStepDefinitions {

    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    //Implementado
    private final Actor Samuel = Actor.named("Samuel");

    //Implementado
    @Before
    //public void set_the_stage() {
    //    OnStage.setTheStage(new OnlineCast());
    //}
    public void setUp() {
        Samuel.can(BrowseTheWeb.with(hisMobileDevice));
    }


    @Given("Samuel want to create a new post")
    public void samuel_want_to_create_a_new_post() {

        Samuel.attemptsTo(

        );

    }

    @When("he sends his credentials")
    public void sends_his_credentials() throws InterruptedException {
        Samuel.wasAbleTo(

                LoginTask.in());
                Thread.sleep(4000);

    }

    @Then("He should see title digita la colilla")
    public void should_see_title_digita_la_colilla(){
        String expectedTitle = "Digita la Colilla";
        Samuel.should(
                GivenWhenThen.seeThat("the welcome text", LoginQuestion.value(),
                        equalTo(expectedTitle))
        );
    }
}
