package pages.components.servicesMainMenuSection;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class DeliverySuggestBlock {

    private final ElementsCollection deliverySuggestTitle = $$(".delivery-suggest-block__title"),
                                    deliverySuggestText = $$(".delivery-suggest-block__text"),
                                    deliveryPriceItem = $$(".delivery-price__item");

    public void checkDeliverySuggests(String title, String text, int value) {
        deliverySuggestTitle.get(value).shouldHave(Condition.text(title)).should(Condition.visible);
        deliverySuggestText.get(value).shouldHave(Condition.text(text)).should(Condition.visible);
    }

    public void checkDeliveryPrice(int value) {
        deliveryPriceItem.get(value).shouldNot(Condition.empty);
    }
}
