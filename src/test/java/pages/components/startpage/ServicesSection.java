package pages.components.startpage;

import pages.components.common.PageTitleAndMainContent;

public class ServicesSection {

    public void checkServicesSection() {
        new PageTitleAndMainContent().checkPageTitleAndMainContent("section.services",
                "div.services__services-container", "УСЛУГИ ДЛЯ ЮРИДИЧЕСКИХ ЛИЦ");
    }
}
