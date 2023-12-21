package pages;

import io.qameta.allure.Step;
import pages.components.startPage.*;

import static com.codeborne.selenide.Selenide.*;

public class StartPage {

    @Step ("Открываем стартовую страницу сервиса l-post")
    public StartPage openStartPage() {
        open("/");
        return this;
    }

    @Step ("Проверяем отображение виджета отслеживания посылок")
    public StartPage checkTrackingWidget() {
        new TrackingWidget().checkSmallTrackWidget();
        return this;
    }

    @Step ("Проверяем отображение виджета калькулятора")
    public StartPage checkCalcWidget() {
        new CalcWidget().checkSmallCalcWidget();
        return this;
    }

    @Step ("Проверяем отображение краткого описания преимуществ компании")
    public StartPage checkAdvantagesSection() {
        new AdvantagesSection().checkAdvantSection();
        return this;
    }

    @Step ("Проверяем отображение краткого описания услуг компании")
    public StartPage checkHowWorkSection() {
        new HowWorkSection().checkHowWorkSection();
        return this;
    }

    @Step ("Проверяем отображение краткого описания услуг для юрлиц")
    public StartPage checkServicesSection() {
        new ServicesSection().checkServicesSection();
        return this;
    }

    @Step ("Проверяем отображение секции с отзывами клиентов")
    public StartPage checkReviewsSection() {
        new ReviewsSection().checkReviewsSection();
        return this;
    }
}

