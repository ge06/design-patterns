package com.company.factory;

import com.company.buttons.AlertButton;
import com.company.buttons.WindowsAlertButton;
import com.company.windows.AlertWindow;
import com.company.windows.WindowsAlertWindow;

public class WindowsAlertDialogFactory implements AlertDialogFactory {
    @Override
    public AlertButton getAlertButton() {
        return new WindowsAlertButton();
    }

    @Override
    public AlertWindow getAlertWindow() {
        return new WindowsAlertWindow();
    }
}
