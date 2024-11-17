package designpatterns.factory.platform;

import designpatterns.factory.platform.button.Button;
import designpatterns.factory.platform.dropdown.Dropdown;
import designpatterns.factory.platform.menu.Menu;

public interface Platform {

    void setRefreshRate();
    void setTheme();


/*    Button  createButton();
    Dropdown createDropdown();
    Menu createMenu();*/

    UIComponentFactory createUiComponentFactory();


}
