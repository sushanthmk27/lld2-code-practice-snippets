package designpatterns.factory;

import designpatterns.factory.platform.AndroidPlatform;
import designpatterns.factory.platform.IosPlatfrom;
import designpatterns.factory.platform.Platform;

public class PlatformFactory {

    //** SIMPLE FACTORY **//  //only this is Simple Factory sample
    public static Platform getPlatformByName(String platformName){
        if(platformName.equals("Android")){
            return new AndroidPlatform();
        } else if (platformName.equals("IOS")) {
            return new IosPlatfrom();
        }
        return null;
    }
}
