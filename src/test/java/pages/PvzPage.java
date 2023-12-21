package pages;

import com.codeborne.selenide.Condition;
import pages.components.PvzSearch;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PvzPage {

    public PvzPage openPvzPage() {
        open("/map");
        $(withText("Пункты выдачи Л-Пост")).should(Condition.exist);
        return this;
    }

    public PvzPage checkPvzPage(String city) {
        new PvzSearch().checkPvzSearch(city);
        return this;
    }
}
