package edu.wctc;

public class UnknownGenderCodeException extends Exception{
    public UnknownGenderCodeException(char genderCode) {
        super(String.format("%d gender code is not known", genderCode));
    }
}
