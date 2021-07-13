package com.company.factory;

import com.company.buttons.AlertButton;
import com.company.buttons.UbuntuAlertButton;
import com.company.windows.AlertWindow;
import com.company.windows.UbuntuAlertWindow;

public class UbuntuAlertDialogFactory implements AlertDialogFactory{
    @Override
    public AlertButton getAlertButton() {
        return new UbuntuAlertButton();
    }

    @Override
    public AlertWindow getAlertWindow() {
        return new UbuntuAlertWindow();
    }
}
