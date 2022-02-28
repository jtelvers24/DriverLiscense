package edu.wctc;

public class FloridaFormatter {
    public String formatLicenseNumber(DriversLicense driversLicense){


        String florida = String.format("%s-%d-%d-%d",
                driversLicense.getSSSS(),
                driversLicense.getFFF(),
                driversLicense.getYY(),
                driversLicense.getDDD());
    return florida;
    }
}
