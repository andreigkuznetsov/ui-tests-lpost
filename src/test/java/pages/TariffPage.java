package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TariffPage {

    private final SelenideElement tariffPageTitle = $(withText("Калькулятор"));

    @Step("Открываем страницу с информацией о тарифах для клиентов")
    public TariffPage openTariffPage() {
        open("/tariff");
        tariffPageTitle.should(Condition.exist);
        return this;
    }
}
