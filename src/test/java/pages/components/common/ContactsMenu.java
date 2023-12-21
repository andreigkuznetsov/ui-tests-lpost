package pages.components.common;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ContactsMenu {

    public void Contacts(String selector) {
        String telContactLink = "[href='tel:88007001006']",
                telSalesLink = "[href='tel:88006008244']";

        $(selector + telContactLink).shouldHave(text("8 800 700-10-06")).shouldBe(Condition.visible);
        $(selector + telContactLink).shouldHave(text("контакт-центр")).shouldBe(Condition.visible);
        $(selector + telSalesLink).shouldHave(text("8 800 600-82-44")).shouldBe(Condition.visible);
        $(selector + telSalesLink).shouldHave(text("отдел продаж")).shouldBe(Condition.visible);
    }
}
