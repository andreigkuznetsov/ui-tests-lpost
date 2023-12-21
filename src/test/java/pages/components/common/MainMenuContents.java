package pages.components.common;

public class MainMenuContents {

    DropDownMenu dropDownMenu = new DropDownMenu();
    MainNavigationMenu mainNavMenu = new MainNavigationMenu();

    public void checkMainMenuContents() {
        mainNavMenu.MainNavMenu(".header__menu-link");
        dropDownMenu.ServicesMenu("header", 4);
        dropDownMenu.AboutUsMenu("header", 5);

    }
}
