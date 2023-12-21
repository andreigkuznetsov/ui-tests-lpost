package pages.components.common;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class PageTitleAndMainContent {

    public void checkPageTitleAndMainContent(String selectorTitle, String selectorContent, String title) {
        $(selectorTitle).shouldHave(Condition.text(title)).shouldBe(Condition.visible);
        $(selectorContent).shouldNot(Condition.empty);
    }

    public void checkPageTitleAndVisibleContent(String selectorTitle, String selectorContent, String title) {
        $(selectorTitle).shouldHave(Condition.text(title)).shouldBe(Condition.visible);
        $(selectorContent).shouldBe(Condition.visible);
    }
}
