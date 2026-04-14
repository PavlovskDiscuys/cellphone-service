package com.pluralsight;
import java.util.Scanner;

public class CellphoneApplication {
    public static void main(String[] args) {

        // - User input request
        Scanner input = new Scanner(System.in);

        // - Serial Number (ex: 1000000 - 9999999)
        CellPhone cellPhone = new CellPhone();
        cellPhone.setSerialNumber(1234567);

        // - Model (ex: iPhone 17)
        cellPhone.setModel("Samsung Galaxy 26 Ultra");

        // - Carrier (ex: AT&T)
        cellPhone.setCarrier("AT&T");

        // - Phone Number (ex: 800-555-5555)
        cellPhone.setPhoneNumber("800-555-5555");

        // Holding ------
        //System.out.println("What is your phone number?");
        //int phoneNumber = input.nextInt();

        // - Owner (ex:Dana Wyatt)
        cellPhone.setOwner("Robert Sarmineto");

        System.out.println(cellPhone.getSerialNumber());
        System.out.println(cellPhone.getModel());
        System.out.println(cellPhone.getCarrier());
        System.out.println(cellPhone.getPhoneNumber());
        System.out.println(cellPhone.getOwner());
    }
}
