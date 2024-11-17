package designpatterns.factory.platform;

import designpatterns.factory.platform.button.AndroidButton;
import designpatterns.factory.platform.button.Button;
import designpatterns.factory.platform.dropdown.AndroidDropdown;
import designpatterns.factory.platform.dropdown.Dropdown;
import designpatterns.factory.platform.menu.AndroidMenu;
import designpatterns.factory.platform.menu.Menu;

public class AndroidUiComponentFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
