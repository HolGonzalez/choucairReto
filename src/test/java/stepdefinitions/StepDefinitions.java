package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import model.DataUser;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.OpenUp;
import tasks.Register;

import java.util.List;

public class StepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^registrar usuario correctamente en la plataforma$")
    public void registerPlatform(List<DataUser> dataUser) throws Exception{
        OnStage.theActorCalled("user").wasAbleTo(OpenUp.thePage(),
                (Register.onThePage(dataUser.get(0).getStrName(),dataUser.get(0).getStrLastName(),dataUser.get(0).getAddress(),
                        dataUser.get(0).getEmail(),dataUser.get(0).getCountry(),dataUser.get(0).getPassword(), dataUser.get(0).getPhone())));
    }
}
