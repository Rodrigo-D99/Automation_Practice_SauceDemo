package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import starter.navigation.NavigateTo;
import starter.search.*;


public class SearchStepDefinitions {

    @Given("{actor} opens sauce demo login page")
    public void researchingThings(Actor actor) {
        actor.wasAbleTo(NavigateTo.theSearchHomePage());
    }

    @When("{actor} login with credentials {string} {string}")
    public void searchesFor(Actor actor, String user, String pass) {
        actor.attemptsTo(
                EnterUserCredentials.userName(user).then(EnterUserCredentials.userPass(pass))
                        .then(Click.on(LoginForm.LOGIN_BUTTON)));

    }

    @Then("{actor} click on add product to cart")
    public void should_see_information_about(Actor actor) {
        try {
            actor.attemptsTo(GetProducts.onList());
            Thread.sleep(3000);
            actor.attemptsTo(GetProducts.onList());
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("error");
        }
    }

}


