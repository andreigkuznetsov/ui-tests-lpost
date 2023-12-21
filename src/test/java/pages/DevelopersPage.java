package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class DevelopersPage {

    private final SelenideElement titleText = $("h1.block-title__text"),
                            advantagesSection = $("div.base-advantages__container"),
                            guidelineAndLogoList = $("ul.guideline-and-logo__list");

    private final ElementsCollection blockTitleText = $$("h2.block-title__text");

    @Step("Открываем страницу с описанием интеграций")
    public DevelopersPage openDevPage() {
        open("/developers");
        titleText.shouldHave(Condition.text("Интеграции")).shouldBe(Condition.visible);
        advantagesSection.shouldNot(Condition.empty);
        return this;
    }

    @Step("Проверяем название блока с вариантами интеграций")
    public DevelopersPage checkIntegrationVarBlock() {
        blockTitleText.get(0).shouldHave(Condition.text("Варианты интеграции")).shouldBe(Condition.visible);
        return this;
    }

    @Step("Проверяем название и состав блока с гайдлайнами и логотипами")
    public DevelopersPage checkLogoVarsBlock() {
        blockTitleText.get(1).shouldHave(Condition.text("Гайдлайн и логотипы")).shouldBe(Condition.visible);
        guidelineAndLogoList.shouldNot(Condition.empty);
        return this;
    }
}
