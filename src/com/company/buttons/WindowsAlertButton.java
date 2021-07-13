package com.company.buttons;

public class WindowsAlertButton implements AlertButton {
    @Override
    public String getFont() {
        return "Arial";
    }

    @Override
    public String getFontColor() {
        return "Black";
    }

    @Override
    public String getBackgroundColor() {
        return "Light Grey";
    }

    @Override
    public String getOS() {
        return "Microsoft Windows";
    }
}
