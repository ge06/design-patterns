package com.company;

import com.company.buttons.AlertButton;
import com.company.factory.AlertDialogFactory;
import com.company.factoryproducer.AlertDialogFactoryProducer;
import com.company.windows.AlertWindow;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AlertDialogFactory alertDialogFactory;
        AlertWindow alertWindow;
        AlertButton alertButton;
        while(true) {
            System.out.println("Select one of the operation systems below: ");
            System.out.println("1 for MacOS");
            System.out.println("2 for Ubuntu");
            System.out.println("3 for Windows");
            System.out.println("4 for break the application");
            int input = scanner.nextInt();
            if (input == 4) {
                break;
            }
            alertDialogFactory = AlertDialogFactoryProducer.getAlertDialogFactory(input);
            if(alertDialogFactory == null) {
                System.out.println("Invalid input given. Try again.");
                continue;
            }
            alertButton = alertDialogFactory.getAlertButton();
            alertWindow = alertDialogFactory.getAlertWindow();
            showAlert(alertButton, alertWindow);
        }
        scanner.close();
    }

    private static void showAlert(AlertButton alertButton, AlertWindow alertWindow) {
        System.out.println("ALERT DIALOG");
        System.out.println("Showing alert window for " + alertWindow.getOS());
        System.out.println("Message: " + alertWindow.getMessage());
        System.out.println("Theme: " + alertWindow.getTheme());
        System.out.println("----------------------------------------------------");
        System.out.println("Showing alert buttons for " + alertButton.getOS());
        System.out.println("Font: " + alertButton.getFont());
        System.out.println("Font Color: " + alertButton.getFontColor());
        System.out.println("Background Color: " + alertButton.getBackgroundColor());
        System.out.println("*****************************************************");
    }

    public String asd() {
        return "asd";
    }
}
