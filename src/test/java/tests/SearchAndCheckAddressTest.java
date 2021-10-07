package tests;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SearchAndCheckAddressTest extends TestBase {

    private final List<String> strings = Arrays.asList("Головной офис" +
            "Москва, Пресненская набережная, 12" +
            "Офис разработки" +
            "Тюмень, ул. Малыгина 84 к1, 7 этаж" +
            "+7 (499) 113-68-89" +
            "mail@crtweb.ru");
    private final String googleUrl = "https://www.google.com/";
    private final String textInput = "crtweb.ru";

    @Test
    void searchAndCheckAddressTest() {
        open(googleUrl);
        $(byName("q")).setValue(textInput).pressEnter();
        $(byPartialLinkText(textInput)).click();
        $("[type=checkbox]").click();
        $(byText("контакты")).click();
        $$(".tn-atom").containsAll(strings);
    }
}
