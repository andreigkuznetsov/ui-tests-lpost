package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TariffPage {

    private final SelenideElement tariffPageTitle = $(withText("Калькулятор"));

    public TariffPage openTariffPage() {
        open("/tariff");
        tariffPageTitle.should(Condition.exist);
        return this;
    }
}
