package com.company.factory;

import com.company.buttons.AlertButton;
import com.company.windows.AlertWindow;

public interface AlertDialogFactory {
    AlertButton getAlertButton();
    AlertWindow getAlertWindow();
}
