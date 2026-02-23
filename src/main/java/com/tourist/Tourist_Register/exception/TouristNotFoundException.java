package com.tourist.Tourist_Register.exception;


public class TouristNotFoundException extends RuntimeException{

    public TouristNotFoundException(){
        super();
    }

    public TouristNotFoundException(String message){
        super(message);
    }
}
