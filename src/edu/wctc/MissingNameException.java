package edu.wctc;

public class MissingNameException extends Exception{
    public MissingNameException(String nameType) {
        super(String.format("%d may not be blank", nameType));
    }

    public MissingNameException() {

    }
}
