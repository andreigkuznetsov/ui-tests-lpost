package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.components.CalcAction;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CalcPage {

    private final SelenideElement calcPageTitle = $(withText("Калькулятор")),
                            calcGuideList = $("ul.calc-guide__list");

    @Step("Открываем страницу с калькулятором стоимости перевозки")
    public CalcPage openCalcPage() {
        open("/calc");
        calcPageTitle.should(Condition.exist);
        calcGuideList.shouldNot(Condition.empty);
        return this;
    }

    @Step ("Выполняем проверку работы калькулятора")
    public CalcPage checkCalcPage(String cityFrom, String cityTo, String weight) {
        new CalcAction().checkCalcAction(cityFrom, cityTo, weight);
        return this;
    }
}
