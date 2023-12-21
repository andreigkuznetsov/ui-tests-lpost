package pages.components.startPage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ReviewsSection {

    private final SelenideElement reviewsSection = $("section.reviews");

    public void checkReviewsSection() {
        reviewsSection.shouldHave(text("ОТЗЫВЫ ПАРТНЕРОВ")).shouldBe(Condition.visible);
    }
}
