package edu.wctc;

import java.util.Scanner;

public class Main {

//    first name
//    middle initial
//    last name
//    year, month, and day of birth
//    gender code (M or F)
public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter First Name");
    String firstName = keyboard.next().toUpperCase();

    System.out.println("Enter Middle Initial");
    String middleInitial = keyboard.next();

    System.out.println("Enter Last Name");
    String lastName = keyboard.next().toUpperCase();

    System.out.println("Enter Birth Year");
    int year = Integer.parseInt(keyboard.next());

    System.out.println("Enter birth month");
    int month = Integer.parseInt(keyboard.next());

    System.out.println("Enter Enter birth day");
    int day = Integer.parseInt(keyboard.next());

    System.out.println("Enter Gender M/F");
    char genderCode = keyboard.next().charAt(0);

    try {
        //create license objects
        DriversLicense driversLicense = new DriversLicense();

        //create utilities and formatters
        MonthDayGenderUtility dayUtility = new MonthDayGenderUtility();
        LastNameUtility lastNameUtility = new LastNameUtility();
        WisconsinFormatter wisconsinFormatter = new WisconsinFormatter();
        FloridaFormatter floridaFormatter = new FloridaFormatter();
        FirstNameUtility firstNameUtility = new FirstNameUtility();

        //use utilities
        int ddd = dayUtility.encodeMonthDayGender(year, month, day, genderCode);
        int FFF = firstNameUtility.encodeFirstName(firstName, middleInitial);
        String ssss = lastNameUtility.encodeLastName(lastName);

        //set fields
        driversLicense.setDDD(ddd);
        driversLicense.setFFF(FFF);
        driversLicense.setSSSS(ssss);
        driversLicense.setYY(year);


        //call formatters
        String formattedWisconsin = wisconsinFormatter.formatLicenseNumber(driversLicense);
        String formattedFlorida = floridaFormatter.formatLicenseNumber(driversLicense);

        System.out.println(formattedFlorida);
        System.out.println(formattedWisconsin);

    } catch (Exception e) {
        e.printStackTrace();
    }
}


}
