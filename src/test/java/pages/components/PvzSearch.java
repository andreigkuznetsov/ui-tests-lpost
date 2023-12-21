package pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class PvzSearch {

    private final SelenideElement cityButtonTitle = $(".map-info__city-button-title"),
                            cityName = $("#city_name"),
                            pvzPointList = $(".point.point__list");

    public void checkPvzSearch(String city) {
        cityButtonTitle.click();
        cityName.setValue(city).pressEnter();
        cityButtonTitle.shouldHave(Condition.text(city));
        pvzPointList.shouldNot(Condition.empty);

    }
}
