package helpers;


import com.codeborne.selenide.Configuration;
import config.Project;

public class DriverSettings {

    public static void configure() {
        Configuration.browser = Project.config.browser();
        Configuration.browserSize = "1920x1080";
    }
}
