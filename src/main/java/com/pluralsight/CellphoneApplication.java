package com.pluralsight;
import java.util.Scanner;

public class CellphoneApplication {
    public static void main(String[] args) {

        // - User input request
        Scanner input = new Scanner(System.in);
        CellPhone cellPhone = new CellPhone();

        // - Serial Number (ex: 1000000 - 9999999)
        cellPhone.setSerialNumber(1234567);
        System.out.println("Current Serial number: ");

        // - Model (ex: iPhone 17)
        cellPhone.setModel("Samsung Galaxy 26 Ultra");
        System.out.println("Current model: " + cellPhone.getModel());

        // - Carrier (ex: AT&T)
        cellPhone.setCarrier("AT&T");
        System.out.println("Current carrier: " + cellPhone.getCarrier());



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


        // - Owner (ex:Dana Wyatt)
        cellPhone.setOwner("Robert Sarmineto");

        System.out.println(cellPhone.getSerialNumber());
        System.out.println(cellPhone.getModel());
        System.out.println(cellPhone.getCarrier());
        System.out.println(cellPhone.getPhoneNumber());
        System.out.println(cellPhone.getOwner());
    }
}
