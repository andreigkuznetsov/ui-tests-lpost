package pages.components.common;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class FooterContents {

    private final SelenideElement footerLogo = $(".footer__logo a"),
            footerCopyright = $(".footer__copyright"),
            labirintLink = $("[href='https://www.labirint.org/']"),
            footerMenuTitle = $(".footer__menu-title"),
            footerMailLink = $(".footer__mail[href='mailto:sales@l-post.ru']"),
            footerTelegramLink = $(".footer__links_item[href='https://t.me/lpostdelivery']"),
            footerVkLink = $(".footer__links_item[href='https://vk.com/lpostdelivery']"),
            footerYouTubeLink = $(".footer__links_item[href='https://www.youtube.com/@lpostdelivery']");

    DropDownMenu dropDownMenu = new DropDownMenu();

    public void checkFooterContents() {
        footerLogo.shouldHave(attribute("href",
                "https://l-post.ru/"));
        footerLogo.shouldBe(Condition.visible);
        footerCopyright.shouldHave(text("© 2023 ООО «Лабиринт-Пост»")).shouldBe(visible);
        labirintLink.shouldHave(text("Холдинг «Лабиринт»")).shouldBe(Condition.visible);
        new MainNavigationMenu().MainNavMenu(".footer__menu-link");
        dropDownMenu.ServicesMenu("footer", 1);
        dropDownMenu.AboutUsMenu("footer", 1);
        footerMenuTitle.shouldHave(text("Контакты")).shouldBe(visible);
        new ContactsMenu().Contacts(".footer__phone");
        footerMailLink.shouldHave(text("sales@l-post.ru")).shouldBe(Condition.visible);
        footerTelegramLink.should(Condition.exist);
        footerVkLink.should(Condition.exist);
        footerYouTubeLink.should(Condition.exist);
    }
}
