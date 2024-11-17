package designpatterns.factory.platform;

public class IosPlatfrom implements Platform{
    @Override
    public void setRefreshRate() {

    }

    @Override
    public void setTheme() {

    }

    public UIComponentFactory createUiComponentFactory(){
        return new IosUiComponentFactory();
    }

}
