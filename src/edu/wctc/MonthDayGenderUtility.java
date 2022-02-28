package edu.wctc;

public class MonthDayGenderUtility {
    private final int MOD_MALE = 0;
    private final int MOD_FEMALE = 500;
    private final char CODE_MALE = 'M';
    private final char CODE_FEMALE = 'F';

    public int encodeMonthDayGender(int year, int month, int day, char genderCode) throws UnknownGenderCodeException, InvalidbirthdayException{
        int ddd = 0;
        if (genderCode == ('M')){
            ddd = (month - 1) *40 + day + MOD_MALE;
        }else if ( genderCode == 'F'){
            ddd = (month - 1) * 40 + day + MOD_FEMALE;
        }

        return ddd;
    }
}
