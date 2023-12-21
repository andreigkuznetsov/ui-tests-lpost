package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.components.PvzSearch;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PvzPage {

    private final SelenideElement pvzPageTitle = $(withText("Пункты выдачи Л-Пост"));

    @Step("Открываем страницу с поиском ПВЗ в городе")
    public PvzPage openPvzPage() {
        open("/map");
        pvzPageTitle.should(Condition.exist);
        return this;
    }

    @Step("Проверяем поиск ПВЗ в городе")
    public PvzPage checkPvzPage(String city) {
        new PvzSearch().checkPvzSearch(city);
        return this;
    }
}
