package designpatterns.factory.platform.dropdown;

public class IosDropdown implements Dropdown{
    @Override
    public void getOptions() {
        System.out.println("IOS dropdown");
    }
}
