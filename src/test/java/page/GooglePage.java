package page;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byPartialLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GooglePage {

    private static final String googleUrl = "https://www.google.com/";
    private final String textInput = "crtweb.ru";

    @Step("Открываем google.com")
    public static GooglePage openGooglePage() {
        open(googleUrl);
        return new GooglePage();
    }

    @Step("Вводим в поле поиск значение")
    public GooglePage inputTextToSearch() {
        $(byName("q")).setValue(textInput).pressEnter();
        return this;
    }

    @Step("Ищем необходимый сайт в результатах поиска")
    public CreativePage searchTextFromResults() {
        $(byPartialLinkText(textInput)).click();
        return new CreativePage();
    }






}
