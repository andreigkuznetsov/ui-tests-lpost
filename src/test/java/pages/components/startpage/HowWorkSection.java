package pages.components.startpage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.components.common.PageTitleAndMainContent;

import static com.codeborne.selenide.Selenide.$;

public class HowWorkSection {

    private final SelenideElement howWorkContainer = $("div.how-work__container");

    public void checkHowWorkSection() {
        new PageTitleAndMainContent().checkPageTitleAndMainContent("section.how-work",
                "ul.how-work__list.how-work__list_margin", "КАК МЫ РАБОТАЕМ");
        howWorkContainer.shouldNot(Condition.empty);
    }
}
