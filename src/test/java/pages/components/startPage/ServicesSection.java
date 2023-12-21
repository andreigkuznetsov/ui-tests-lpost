package pages.components.startPage;

import pages.components.commonSections.PageTitleAndMainContent;

public class ServicesSection {

    public void checkServicesSection() {
        new PageTitleAndMainContent().checkPageTitleAndMainContent("section.services",
                "div.services__services-container", "УСЛУГИ ДЛЯ ЮРИДИЧЕСКИХ ЛИЦ");
    }
}
