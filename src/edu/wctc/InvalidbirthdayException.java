package edu.wctc;

public class InvalidbirthdayException extends Exception {
    public InvalidbirthdayException(int year, int month, int day){
        super(String.format("%d/%d/%d is not a valid date", month, day, year));

    }


}
