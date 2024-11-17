package designpatterns.factory.platform;

import designpatterns.factory.platform.button.Button;
import designpatterns.factory.platform.dropdown.Dropdown;
import designpatterns.factory.platform.menu.Menu;

public interface UIComponentFactory {
    Button createButton();
    Dropdown createDropdown();
    Menu createMenu();
}
