package pages.components.servicesMainMenuSection;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class TitleAndDescDeliveryPages {

    private final SelenideElement bannerTitle = $("h1.delivery-banner__title-text"),
            bannerText = $("div.delivery-banner__text");

    public void titleAndDescContent(String titleValue, String descValue) {
        bannerTitle.shouldHave(Condition.text(titleValue)).should(Condition.visible);
        bannerText.shouldHave(Condition.text(descValue)).should(Condition.visible);
    }
}
