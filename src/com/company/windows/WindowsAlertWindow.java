package com.company.windows;

public class WindowsAlertWindow implements AlertWindow {
    @Override
    public String getTheme() {
        return "Light";
    }

    @Override
    public String getOS() {
        return "Microsoft Windows";
    }

    @Override
    public String getMessage() {
        return "You have encountered an error in Windows";
    }
}
