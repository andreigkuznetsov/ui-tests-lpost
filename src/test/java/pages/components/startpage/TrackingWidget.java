package pages.components.startpage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.components.common.PageTitleAndMainContent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TrackingWidget {

    private final SelenideElement trackingButton =  $(".tracking__button");

    public void checkSmallTrackWidget() {
        new PageTitleAndMainContent().checkPageTitleAndVisibleContent("div.main-slider__content-container",
                "#tracking", "Найти заказ");
        trackingButton.shouldHave(text("Найти")).shouldBe(Condition.visible);

    }
}
