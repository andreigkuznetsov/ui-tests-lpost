package pages;

import pages.components.servicesMainMenuSection.TitleAndDescDeliveryPages;

import static com.codeborne.selenide.Selenide.open;

public class DocDeliveryPage {

    TitleAndDescDeliveryPages titleAndDescDeliveryPages = new TitleAndDescDeliveryPages();

    public DocDeliveryPage checkDocDeliveryPage() {
        open("/e-commerce/dostavka-dokumentov");
        titleAndDescDeliveryPages.titleAndDescContent("Доставка документов по России",
                "Предлагаем бизнесу услугу быстрой и качественной доставки документов " +
                        "и корреспонденции курьером или в пункты выдачи по всей России");
        return this;
    }
}
