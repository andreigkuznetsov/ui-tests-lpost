package pages.components.common;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class BecomePartnerSection {

    private final SelenideElement feedbackFormWrapper = $("div.feedback__form-wrapper");

    public void checkBecomePartnerSection() {
        new PageTitleAndMainContent().checkPageTitleAndMainContent("section.feedback",
                "p.feedback__subtitle.feedback__subtitle_white", "СТАТЬ ПАРТНЕРОМ");
        feedbackFormWrapper.shouldNot(Condition.empty);

    }
}
