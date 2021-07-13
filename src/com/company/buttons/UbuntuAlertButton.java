package com.company.buttons;

public class UbuntuAlertButton implements AlertButton {
    @Override
    public String getFont() {
        return "Ubuntu Bold";
    }

    @Override
    public String getFontColor() {
        return "Yellow";
    }

    @Override
    public String getBackgroundColor() {
        return "Purple";
    }

    @Override
    public String getOS() {
        return "Ubuntu";
    }
}
