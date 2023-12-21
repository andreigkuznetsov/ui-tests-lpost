package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PromotionsPage {

    private final SelenideElement titleText = $("h1.block-title__text"),
                            pagePromotionsList = $("div.actions.page-promotions__list");

    public PromotionsPage openPromoPage() {
        open("/promotions");
        titleText.shouldHave(Condition.text("Акции")).shouldBe(Condition.visible);
        pagePromotionsList.shouldNot(Condition.empty);
        return this;
    }
}
