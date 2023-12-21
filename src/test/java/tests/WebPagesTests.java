package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;
import pages.components.commonSections.CommonSections;

import static data.TestData.*;

@DisplayName("Тесты на проверку веб-сайта сервиса l-post")
@Tag("all-tests")
public class WebPagesTests extends TestBase {

    StartPage startPage = new StartPage();
    CommonSections commonSections = new CommonSections();
    TrackingPage trackingPage = new TrackingPage();
    CalcPage calcPage = new CalcPage();
    PvzPage pvzPage = new PvzPage();
    EcomDeliveryPage ecomDeliveryPage = new EcomDeliveryPage();
    AboutPage aboutPage = new AboutPage();
    SupportPage supportPage = new SupportPage();
    DevelopersPage developersPage = new DevelopersPage();

    @DisplayName("Проверка главной страницы")
    @Tag("smoke-tests")
    @Test
    void startPageTests() {
        startPage.openStartPage();
        commonSections.checkHeaderContent()
                      .checkMainMenuContent();
        startPage.checkTrackingWidget()
                 .checkCalcWidget()
                 .checkAdvantagesSection()
                 .checkHowWorkSection()
                 .checkServicesSection()
                 .checkReviewsSection();
        commonSections.checkContactsSection()
                      .checkMoreQuestionsSection()
                      .checkFooterContent();
    }

    @DisplayName("Проверка страницы с отслеживанием посылки и выполнение отслеживания")
    @Tag("smoke-tests")
    @Test
    void trackingPageTests() {
        trackingPage.openTrackingPage();
        commonSections.checkHeaderContent()
                      .checkMainMenuContent()
                      .checkFaqSection()
                      .checkFooterContent();
        trackingPage.checkTrackingPage(TRACK_NUMBER, DELIVERY_STATUS);
    }

    @DisplayName("Проверка страницы с калькулятором и выполнение расчета стоимости перевозки")
    @Tag("smoke-tests")
    @Test
    void calcPageTests() {
        calcPage.openCalcPage();
        commonSections.checkHeaderContent()
                .checkMainMenuContent()
                .checkContactsSection()
                .checkMoreQuestionsSection()
                .checkFooterContent();
        calcPage.checkCalcPage(CITY_FROM, CITY_TO, PARCEL_WEIGHT);
    }

    @DisplayName("Проверка страницы и поиск ПВЗ в указанном городе")
    @Tag("smoke-tests")
    @Test
    void pvzPageTests() {
        pvzPage.openPvzPage();
        commonSections.checkHeaderContent()
                .checkMainMenuContent();
        pvzPage.checkPvzPage(CITY_FROM);
        commonSections.checkFaqSection()
                .checkContactsSection()
                .checkMoreQuestionsSection()
                .checkFooterContent();
    }

    @DisplayName("Проверка страницы Тарифы")
    @Tag("regress-tests")
    @Test
    void tariffPageTests() {
        new TariffPage().openTariffPage();
        commonSections.checkHeaderContent()
                .checkMainMenuContent()
                .checkContactsSection()
                .checkMoreQuestionsSection()
                .checkFooterContent();
    }

    @DisplayName("Проверка страницы Для интернет-магазинов")
    @Tag("regress-tests")
    @Test
    void eComDeliveryPageTests() {
        ecomDeliveryPage.openEcomDeliveryPage();
        commonSections.checkHeaderContent()
                      .checkMainMenuContent();
        ecomDeliveryPage.checkDeliverySuggestBlock()
                        .checkBaseAdvantagesSection()
                        .checkGeographyDeliverySection();
        commonSections.checkFaqSection()
                        .checkContactsSection()
                        .checkMoreQuestionsSection()
                        .checkFooterContent();
    }

    @DisplayName("Проверка страницы с информацией о доставке посылок")
    @Tag("regress-tests")
    @Test
    void parcelDeliveryPageTests() {
        new ParcelDeliveryPage().openParcelDeliveryPage();
        commonSections.checkHeaderContent()
                      .checkMainMenuContent()
                      .checkContactsSection()
                      .checkMoreQuestionsSection()
                      .checkFooterContent();
    }

    @DisplayName("Проверка страницы с информацией о доставке документов")
    @Tag("regress-tests")
    @Test
    void documentsDeliveryPageTests() {
        new DocDeliveryPage().openDocDeliveryPage();
        commonSections.checkHeaderContent()
                .checkMainMenuContent()
                .checkContactsSection()
                .checkMoreQuestionsSection()
                .checkFooterContent();
    }

    @DisplayName("Проверка страницы О компании")
    @Tag("regress-tests")
    @Test
    void aboutPageTests() {
        aboutPage.openAboutPage();
        commonSections.checkHeaderContent()
                .checkMainMenuContent();
        aboutPage.checkAboutFactsContent()
                .checkContactContent();
        commonSections.checkFooterContent();
    }

    @DisplayName("Проверка страницы Новости")
    @Tag("regress-tests")
    @Test
    void newsPageTests() {
        new NewsPage().openNewsPage();
        commonSections.checkHeaderContent()
                .checkMainMenuContent()
                .checkFooterContent();
    }

    @DisplayName("Проверка страницы Отзывы")
    @Tag("regress-tests")
    @Test
    void reviewsPageTests() {
        new ReviewsPage().openReviewsPage();
        commonSections.checkHeaderContent()
                .checkMainMenuContent()
                .checkFooterContent();
    }

    @DisplayName("Проверка страницы Вакансии")
    @Tag("regress-tests")
    @Test
    void vacanciesPageTests() {
        new VacanciesPage().openVacanciesPage();
        commonSections.checkHeaderContent()
                .checkMainMenuContent()
                .checkFooterContent();
    }

    @DisplayName("Проверка страницы Блог")
    @Tag("regress-tests")
    @Test
    void blogPageTests() {
        new BlogPage().openBlogPage();
        commonSections.checkHeaderContent()
                .checkMainMenuContent()
                .checkFooterContent();
    }

    @DisplayName("Проверка страницы Акции")
    @Tag("regress-tests")
    @Test
    void promotionPageTests() {
        new PromotionsPage().openPromoPage();
        commonSections.checkHeaderContent()
                .checkMainMenuContent()
                .checkFooterContent();
    }

    @DisplayName("Проверка страницы Поддержка")
    @Tag("regress-tests")
    @Test
    void supportPageTests() {
        supportPage.openSupportPage();
        commonSections.checkHeaderContent()
                .checkMainMenuContent();
        supportPage.checkContactsBlocks();
        commonSections.checkFaqSection()
                .checkContactsSection()
                .checkFooterContent();
    }

    @DisplayName("Проверка страницы Интеграции")
    @Tag("regress-tests")
    @Test
    void devPageTests() {
        developersPage.openDevPage();
        commonSections.checkHeaderContent()
                .checkMainMenuContent();
        developersPage.checkIntegrationVarBlock()
                        .checkLogoVarsBlock();
        commonSections.checkContactsSection()
                .checkMoreQuestionsSection()
                .checkFooterContent();
    }
}

