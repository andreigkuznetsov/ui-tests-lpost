package pages.components.commonSections;

import io.qameta.allure.Step;

public class CommonSections {

    @Step("Проверяем ссылки и отображение в header страницы")
    public CommonSections checkHeaderContent() {
        new HeaderContents().checkHeaderContents();
        return this;
    }

    @Step ("Проверяем ссылки и отображение в главном меню")
    public CommonSections checkMainMenuContent() {
        new MainMenuContents().checkMainMenuContents();
        return this;
    }

    @Step ("Проверяем отображение секции с формой для отправки заявки на заключение договора")
    public CommonSections checkContactsSection() {
        new BecomePartnerSection().checkBecomePartnerSection();
        return this;
    }

    @Step ("Проверяем отображение секции с данными для получения доп информации")
    public CommonSections checkMoreQuestionsSection() {
        new MoreQuestionsSection().checkMoreQuestionsSection();
        return this;
    }

    @Step ("Проверяем ссылки и отображение в footer страницы")
    public CommonSections checkFooterContent() {
        new FooterContents().checkFooterContents();
        return this;
    }

    @Step ("Проверяем отображение секции с частыми вопросами")
    public CommonSections checkFaqSection() {
        new FaqSection().checkFaqSection();
        return this;
    }
}
