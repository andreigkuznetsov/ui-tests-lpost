package pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class CalcAction {

    private final SelenideElement cityFromCss = $("#city-from"),
                                cityToCss = $("#city-to"),
                                inputDefaultBtn = $(".input-default__btn"),
    boxWeight = $("#box-weight-0"),
    calcFormSubmit = $(".calc-form__submit"),
    resultCalcResult = $(".result.calc__result"),
    calculationTab = $(".calculation__tab.calculation__tab-courier");

    public void checkCalcAction(String cityFrom, String cityTo, String weight) {
        cityFromCss.sendKeys(cityFrom);
        cityToCss.sendKeys(cityTo);
        inputDefaultBtn.click();
        boxWeight.sendKeys(weight);
        calcFormSubmit.click();
        $(withText("Калькулятор")).should(Condition.exist);
        resultCalcResult.shouldHave(Condition.text(cityFrom)).shouldBe(Condition.visible)
                        .shouldHave(Condition.text(cityTo)).shouldBe(Condition.visible)
                        .shouldHave(Condition.text("xs")).shouldBe(Condition.visible)
                        .shouldHave(Condition.text("30x20x5")).shouldBe(Condition.visible)
                        .shouldHave(Condition.text("см")).shouldBe(Condition.visible)
                        .shouldHave(Condition.text(weight)).shouldBe(Condition.visible)
                        .shouldHave(Condition.text("кг")).shouldBe(Condition.visible)
                        .shouldHave(Condition.text("1")).shouldBe(Condition.visible)
                        .shouldHave(Condition.text("шт")).shouldBe(Condition.visible);
        $(withText("Способ доставки")).should(Condition.exist);
        $(withText("В пункт выдачи")).should(Condition.exist);
        $(withText("2 дня")).should(Condition.exist);
        $(withText("190 ₽")).should(Condition.exist);
        calculationTab.click();
        $(withText("Курьером")).should(Condition.exist);
        $(withText("Завтра")).should(Condition.exist);
        $(withText("345 ₽")).should(Condition.exist);
    }
}
