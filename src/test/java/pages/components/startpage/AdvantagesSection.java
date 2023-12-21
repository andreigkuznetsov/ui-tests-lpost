package pages.components.startpage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.components.common.PageTitleAndMainContent;

import static com.codeborne.selenide.Selenide.$;

public class AdvantagesSection {

    private final SelenideElement advantagesList = $("ul.advantages__list");

    public void checkAdvantSection() {
        new PageTitleAndMainContent().checkPageTitleAndMainContent("section.advantages",
                "div.advantages__container", "СЛУЖБА ДОСТАВКИ Л-ПОСТ");
        advantagesList.shouldNot(Condition.empty);
    }
}
