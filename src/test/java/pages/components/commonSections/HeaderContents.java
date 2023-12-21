package pages.components.commonSections;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class HeaderContents {

    private final SelenideElement headerLogo = $(".header__logo a"),
                headerFeedbackFormLink = $(".header__item-link[href='/#feedback-form']"),
                headerLoginLink = $(".header__item-link[href='/l-cabinet/login']");

    public void checkHeaderContents() {
        headerLogo.shouldHave(attribute("href",
                "https://l-post.ru/"));
        headerLogo.shouldBe(Condition.visible);
        headerFeedbackFormLink.shouldHave(text("Стать партнером")).shouldBe(Condition.visible);
        new ContactsMenu().Contacts(".header__item-link");
        headerLoginLink.shouldHave(text("Кабинет партнера")).shouldBe(Condition.visible);

    }
}
