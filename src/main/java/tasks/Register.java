package tasks;

import model.DataUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import userinterface.RegisterInterface;

public class Register implements Task {

    private String strName;
    private String strLastName;
    private String address;
    private String email;
    private String phone;
    private String country;
    private String password;

    public Register(String strName, String strLastName, String address, String email, String phone, String country, String password){
        this.strName = strName;
        this.strLastName = strLastName;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.country = country;
        this.password = password;
    }

    public static Register onThePage(String strName, String strLastName, String address, String email, String phone, String country, String password) {
        return Tasks.instrumented(Register.class, strName,strLastName,address,email,phone,country,password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strName).into(RegisterInterface.INPUT_NAME),
                Enter.theValue(strLastName).into(RegisterInterface.INPUT_LASTNAME),
                Enter.theValue(address).into(RegisterInterface.INPUT_ADDRESS),
                Enter.theValue(email).into(RegisterInterface.INPUT_EMAIL),
                Enter.theValue(phone).into(RegisterInterface.INPUT_PHONE),
                Click.on(RegisterInterface.BUTTON_GENDER),
                Click.on(RegisterInterface.BUTTON_HOBBIES),
                Click.on(RegisterInterface.BUTTON_SELECT_LANGUAGES),
                Click.on(RegisterInterface.BUTTON_LANGUAGE),
                Click.on(RegisterInterface.EMPTY),
                Click.on(RegisterInterface.BUTTON_SELECT_SKILLS),
                Click.on(RegisterInterface.BUTTON_SKILL)
        );
    }
}
