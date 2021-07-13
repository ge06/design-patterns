package com.company.buttons;

public class MacOSAlertButton implements AlertButton{
    @Override
    public String getFont() {
        return "Apple Casual Regular";
    }

    @Override
    public String getFontColor() {
        return "White";
    }

    @Override
    public String getBackgroundColor() {
        return "Blue";
    }

    @Override
    public String getOS() {
        return "MacOS";
    }
}
