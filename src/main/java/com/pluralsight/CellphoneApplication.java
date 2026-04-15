package com.pluralsight;
import java.util.Scanner;

public class CellphoneApplication {
    public static void main(String[] args) {

        // - User input request
        Scanner input = new Scanner(System.in);
        CellPhone cellPhone = new CellPhone();


        //------------------------------------------------------------------------------------



        // - Serial Number (ex: 1000000 - 9999999)
        cellPhone.setSerialNumber(1234567);
        System.out.println("Current Serial number: " + cellPhone.getSerialNumber());

        //-- Ask if they changed their serial number
        System.out.print("Do you have a new serial number (y/n)?: ");
        String serialNumberAnswer = input.nextLine().trim().toLowerCase();

        if (serialNumberAnswer.equals("y") || serialNumberAnswer.equals("yes")) {
            System.out.print("Enter new serial number: ");
            int newSerialNumber = input.nextInt();
            input.nextLine();
            cellPhone.setSerialNumber(newSerialNumber);
            System.out.println("serial number has been changed to: " + cellPhone.getSerialNumber());
        } else {
            System.out.println("serial number unchanged: " + cellPhone.getSerialNumber());
        }


        //------------------------------------------------------------------------------------

        // - Model (ex: iPhone 17)
        cellPhone.setModel("Samsung Galaxy 26 Ultra");
        System.out.println("Current model: " + cellPhone.getModel());

        // -- Ask if they changed their phone
        System.out.print("Did you change your phone (y/n)?: ");
        String modelAnswer = input.nextLine().trim().toLowerCase();

        if (modelAnswer.equals("y") || modelAnswer.equals("yes")) {
            // user said yes --> ask for the new model
            System.out.print("Enter your new model: ");
            String newModel = input.nextLine().trim();
            cellPhone.setModel(newModel);
            System.out.println("Model has been updated to: " + cellPhone.getModel());
        } else {
            // user said no --> keep current
            System.out.println("Model unchanged: " + cellPhone.getModel());
        }


        //------------------------------------------------------------------------------------


        // - Carrier (ex: AT&T)
        cellPhone.setCarrier("AT&T");
        System.out.println("Current carrier: " + cellPhone.getCarrier());

        // -- Ask if they want to change their carrier
        System.out.println("keep current carrier (y/n): ");
        String carrierAnswer = input.nextLine().trim().toLowerCase();

        if (carrierAnswer.equals("y") || carrierAnswer.equals("yes")) {
            System.out.println("Carrier unchanged " + cellPhone.getCarrier());
        }  else {
            // -- Ask for new carrier
            System.out.println("Enter new carrier: ");
            String newCarrier = input.nextLine().trim();
            cellPhone.setCarrier(newCarrier);
            System.out.println("Carrier has been updated to: " + cellPhone.getCarrier());
        }


        //------------------------------------------------------------------------------------


        // - Phone Number (ex: 800-555-5555)
        cellPhone.setPhoneNumber("800-555-5555");
        System.out.println("Current phone: " + cellPhone.getPhoneNumber());

        // -- Ask weather to keep current phone number
        System.out.println("Keep current number (y/n): ");
        String answer = input.nextLine().trim().toLowerCase();

        if (answer.equals("y") || answer.equals("yes")) {
            System.out.println("Phone number unchanged " + cellPhone.getPhoneNumber());
        } else {
            // -- Ask for the new phone number and set it
            System.out.println("Enter new phone number: ");
            String newNumber = input.nextLine().trim();
            cellPhone.setPhoneNumber(newNumber);
            System.out.println("Phone number has been updated to: " + cellPhone.getPhoneNumber());
        }


        //------------------------------------------------------------------------------------


        // - Owner (ex:Dana Wyatt)
        cellPhone.setOwner("Robert Sarmineto");

        System.out.println(cellPhone.getSerialNumber());
        System.out.println(cellPhone.getModel());
        System.out.println(cellPhone.getCarrier());
        System.out.println(cellPhone.getPhoneNumber());
        System.out.println(cellPhone.getOwner());
    }
}
