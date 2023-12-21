package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.components.AboutPageComponents;

import static com.codeborne.selenide.Selenide.*;

public class AboutPage {

    private final SelenideElement aboutFactsNums = $("div.about-facts__nums");

    AboutPageComponents aboutPageComponents = new AboutPageComponents();

    @Step("Открываем страницу О компании")
    public AboutPage openAboutPage() {
        open("/about");
        aboutPageComponents.checkBlockTitleText("h1", "О Компании");
        return this;
    }

    @Step("Проверяем секцию со статистическими данными о компании")
    public AboutPage checkAboutFactsContent() {
        aboutPageComponents.checkBlockTitleText("h2", "Факты и цифры");
        aboutFactsNums.shouldNot(Condition.empty);
        aboutPageComponents.checkAboutContactsBlock(0);
        aboutPageComponents.checkAboutContactsBlock(1);
        return this;
    }

    @Step("Проверяем секцию реквизитами компании")
    public AboutPage checkContactContent() {
        aboutPageComponents.checkAboutContactsBlock(0);
        aboutPageComponents.checkAboutContactsBlock(1);
        return this;
    }
}
