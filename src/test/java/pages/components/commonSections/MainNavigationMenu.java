package pages.components.commonSections;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MainNavigationMenu {

    public void MainNavMenu(String selector) {
        $(selector + "[href='/tracking']").shouldHave(text("Отслеживание")).shouldBe(Condition.visible);
        $(selector + "[href='/calc']").shouldHave(text("Калькулятор")).shouldBe(Condition.visible);
        $(selector + "[href='/map']").shouldHave(text("Пункты Л-Пост")).shouldBe(Condition.visible);
        $(selector + "[href='/tariff']").shouldHave(text("Тарифы")).shouldBe(Condition.visible);
        $(selector + "[href='/blog']").shouldHave(text("Блог")).shouldBe(Condition.visible);
        $(selector + "[href='/promotions']").shouldHave(text("Акции")).shouldBe(Condition.visible);
        $(selector + "[href='/support']").shouldHave(text("Поддержка")).shouldBe(Condition.visible);
        $(selector + "[href='/developers']").shouldHave(text("Интеграции")).shouldBe(Condition.visible);
    }
}
