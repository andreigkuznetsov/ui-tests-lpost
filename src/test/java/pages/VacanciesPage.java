package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class VacanciesPage {

    private final SelenideElement titleText = $("h1.block-title__text"),
                            vacanciesList = $("div.vacancies");

    @Step("Открываем страницу Вакансии")
    public VacanciesPage openVacanciesPage() {
        open("/vacancies");
        titleText.shouldHave(Condition.text("Вакансии")).shouldBe(Condition.visible);
        vacanciesList.shouldNot(Condition.empty);
        return this;
    }
}
