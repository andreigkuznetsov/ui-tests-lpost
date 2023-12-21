package pages.components.startpage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CalcWidget {

    private final SelenideElement contentContainer = $("div.main-slider__content-container"),
                                mainSliderButton = $(".main-slider__button[href='/calc']");

    public void checkSmallCalcWidget() {
        contentContainer.shouldHave(text("Рассчитать стоимость")).shouldBe(Condition.visible);
        mainSliderButton.shouldHave(text("Калькулятор")).shouldBe(Condition.visible);

    }
}
