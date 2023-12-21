package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.components.TrackingSearch;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class TrackingPage {

    private final SelenideElement trackingPageTitle = $(withText("Отслеживание заказов"));

    @Step("Открываем страницу отслеживания посылок")
    public TrackingPage openTrackingPage() {
        open("/tracking");
        trackingPageTitle.should(Condition.exist);
        return this;
    }

    @Step("Выполняем проверку работы отслеживания посылок")
    public TrackingPage checkTrackingPage(String trackNumber, String deliveryStatus) {
        new TrackingSearch().checkTrackingSearch(trackNumber, deliveryStatus);
        return this;
    }

}
