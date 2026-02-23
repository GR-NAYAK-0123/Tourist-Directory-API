package com.tourist.Tourist_Register.error;


public class TouristNotFoundException extends RuntimeException{

    public TouristNotFoundException(){
        super();
    }

    public TouristNotFoundException(String message){
        super(message);
    }
}
