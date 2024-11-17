package designpatterns.factory.platform.dropdown;

public class AndroidDropdown implements Dropdown{
    @Override
    public void getOptions() {
        System.out.println("Android dropdown");
    }
}
