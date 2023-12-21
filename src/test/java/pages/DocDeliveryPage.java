package pages;

import io.qameta.allure.Step;
import pages.components.servicesmenu.TitleAndDescDeliveryPages;

import static com.codeborne.selenide.Selenide.open;

public class DocDeliveryPage {

    TitleAndDescDeliveryPages titleAndDescDeliveryPages = new TitleAndDescDeliveryPages();

    @Step("Открываем страницу с информацией о доставке документов")
    public DocDeliveryPage openDocDeliveryPage() {
        open("/e-commerce/dostavka-dokumentov");
        titleAndDescDeliveryPages.titleAndDescContent("Доставка документов по России",
                "Предлагаем бизнесу услугу быстрой и качественной доставки документов " +
                        "и корреспонденции курьером или в пункты выдачи по всей России");
        return this;
    }
}
