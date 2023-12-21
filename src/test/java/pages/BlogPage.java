package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BlogPage {

    private final SelenideElement titleText = $("h1.block-title__text"),
                        blogMainBlock = $("div.blog__main-block"),
                        blogArticleList = $("div.blog__article-list");

    @Step("Открываем страницу Блог")
    public BlogPage openBlogPage() {
        open("/blog");
        titleText.shouldHave(Condition.text("Блог")).shouldBe(Condition.visible);
        blogMainBlock.shouldNot(Condition.empty);
        blogArticleList.shouldNot(Condition.empty);
        return this;
    }
}
