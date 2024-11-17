package designpatterns.factory.platform.button;

public class IosButton implements Button{
    @Override
    public void click() {
        System.out.println("Clicked IOS Button");
    }
}
