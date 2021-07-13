package com.company.windows;

public class UbuntuAlertWindow implements AlertWindow {
    @Override
    public String getTheme() {
        return "Purple";
    }

    @Override
    public String getOS() {
        return "Ubuntu";
    }

    @Override
    public String getMessage() {
        return "You have encountered an error in Ubuntu";
    }
}
