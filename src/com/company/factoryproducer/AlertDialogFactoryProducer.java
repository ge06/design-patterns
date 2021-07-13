package com.company.factoryproducer;

import com.company.factory.AlertDialogFactory;
import com.company.factory.MacOSAlertDialogFactory;
import com.company.factory.UbuntuAlertDialogFactory;
import com.company.factory.WindowsAlertDialogFactory;

public class AlertDialogFactoryProducer {

    public static AlertDialogFactory getAlertDialogFactory(int input) {
        if (input == 1) {
            return new MacOSAlertDialogFactory();
        } else if (input == 2) {
            return new UbuntuAlertDialogFactory();
        } else if (input == 3) {
            return new WindowsAlertDialogFactory();
        }
        return null;
    }

}
