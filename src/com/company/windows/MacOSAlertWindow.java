package com.company.windows;

public class MacOSAlertWindow implements AlertWindow {
    @Override
    public String getTheme() {
        return "Dark";
    }

    @Override
    public String getOS() {
        return "MacOS";
    }

    @Override
    public String getMessage() {
        return "You have encountered an error in MacOS";
    }
}
