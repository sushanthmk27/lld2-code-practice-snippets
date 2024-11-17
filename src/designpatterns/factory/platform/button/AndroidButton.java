package designpatterns.factory.platform.button;

import java.awt.*;

public class AndroidButton implements Button {
    @Override
    public void click() {
        System.out.println("Clicked Android Button");
    }
}
