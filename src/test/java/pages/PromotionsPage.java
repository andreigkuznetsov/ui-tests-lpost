package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PromotionsPage {

    private final SelenideElement titleText = $("h1.block-title__text"),
                            pagePromotionsList = $("div.actions.page-promotions__list");

    @Step("Открываем страницу с акциями для клиентов")
    public PromotionsPage openPromoPage() {
        open("/promotions");
        titleText.shouldHave(Condition.text("Акции")).shouldBe(Condition.visible);
        pagePromotionsList.shouldNot(Condition.empty);
        return this;
    }
}
