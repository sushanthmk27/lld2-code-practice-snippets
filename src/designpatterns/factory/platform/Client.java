package designpatterns.factory.platform;

import designpatterns.factory.PlatformFactory;
import designpatterns.factory.platform.button.AndroidButton;
import designpatterns.factory.platform.button.Button;
import designpatterns.factory.platform.dropdown.Dropdown;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);


    public static Platform getPlatforn(){
        return null;
    }

    public static void main(String[] args){

/*        Button b;
        if(p instanceof AndroidPlatform){
            b = new AndroidButton();
        }*/

        //Platform p = getPlatforn();
        String platformName = scanner.nextLine();
        Platform p = PlatformFactory.getPlatformByName(platformName);

        UIComponentFactory uiComponentFactory = p.createUiComponentFactory();
        Button b = uiComponentFactory.createButton();
        b.click();

        Dropdown d = uiComponentFactory.createDropdown();
        d.getOptions();
    }
}
