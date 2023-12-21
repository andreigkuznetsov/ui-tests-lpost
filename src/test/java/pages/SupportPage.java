package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SupportPage {

    private final SelenideElement titleText = $("h1.block-title__text"),
                            trackingSupportBlock = $("div.tracking-supp"),
                            contactSupportBlock = $("div.onlink"),
                            callbackSupportBlock = $("div.callback.page__callback.content-block");

    @Step("Открываем страницу Поддержка")
    public SupportPage openSupportPage() {
        open("/support");
        titleText.shouldHave(Condition.text("Поддержка")).shouldBe(Condition.visible);
        return this;
    }

    @Step("Проверяем блоки с данными для обратной связи")
    public SupportPage checkContactsBlocks() {
        trackingSupportBlock.shouldNot(Condition.empty);
        contactSupportBlock.shouldNot(Condition.empty);
        callbackSupportBlock.shouldNot(Condition.empty);
        return this;
    }
}
