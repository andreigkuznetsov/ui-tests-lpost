package pages.components.common;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DropDownMenu {

    private final SelenideElement baseDropdownEcomLink = $(".base-dropdown__link[href='/e-commerce']"),
            baseDropdownPosDeliveryLink = $(".base-dropdown__link[href='/e-commerce/dostavka-posylok']"),
            baseDropdownDocDeliveryLink = $(".base-dropdown__link[href='/e-commerce/dostavka-dokumentov']"),
            baseDropdownAboutLink = $(".base-dropdown__link[href='/about']"),
            baseDropdownNewsLink = $(".base-dropdown__link[href='/news']"),
            baseDropdownReviewsLink = $(".base-dropdown__link[href='/reviews']"),
            baseDropdownVacanciesLink = $(".base-dropdown__link[href='/vacancies']"),
            menuTitleEcom = $(withText("Для интернет-магазинов")),
            menuTitlePosDelivery = $(withText("Доставка посылок")),
            menuTitleDocDelivery = $(withText("Доставка документов")),
            menuTitleAbouCompany = $(withText("О компании")),
            menuTitleNews = $(withText("Новости")),
            menuTitleReviews = $(withText("Отзывы")),
            menuTitleVacancies = $(withText("Вакансии"));

    public void ServicesMenu(String selector, int value) {
        final ElementsCollection menuItem = $$("li." + selector + "__menu-item");

        menuItem.get(value).$(byText("Услуги")).click();
        baseDropdownEcomLink.should(Condition.exist);
        menuTitleEcom.should(Condition.exist);
        baseDropdownPosDeliveryLink.should(Condition.exist);
        menuTitlePosDelivery.should(Condition.exist);
        baseDropdownDocDeliveryLink.should(Condition.exist);
        menuTitleDocDelivery.should(Condition.exist);
        menuItem.get(value).$(byText("Услуги")).click();
    }

    public void AboutUsMenu(String selector, int value) {
        final ElementsCollection menuItem = $$("li." + selector + "__menu-item");

        menuItem.get(value).$(byText("О нас")).click();
        baseDropdownAboutLink.should(Condition.exist);
        menuTitleAbouCompany.should(Condition.exist);
        baseDropdownNewsLink.should(Condition.exist);
        menuTitleNews.should(Condition.exist);
        baseDropdownReviewsLink.should(Condition.exist);
        menuTitleReviews.should(Condition.exist);
        baseDropdownVacanciesLink.should(Condition.exist);
        menuTitleVacancies.should(Condition.exist);
        menuItem.get(value).$(byText("О нас")).click();
    }
}
