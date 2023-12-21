package pages;

import io.qameta.allure.Step;
import pages.components.servicesMainMenuSection.TitleAndDescDeliveryPages;

import static com.codeborne.selenide.Selenide.open;

public class ParcelDeliveryPage {

    TitleAndDescDeliveryPages titleAndDescDeliveryPages = new TitleAndDescDeliveryPages();

    @Step("Открываем страницу с информацией о доставке посылок")
    public ParcelDeliveryPage openParcelDeliveryPage() {
        open("/e-commerce/dostavka-posylok");
        titleAndDescDeliveryPages.titleAndDescContent("Доставка посылок по России",
                "Предлагаем бизнесу услугу быстрой и " +
                        "качественной доставки посылок курьером или в пункты выдачи по всей России");
        return this;
    }
}
