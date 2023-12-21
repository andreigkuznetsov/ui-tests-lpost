package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.components.servicesmenu.DeliverySuggestBlock;
import pages.components.servicesmenu.TitleAndDescDeliveryPages;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class EcomDeliveryPage {

    private final SelenideElement advantagesSectionTitle = $(withText("Отправляйте ваши заказы")),
            advantagesSectionContent = $("section.base-advantages.e-commerce__advantages"),
            deliveryGeographySectionTitle = $(withText("География")),
            deliveryGeographySectionContent = $(".delivery-geography__container.page__container");

    DeliverySuggestBlock deliverySuggestBlock = new DeliverySuggestBlock();

    @Step("Открываем страницу с информацией об услугах для интернет-магазинов")
    public EcomDeliveryPage openEcomDeliveryPage() {
        open("/e-commerce");
        new TitleAndDescDeliveryPages().titleAndDescContent("Доставка для интернет-магазинов по России",
                "Л-Пост предлагает логистические решения " +
                "для интернет-магазинов по доставке заказов клиентам. Доставка осуществляется до двери или до " +
                "одного из собственных пунктов выдачи");
        return this;
    }

    @Step("Проверяем секцию с описанием типов грузов")
    public EcomDeliveryPage checkDeliverySuggestBlock() {
        deliverySuggestBlock.checkDeliverySuggests("Доставка посылок", "Доставляем товары разных категорий", 0);
        deliverySuggestBlock.checkDeliverySuggests("Доставка документов", "Доставляем письма и деловые бумаги", 1);
        return this;
    }

    @Step("Проверяем секцию с описанием преимуществ доставки и ценами")
    public EcomDeliveryPage checkBaseAdvantagesSection() {
        advantagesSectionTitle.should(Condition.exist);
        advantagesSectionContent.shouldBe(Condition.not(Condition.empty));
        deliverySuggestBlock.checkDeliveryPrice(0);
        deliverySuggestBlock.checkDeliveryPrice(1);
        return this;
    }

    @Step("Проверяем секцию с описанием описанием географии покрытия доставкой")
    public EcomDeliveryPage checkGeographyDeliverySection() {
        deliveryGeographySectionTitle.should(Condition.exist);
        deliveryGeographySectionContent.shouldBe(Condition.not(Condition.empty));
        return this;
    }
}
