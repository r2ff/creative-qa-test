package page;

import io.qameta.allure.Step;

import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CreativePage {

    private final List<String> strings = Arrays.asList("Головной офис" +
            "Москва, Пресненская набережная, 12" +
            "Офис разработки" +
            "Тюмень, ул. Малыгина 84 к1, 7 этаж" +
            "+7 (499) 113-68-89" +
            "mail@crtweb.ru");

    @Step("Кликаем по 'Меню'")
    public CreativePage clickOnMenu() {
        $("[type=checkbox]").click();
        return this;
    }

    @Step("Кликаем на раздел 'Контакты'")
    public CreativePage searchContactsAndClick() {
        $(byText("контакты")).click();
        return this;
    }

    @Step("Проверяем, что все необходимые данные находятся на странице")
    public void checkDataOnWebPage() {
        $$(".tn-atom").containsAll(strings);
    }

}
