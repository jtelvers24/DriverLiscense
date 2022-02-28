package edu.wctc;

public class WisconsinFormatter {
    public String formatLicenseNumber(DriversLicense driversLicense) {

        String Wisconsin = String.format("%s-%s-%s-%x",
                driversLicense.getSSSS(),
                driversLicense.getFFF() + this.yearSplitter(driversLicense.getYY(), 1),
                this.yearSplitter(driversLicense.getYY(), 2) + driversLicense.getDDD(),
                driversLicense.getNN());

        return Wisconsin;
    }

    public String yearSplitter(int year, int digit){
        String stringValue = String.valueOf(year);

        if (stringValue.length() == 1) {
            stringValue = "0" + stringValue;
        }
        return stringValue.substring(digit -1 , digit);
    }
}
