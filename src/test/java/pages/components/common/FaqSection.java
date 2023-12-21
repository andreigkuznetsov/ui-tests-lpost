package pages.components.common;

public class FaqSection {

    public void checkFaqSection() {
        new PageTitleAndMainContent().checkPageTitleAndMainContent(".faq-list__title",
                ".faq-list__questions", "Частые вопросы");
    }
}
