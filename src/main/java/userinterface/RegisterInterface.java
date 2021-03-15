package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterInterface extends PageObject {
    public static final Target INPUT_NAME = Target.the("Nombre")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input"));
    public static final Target INPUT_LASTNAME = Target.the("Apellido")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input"));
    public static final Target INPUT_ADDRESS = Target.the("Direccion")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea"));
    public static final Target INPUT_EMAIL = Target.the("Correo")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input"));
    public static final Target INPUT_PHONE = Target.the("Telefono")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[4]/div/input"));
    public static final Target BUTTON_GENDER = Target.the("Genero")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[1]/input"));
    public static final Target BUTTON_HOBBIES = Target.the("Pasatiempo")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[6]/div/div[2]/input"));
    public static final Target BUTTON_SELECT_LANGUAGES = Target.the("Seleccionar idioma")
            .located(By.id("msdd"));
    public static final Target BUTTON_LANGUAGE = Target.the("Idioma español")
            .located(By.xpath(("/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[2]/ul/li[35]/a")));
    public static final Target EMPTY = Target.the("Espacio vacio")
            .located(By.xpath("/html/body/section/div/div"));
    public static final Target BUTTON_SELECT_SKILLS = Target.the("Seleccionar habilidad")
            .located(By.id("Skills"));
    public static final Target BUTTON_SKILL = Target.the("Habilidad")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[8]/div/select/option[5]"));
    public static final Target BUTTON_SELECT_COUNTRY = Target.the("Seleccionar pais")
            .located(By.id("countries"));
    public static final Target BUTTON_COUNTRY = Target.the("Colombia")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[9]/div/select/option[53]"));
    public static final Target BUTTON_COUNTRY2 = Target.the("Pais")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[10]/div/span/span[1]/span"));
    public static final Target INPUT_COUNTRY = Target.the("United State")
            .located(By.xpath("/html/body/span/span/span[1]/input"));
    public static final Target BUTTON_SELECT_YEAR = Target.the("Seleccionar año")
            .located(By.id("yearbox"));
    public static final Target BUTTON_YEAR = Target.the("Año")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[1]/select/option[79]"));
    public static final Target BUTTON_SELECT_MONTH = Target.the("Seleccionar mes")
            .located((By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[2]/select")));
    public static final Target BUTTON_MONTH = Target.the("mes")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[2]/select/option[6]"));
    public static final Target BUTTON_SELECT_DAY = Target.the("Seleccionar dia")
            .located(By.id("daybox"));
    public static final Target BUTTON_DAY = Target.the("Dia")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[3]/select/option[16]"));
    public static final Target INPUT_PASS = Target.the("Contraseña")
            .located(By.id("firstpassword"));
    public static final Target INPUT_PASS2 = Target.the("Contraseña")
            .located(By.id("secondpassword"));
    public static final Target BUTTON_SUBMIT = Target.the("Enviar")
            .located(By.id("submitbtn"));
}
