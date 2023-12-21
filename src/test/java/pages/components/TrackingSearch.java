package pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class TrackingSearch {

    private final SelenideElement orderNumber = $("#order-number"),
                            trackingInfoContent = $(".tracking-info__content"),
                            statusHistory = $(".status-history");

    private final ElementsCollection trackingInfoTitle = $$(".tracking-info__title"),
                            trackingInfoItem = $$(".tracking-info__item");

    public void checkTrackingSearch(String trackNumber, String deliveryStatus) {
        orderNumber.setValue(trackNumber).pressEnter();
        $(withText("Заказ № " + trackNumber)).should(Condition.exist);
        trackingInfoTitle.get(0).shouldHave(Condition.text("О заказе")).shouldBe(Condition.visible);
        trackingInfoItem.get(0).shouldHave(Condition.text("Статус доставки")).shouldBe(Condition.visible);
        trackingInfoItem.get(0).shouldHave(Condition.text(deliveryStatus)).shouldBe(Condition.visible);
        trackingInfoContent.shouldBe(Condition.not(Condition.empty));
        trackingInfoTitle.get(1).shouldHave(Condition.text("История отправления")).shouldBe(Condition.visible);
        statusHistory.shouldBe(Condition.not(Condition.empty));
    }
}
