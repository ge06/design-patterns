package com.company.factory;

import com.company.buttons.AlertButton;
import com.company.buttons.MacOSAlertButton;
import com.company.windows.AlertWindow;
import com.company.windows.MacOSAlertWindow;

public class MacOSAlertDialogFactory implements AlertDialogFactory {
    @Override
    public AlertButton getAlertButton() {
        return new MacOSAlertButton();
    }

    @Override
    public AlertWindow getAlertWindow() {
        return new MacOSAlertWindow();
    }
}
