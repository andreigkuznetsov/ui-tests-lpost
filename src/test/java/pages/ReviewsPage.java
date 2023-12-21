package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ReviewsPage {

    private final SelenideElement titleText = $("h1.block-title__text"),
                            pageReviewsList = $("div.reviews-page__list");

    @Step("Открываем страницу Отзывы")
    public ReviewsPage openReviewsPage() {
        open("/reviews");
        titleText.shouldHave(Condition.text("Отзывы партнеров")).shouldBe(Condition.visible);
        pageReviewsList.shouldNot(Condition.empty);
        return this;
    }
}
