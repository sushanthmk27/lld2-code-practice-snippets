package designpatterns.factory.platform;

import designpatterns.factory.platform.button.Button;
import designpatterns.factory.platform.button.IosButton;
import designpatterns.factory.platform.dropdown.Dropdown;
import designpatterns.factory.platform.dropdown.IosDropdown;
import designpatterns.factory.platform.menu.IosMenu;
import designpatterns.factory.platform.menu.Menu;

public class IosUiComponentFactory implements UIComponentFactory{

    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IosDropdown();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}
