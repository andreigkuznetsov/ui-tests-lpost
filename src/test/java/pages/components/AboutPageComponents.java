package pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AboutPageComponents {

    private final ElementsCollection aboutContactsBlock = $$("div.about-contacts__block");

    public void checkBlockTitleText(String value, String title) {
        String blockTitleText = ".block-title__text";
        $(value + blockTitleText).shouldHave(Condition.text(title)).shouldBe(Condition.visible);
    }

    public void checkAboutContactsBlock(int element) {
        aboutContactsBlock.get(element).shouldNot(Condition.empty);
    }
}
