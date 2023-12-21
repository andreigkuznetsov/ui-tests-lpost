package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class NewsPage {

    private final SelenideElement titleText = $("h1.block-title__text"),
                            pageNewsList = $("div.news.page-news__list");

    @Step("Открываем страницу Новости")
    public NewsPage openNewsPage() {
        open("/news");
        titleText.shouldHave(Condition.text("Новости")).shouldBe(Condition.visible);
        pageNewsList.shouldNot(Condition.empty);
        return this;
    }
}
