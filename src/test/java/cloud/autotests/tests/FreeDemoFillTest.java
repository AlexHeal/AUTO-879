package cloud.autotests.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class FreeDemoFillTest extends TestBase {
    @Test
    void successFillFreeDemo() {
        step("Open FreeDemo page", () -> {
            open("free-demo/klara-consultation");
            $(byTagAndText("h2", "See how Klara can help improve practice efficiency and make patients happier."))
                    .shouldBe(visible);
        });
        step("Fill Book Demo form", () -> {
            $x("//input[@value='Request a demo']").shouldHave(cssClass("disabled-button"));
            $("#FirstName").setValue("Petr");
            $("#LastName").setValue("Ovechkin");
            $("#Email").setValue("pet.ove@gmail.com");
            $("#Phone").setValue("3175831409");
            $("#Company").setValue("Better Health");
            $(byTagAndText("span","Number of Providers")).click();
            $(byTagAndText("li", "11")).click();
            $(byTagAndText("span","Select your EHR/PM System")).click();
            $(byTagAndText("li", "Other")).click();
            $("#Notes").setValue("Test desc text about why need this free demo, mb i don't know... like health and IT");
        });
        step("Verify 'Request a demo' enable", () -> {
            $x("//input[@value='Request a demo']").shouldNotHave(cssClass("disabled-button"));

        });
    }

    @Test
    void focusOnForm() {
        step("Open FreeDemo page", () -> {
            open("free-demo/klara-consultation");
            $(byTagAndText("h2", "See how Klara can help improve practice efficiency and make patients happier."))
                    .shouldBe(visible);
        });
        step("Click 'Get free demo'", () -> {
            $("#form-anchor").click();
            $("#FirstName").shouldBe(focused);
        });

    }
}
